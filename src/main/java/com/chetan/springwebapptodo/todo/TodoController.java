package com.chetan.springwebapptodo.todo;

import jakarta.validation.Valid;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
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
        String username = getLoggedInUserName();
        List<Todo> todos = todoService.findByUsername(username);
        map.put("todos", todos);
        return "listTodos";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.GET)
    public String showAddTodo(ModelMap map) {
        String username = getLoggedInUserName();
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
        String username = getLoggedInUserName();
        todoService.addTodo(username, todo.getDescription(), todo.getTargetDate(), false);
        return "redirect:/todos";
    }

    @RequestMapping("/delete-todo")
    public String deleteTodoById(@RequestParam int id) {
        todoService.deleteTodoById(id);
        return "redirect:/todos";
    }

    @RequestMapping(value = "/update-todo", method = RequestMethod.GET)
    public String updateTodoById(@RequestParam int id, ModelMap map) {
        Todo todo = todoService.findTodoById(id);
        map.put("todo", todo);
        return "add-todo";
    }

    @RequestMapping(value = "/update-todo", method = RequestMethod.POST)
    public String updateTodoById(@Valid Todo todo, BindingResult bindingResult, ModelMap map) {
        if(bindingResult.hasErrors()) {
            return "add-todo";
        }
        String username = getLoggedInUserName();
        todo.setUsername(username);
        todoService.updateTodoById(todo);
        return "redirect:/todos";
    }

    private static String getLoggedInUserName() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }
}
