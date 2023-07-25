package com.chetan.springwebapptodo.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(1, "Chetan", "Learn Spring MVC", LocalDate.now().plusYears(1), false) );
        todos.add(new Todo(2, "Chetan", "Learn Struts", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(3, "Chetan", "Learn Hibernate", LocalDate.now().plusYears(1), false));
    }

    public List<Todo> findByUsername(String user) {
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean isDone) {
        todos.add(new Todo(
                todos.size() + 1,
                username,
                description,
                targetDate,
                isDone
        ));
    }
}
