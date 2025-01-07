package com.lucasdt.desafio_simplify.repositories;

import com.lucasdt.desafio_simplify.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
