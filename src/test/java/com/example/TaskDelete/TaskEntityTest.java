package com.example.TaskDelete;

import com.example.TaskDelete.entity.TaskEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskEntityTest {
    @Test
    public  void taskEntityTest()
    {
        TaskEntity task=new TaskEntity(1,"details","details",false,"none",0);
        Assertions.assertEquals(1,task.getId());
        Assertions.assertEquals("details",task.getName());
        Assertions.assertEquals("details",task.getDescription());
        Assertions.assertEquals(false,task.isTick());
        Assertions.assertEquals("none",task.getTickdata());
        Assertions.assertEquals(0,task.getStatus());

    }
}
