package com.development.taskservice.model;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Task {
	
	@Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	private String detail;
	
//	@Enumerated
//  @Column(columnDefinition = "smallint")
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "createdBy", referencedColumnName = "id")
	private Member createdBy;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "assignedTo", referencedColumnName = "id")
	private Member assignedTo;
	
	public Task() {}
	
	public Task(String name, String detail, Status status, Member createdBy, Member assignedTo) {	
		this.name = name;
		this.detail = detail;
		this.status = status;
		this.createdBy = createdBy;
		this.assignedTo = assignedTo;
	}
	
	
	
}
