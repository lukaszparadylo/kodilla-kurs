package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.dao.TaskDao;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LIST_NAME = "New list";
    private static final String DESCRIPTION_LIST = "This is a list";

    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList(LIST_NAME, DESCRIPTION_LIST);

        //When
        taskListDao.save(taskList);

        //Then
        int duration = taskList.getId();
        Optional<TaskList> readTaskList = taskListDao.findById(duration);
        assertTrue(readTaskList.isPresent());

        //Clean up
        int id = readTaskList.get().getId();
        taskListDao.deleteById(id);
    }
}
