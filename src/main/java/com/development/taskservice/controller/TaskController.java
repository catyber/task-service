package com.development.taskservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.development.taskservice.repository.TaskRepository;

@RestController
public class TaskController {
	
	private final TaskRepository taskRepository;
	
	
	public TaskController(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	@GetMapping("/hello")
	public void hello() {
		
		System.out.println("HELLOOOOOOOOO KATREEEEEEE -->" + taskRepository.count());
	}

}
