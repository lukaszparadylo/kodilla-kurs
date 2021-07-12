package com.kodilla.spring.portfolio;


import java.util.ArrayList;
import java.util.List;

public final class TaskList {
    List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task){
        this.tasks.add(task);
    }

    public List<String> getTasks() {
        return tasks;
    }
}
