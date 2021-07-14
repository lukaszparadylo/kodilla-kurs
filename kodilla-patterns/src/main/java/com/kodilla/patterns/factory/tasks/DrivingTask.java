package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    private final String taskName;
    private final String where;
    private final String using;
    private boolean taskExecuted;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.taskExecuted = false;
    }

    @Override
    public void executeTask() {
        this.taskExecuted = true;
        System.out.println("Task was executed: "+this.taskExecuted);
    }

    @Override
    public String getTaskName() {
        return this.taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return this.taskExecuted;
    }
}
