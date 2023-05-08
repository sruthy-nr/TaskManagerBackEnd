package com.example.TaskDelete.dto;

import com.example.TaskDelete.entity.TaskEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListDto {
    private List<TaskEntity> taskList;
}
