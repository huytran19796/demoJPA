package com.example.DemoJPA.entity;

import javax.persistence.*;
import java.util.Set;

// Depedency Injection

@Entity(name = "status")
public class StatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "status")
    private Set<TasksEntity> tasks;

    public Set<TasksEntity> getTasks() {
        return tasks;
    }

    public void setTasks(Set<TasksEntity> tasks) {
        this.tasks = tasks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
