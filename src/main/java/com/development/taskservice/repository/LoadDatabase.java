package com.development.taskservice.repository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.development.taskservice.model.Member;
import com.development.taskservice.model.Status;
import com.development.taskservice.model.Task;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class LoadDatabase {

	@Bean
	CommandLineRunner initDatabase(TaskRepository taskRepository, MemberRepository memberRepository) {
		return args -> {
			Member member1 = new Member("Katrina");
			Member member2 = new Member("Jillian");
			memberRepository.save(member1);
			memberRepository.save(member2);
		
//			log.info("Preloading " + memberRepository.save(member1));
//			log.info("Preloading " + memberRepository.save(member2));
			log.info("Preloading " + taskRepository.save(new Task("Clean bathroom", "Use Clorox",Status.NEW, member1, member2)));
			log.info("Preloading " + taskRepository.save(new Task("Clean up toys.", "Put in the bin.",Status.IN_PROGRESS, member1, member2)));
			log.info("Preloading " + taskRepository.save(new Task("Laundry", "Wash the whites only.",Status.IN_PROGRESS, member1, member1)));
			log.info("Preloading " + taskRepository.save(new Task("Cook", "beef noodles.",Status.COMPLETED, member2, member1)));
		};
	}
}
