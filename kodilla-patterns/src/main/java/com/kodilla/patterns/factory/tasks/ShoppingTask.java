package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    private final String taskName;
    private final String whatToBay;
    private final double quantity;
    private boolean taskExecuted;

    public ShoppingTask(String taskName, String whatToBay, double quantity) {
        this.taskName = taskName;
        this.whatToBay = whatToBay;
        this.quantity = quantity;
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
