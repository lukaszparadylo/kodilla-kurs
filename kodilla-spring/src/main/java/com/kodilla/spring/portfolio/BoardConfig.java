package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDoTask")
    TaskList taskList;

    @Bean
    public Board getBoard() {
        return new Board(taskList, getTaskList2(), getTaskList3());
    }

    @Bean(name = "toDoTask")
    @Scope("prototype")
    public TaskList getTaskList1() {
        TaskList taskList = new TaskList();
        taskList.addTask("To do task");
        return taskList;
    }

    @Bean(name = "inProgressTask")
    @Scope("prototype")
    public TaskList getTaskList2() {
        TaskList taskList = new TaskList();
        taskList.addTask("In progress task");
        taskList.addTask("In progress task");
        return taskList;
    }

    @Bean(name = "doneTask")
    @Scope("prototype")
    public TaskList getTaskList3() {
        TaskList taskList = new TaskList();
        taskList.addTask("Done task");
        taskList.addTask("Done task");
        taskList.addTask("Done task");
        return taskList;
    }
}
