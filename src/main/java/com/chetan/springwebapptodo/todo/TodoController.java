package com.chetan.springwebapptodo.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
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
}
