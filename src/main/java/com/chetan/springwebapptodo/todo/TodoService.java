package com.chetan.springwebapptodo.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int counter = 3;

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
                counter + 1,
                username,
                description,
                targetDate,
                isDone
        ));
    }

    public void deleteTodoById(int id){
        Predicate<? super Todo> todoPredicate = todo -> todo.getId() == id;
        todos.removeIf(todoPredicate);
    }
}
