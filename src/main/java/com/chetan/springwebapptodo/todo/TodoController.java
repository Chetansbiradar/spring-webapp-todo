package com.chetan.springwebapptodo.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = "/todos")
    public String showTodos(ModelMap map) {
        List<Todo> todos = todoService.findByUsername("Chetan");
        map.put("todos", todos);
        return "listTodos";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.GET)
    public String showAddTodo(ModelMap map) {
        String username = (String) map.get("name");
        Todo todo = new Todo(
                0,
                username,
                "",
                LocalDate.now(),
                false
        );
        map.put("todo", todo);
        return "add-todo";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.POST)
    public String addTodo(ModelMap map, @Valid Todo todo, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "add-todo";
        }
        String username = (String) map.get("name");
        String description = todo.getDescription();
        todoService.addTodo(username, description, LocalDate.now().plusYears(1), false);
        return "redirect:/todos";
    }
}
