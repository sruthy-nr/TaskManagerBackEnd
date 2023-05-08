package com.example.TaskDelete.controller;

import com.example.TaskDelete.dto.ListDto;
import com.example.TaskDelete.dto.TaskDto;
import com.example.TaskDelete.repository.TaskRepository;
import com.example.TaskDelete.entity.TaskEntity;
import com.example.TaskDelete.service.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RequestMapping("/Task")
@RestController
public class TaskController {
    @Autowired
    TaskRepository dao;

    @Autowired
    TaskServiceImpl ser;

//    @CrossOrigin(origins = "*")
//    @PostMapping(path = "/addtask", consumes = "application/json", produces = "application/json")
//    public HashMap<String,String> AddTask(@RequestBody TaskEntity t){
//        return ser.AddTask(t);
//    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/viewtask")
    public ListDto ViewTask()
    {
        List<TaskEntity> taskList = ser.ViewTask();
        return new ListDto(taskList);
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/deletetask", consumes = "application/json", produces = "application/json")
    public HashMap<String,String> DeleteTask(@RequestBody TaskDto t){
        TaskEntity tasks=new TaskEntity(t.getId(),t.getName(),t.getDescription(),t.isTick(),t.getTickdata(),t.getStatus());
       return ser.DeleteTask(tasks);
    }
}
