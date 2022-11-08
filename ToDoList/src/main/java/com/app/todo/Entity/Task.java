package com.app.todo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ToDO")
public class Task {
	@Id
	private String id;
	private String work;
	private String assignedDate;
	private String dueDate;
	private String status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getAssignedDate() {
		return assignedDate;
	}
	public void setAssignedDate(String assignedDate) {
		this.assignedDate = assignedDate;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Task(String id, String work, String assignedDate, String dueDate, String status) {
		super();
		this.id = id;
		this.work = work;
		this.assignedDate = assignedDate;
		this.dueDate = dueDate;
		this.status = status;
	}
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

}
