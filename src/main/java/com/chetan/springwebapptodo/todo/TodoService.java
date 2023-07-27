package com.chetan.springwebapptodo.todo;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    TodoRepository todoRepository;
//    private static List<Todo> todos = new ArrayList<>();
//    private static int counter = 3;
//
//    static {
//        todos.add(new Todo(1, "Chetan", "Learn Spring MVC", LocalDate.now().plusYears(1), false) );
//        todos.add(new Todo(2, "Chetan", "Learn Struts", LocalDate.now().plusYears(1), false));
//        todos.add(new Todo(3, "Chetan", "Learn Hibernate", LocalDate.now().plusYears(1), false));
//    }

    public List<Todo> findByUsername(String user) {
//        Predicate<? super Todo> todoPredicate = todo -> todo.getUsername().equals(user);
//        return todos.stream().filter(todoPredicate).toList();
        return todoRepository.findByUsername(user);
    }

    public void addTodo(Todo todo) {
//        todos.add(new Todo(
//                counter + 1,
//                username,
//                description,
//                targetDate,
//                isDone
//        ));
        todoRepository.save(todo);
    }

    public void deleteTodoById(int id){
//        Predicate<? super Todo> todoPredicate = todo -> todo.getId() == id;
//        todos.removeIf(todoPredicate);
        todoRepository.deleteById(id);
    }

    public Todo findTodoById(int id) {
//        Predicate<? super Todo> todoPredicate = todo -> todo.getId() == id;
//        return todos.stream().filter(todoPredicate).findFirst().orElse(null);
        return todoRepository.findById(id).orElse(null);
    }

    public void updateTodoById(@Valid Todo todo) {
//        todos.stream().filter(todo1 -> todo1.getId() == todo.getId()).forEach(todo1 -> {
//            todo1.setDescription(todo.getDescription());
//            todo1.setTargetDate(todo.getTargetDate());
//            todo1.setDone(todo.isDone());
//        });
        todoRepository.save(todo);
    }
}
