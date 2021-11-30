package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

public interface ObservableTasks {
    void registerTasksObserver(TaskObserver taskObserver);
    void notifyTasksObservers();
    void removeTasksObserver(TaskObserver taskObserver);
}
