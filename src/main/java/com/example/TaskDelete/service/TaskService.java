package com.example.TaskDelete.service;

import com.example.TaskDelete.dto.ResponseDto;
import com.example.TaskDelete.dto.TaskDto;
import com.example.TaskDelete.entity.TaskEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;

public interface TaskService {

//    public HashMap<String,String> AddTask(TaskEntity t);
    public List<TaskEntity> ViewTask();

    public ResponseDto DeleteTask(TaskDto t);
}
