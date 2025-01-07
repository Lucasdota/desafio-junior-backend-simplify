package com.lucasdt.desafio_simplify.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "priority", nullable = false)
    private Integer priority;
    private boolean done;

    public Todo() {}

    public Todo(String name, String description, Integer priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getPriority() {
        return priority;
    }

    public boolean getDone() {
        return done;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
