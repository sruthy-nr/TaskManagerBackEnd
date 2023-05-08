package com.example.TaskDelete.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TaskDto {

    private int id;
    private String name;
    private String description;
    private boolean tick;
    private String tickdata;
    private int status;
}
