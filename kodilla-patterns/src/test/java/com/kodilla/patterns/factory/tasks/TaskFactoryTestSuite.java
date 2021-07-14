package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.Shape;
import com.kodilla.patterns.factory.ShapeFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.doTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        assertEquals( true, driving.isTaskExecuted());
        assertEquals("Driving", driving.getTaskName());
    }
    @Test
    void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.doTask(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        assertEquals( true, painting.isTaskExecuted());
        assertEquals("Painting", painting.getTaskName());
    }
    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.doTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        //Then
        assertEquals( true, shopping.isTaskExecuted());
        assertEquals("Shopping", shopping.getTaskName());
    }
}
