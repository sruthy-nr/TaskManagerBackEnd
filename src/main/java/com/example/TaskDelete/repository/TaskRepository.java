package com.example.TaskDelete.repository;

import com.example.TaskDelete.entity.TaskEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TaskRepository extends JpaRepository<TaskEntity,Integer> {

    @Query(value = "SELECT * FROM `task` WHERE `status`= 0",nativeQuery = true)
    public List<TaskEntity> viewTask();


    @Modifying
    @Transactional
    @Query(value = "UPDATE `task` SET `status`= 1 WHERE `id`=:id",nativeQuery = true)
    public void deleteTask(@Param("id") Integer id);
}
