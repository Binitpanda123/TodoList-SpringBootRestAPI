package com.app.todo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.todo.Entity.Task;
import com.app.todo.Resources.TodoResource;

@Service
public class TodoService {
	@Autowired
	public TodoResource todoResource;
	//post
	public void addTask(Task task) {
		todoResource.save(task);
	}
	//delete
	public void deleteTaskById(String id) {
		todoResource.deleteById(id);
	}
	public void deleteTaskByStatus(String status) {
		todoResource.deleteByStatus(status);
	}
	//update
	public void updateTaskById(String id,Task task) {
		todoResource.save(task);
	}
	//get
	public List<Task> getAllTask(){
		List<Task> task=new ArrayList<>();
		todoResource.findAll().forEach(task::add);
		return task;
	}
	public Task getTaskById(String id){
		
		return todoResource.findTaskById(id);
		
	}	
	
	
	

}
