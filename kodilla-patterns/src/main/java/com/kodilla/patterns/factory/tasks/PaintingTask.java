package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean taskExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
