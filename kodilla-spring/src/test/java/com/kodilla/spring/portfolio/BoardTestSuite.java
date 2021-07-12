package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

@SpringBootTest
public class BoardTestSuite {
    String [] tab = {"task"};

    @Test
    void createNewBoard(){
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        Assertions.assertEquals(board.getToDoList().getTasks().size(), 1);
        Assertions.assertEquals(board.getInProgressList().getTasks().size(), 2);
        Assertions.assertEquals(board.getDoneList().getTasks().size(), 3);

    }

    @Test
    void testTaskAdd(){
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.addToDoTask(tab[0]);
        board.addInProgressTask(tab[0]);
        board.addDoneTask(tab[0]);

        Assertions.assertEquals(board.getToDoList().getTasks().size(), 2);
        Assertions.assertEquals(board.getInProgressList().getTasks().size(), 3);
        Assertions.assertEquals(board.getDoneList().getTasks().size(), 4);

    }

    @Test
    void CreatedBeamsExists(){
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        boolean beamInProgressTask = context.containsBean("inProgressTask");
        boolean beamToDoTask = context.containsBean("toDoTask");
        boolean beamDoneTask = context.containsBean("doneTask");

        Assertions.assertTrue(beamToDoTask);
        Assertions.assertTrue(beamInProgressTask);
        Assertions.assertTrue(beamDoneTask);
    }
}
