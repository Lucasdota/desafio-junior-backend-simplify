package com.lucasdt.desafio_simplify.controllers;

import com.lucasdt.desafio_simplify.entities.Todo;
import com.lucasdt.desafio_simplify.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("todo")
public class TodoController {

    @Autowired
    TodoService todoService;

    @PostMapping
    List<Todo> create(@RequestBody Todo todo) {
        return todoService.create(todo);
    }

    @GetMapping
    List<Todo> list() {
        return todoService.list();
    }

    @PutMapping("{id}")
    Todo update(@PathVariable("id") Long id, @RequestBody Todo todo) {
        return todoService.update(id, todo.getName(), todo.getDescription(), todo.getPriority(), todo.getDone());
    }

    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable("id") Long id) {
        return todoService.delete(id);
    }
}
