package com.lucasdt.desafio_simplify.services;

import com.lucasdt.desafio_simplify.entities.Todo;
import com.lucasdt.desafio_simplify.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    TodoRepository todoRepository;

    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> list() {
        return todoRepository.findAll();
    }

    public Todo update(Long id, String name, String description, boolean done) {
        Optional<Todo> todo = todoRepository.findById(id);
        if (todo.isEmpty()) return null;
        todo.get().setName(name);
        todo.get().setDescription(description);
        todo.get().setDone(done);
        todoRepository.save(todo.get());
        return todo.get();
    }

    public List<Todo> delete(Long id) {
        todoRepository.deleteById(id);
        return list();
    }
}
