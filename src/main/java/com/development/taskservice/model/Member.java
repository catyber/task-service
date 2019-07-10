package com.development.taskservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Member {
	@Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String username;
	
	public Member() {}
	
	public Member(String username) {
		this.username = username;
	}	
}
