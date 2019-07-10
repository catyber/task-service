package com.development.taskservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.development.taskservice.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
