package com.kodilla.patterns2.observer.homework;

public class Mentor implements TaskObserver{
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(TasksList tasksList) {
        System.out.println(username + ": New messages from list " + tasksList.getTaskMessage()  +
                ", You observe " + tasksList.getTaskNote().size() + " tasks");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
