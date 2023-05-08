package com.example.TaskDelete.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "task")
public class TaskEntity {

        @Id
        @GeneratedValue
        private int id;
        private String name;
        private String description;
        private boolean tick;
        private String tickdata;
        private int status=0;


}
