package com.chetan.springwebapptodo.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TodoService {
    private static final List<Todo> todos;

    static {
        todos = List.of(
            new Todo(1, "Chetan", "Learn Spring MVC", LocalDate.now().plusYears(1), false),
            new Todo(2, "Chetan", "Learn Struts", LocalDate.now().plusYears(1), false),
            new Todo(3, "Chetan", "Learn Hibernate", LocalDate.now().plusYears(1), false)
        );
    }

    public List<Todo> findByUsername(String user) {
        return todos;
    }
}
