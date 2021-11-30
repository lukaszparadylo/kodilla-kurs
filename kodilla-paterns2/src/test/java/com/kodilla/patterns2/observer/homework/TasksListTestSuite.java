package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TasksListTestSuite {

    @Test
    public void updateTasks(){
        Mentor mentor1 = new Mentor("Zbyszek");
        Mentor mentor2 = new Mentor("Jacek");
        ToDoObserverList toDoObserverList = new ToDoObserverList();
        InProgressObserverList inProgressObserverList = new InProgressObserverList();
        DoneObserverList doneObserverList = new DoneObserverList();

        toDoObserverList.registerTasksObserver(mentor1);
        toDoObserverList.registerTasksObserver(mentor2);
        inProgressObserverList.registerTasksObserver(mentor2);
        doneObserverList.registerTasksObserver(mentor1);

        toDoObserverList.addTask("Super Task");
        inProgressObserverList.addTask("Super super Task");
        doneObserverList.addTask("Super super super Task");
        doneObserverList.addTask("ssss");

        Assertions.assertEquals(3, mentor1.getUpdateCount());
        Assertions.assertEquals(2,mentor2.getUpdateCount());
    }
}
