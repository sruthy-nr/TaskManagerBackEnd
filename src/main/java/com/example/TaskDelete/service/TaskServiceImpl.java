package com.example.TaskDelete.service;

import com.example.TaskDelete.dto.ResponseDto;
import com.example.TaskDelete.dto.TaskDto;
import com.example.TaskDelete.entity.TaskEntity;
import com.example.TaskDelete.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    TaskRepository repo;

//    @Override
//    public HashMap<String,String> AddTask(TaskEntity t){
//        repo.save(t);
//        HashMap<String,String> map=new HashMap<>();
//        map.put("status","success");
//        return map;
//    }

    @Override
    public List<TaskEntity> ViewTask() {
        return repo.viewTask();
    }

    @Override
    public ResponseDto DeleteTask(TaskDto t){
        repo.deleteTask(t.getId());
        ResponseDto response = new ResponseDto();
        response.setStatus("success");
//        HashMap<String,String> map=new HashMap<>();
//        map.put("status","success");
        return response;
    }
}
