package com.kodilla.spring.portfolio;

public final class Board {

    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    public Board ( TaskList toDoList, TaskList inProgressList, TaskList doneList){
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public void addToDoTask(String task){
        this.toDoList.addTask(task);
    }

    public void addInProgressTask(String task){
        this.inProgressList.addTask(task);
    }

    public void addDoneTask(String task){
        this.doneList.addTask(task);
    }
}
