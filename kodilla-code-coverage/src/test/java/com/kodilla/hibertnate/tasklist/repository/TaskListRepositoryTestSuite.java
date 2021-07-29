package com.kodilla.hibertnate.tasklist.repository;


import com.kodilla.hibertnate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTestSuite {
    @Autowired
    private TaskListRepository taskListRepository;

    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    public void testFindByListName() {

        TaskList taskList = new TaskList("Test", DESCRIPTION);
        taskListRepository.save(taskList);
        String listName = taskList.getListName();

        List<TaskList> readTaskList = taskListRepository.findByListName(listName);

        Assert.assertEquals("Test", readTaskList.get(0).getListName());
        Assert.assertEquals(1, readTaskList.size());

        int id = readTaskList.get(0).getId();
        taskListRepository.deleteById(id);

    }
}