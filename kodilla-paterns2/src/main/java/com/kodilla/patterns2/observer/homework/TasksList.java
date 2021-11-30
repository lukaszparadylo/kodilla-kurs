package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

import java.util.ArrayList;
import java.util.List;

public class TasksList implements ObservableTasks{
    private final List<TaskObserver> taskObservers;
    private final String taskMessage;
    private final List<String> taskNote;

    public TasksList(String taskName, String taskDescription) {
        this.taskObservers = new ArrayList<>();
        this.taskMessage = taskName;
        this.taskNote = new ArrayList<>();
    }

    public void addTask(String taskMessage) {
        taskNote.add(taskMessage);
        notifyTasksObservers();
    }
    @Override
    public void registerTasksObserver(TaskObserver taskObserver) {
        taskObservers.add(taskObserver);
    }

    @Override
    public void notifyTasksObservers() {
        for (TaskObserver taskObserver : taskObservers) {
            taskObserver.update(this);
        }
    }

    @Override
    public void removeTasksObserver(TaskObserver taskObserver) {
        taskObservers.remove(taskObserver);
    }

    public String getTaskMessage() {
        return taskMessage;
    }

    public List<String> getTaskNote() {
        return taskNote;
    }
}
