package com.app.todo.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.todo.Entity.Task;
import com.app.todo.Service.TodoService;

@RestController
public class TodoController {
	
	@Autowired
	public TodoService todoService;
	
	@GetMapping("/tasks")
	public ArrayList<Task> getAllTasks(){
		return (ArrayList<Task>) todoService.getAllTask();
	}
	
	@GetMapping("/tasks/{id}")
	public Task getTaskById(@PathVariable String id) {
		return todoService.getTaskById(id);
		
	}
	
//	@GetMapping("/tasks/{assignedDate}")
//	public ArrayList<Task> getTaskByAssignedDate(@PathVariable String assignedDate){
//		
//	}
//	
//	@GetMapping("/tasks/{dueDate}")
//	public ArrayList<Task> getTaskByDueDate(@PathVariable String dueDate){
//		
//	}
//	
//	@GetMapping("/tasks/{status}")
//	public ArrayList<Task> getTaskByStatus(@PathVariable String status){
//		
//	}
	
	@PostMapping("/tasks")
	public void addTask(@RequestBody Task task) {
		todoService.addTask(task);
	}
	
	@DeleteMapping("/tasks/{id}")
	public void deleteTaskById(@PathVariable String id) {
		todoService.deleteTaskById(id);
	}
	
	@DeleteMapping("/tasks/{status}")
	public void deleteTaskByStatus(@PathVariable String status) {
		todoService.deleteTaskByStatus(status);
	}
	
	@PutMapping("/tasks/{id}")
	public void updateTaskBYId(@PathVariable String id,@RequestBody Task task) {
		todoService.updateTaskById(id, task);
	}
	
	
	
	
	
	
	
	
	
	
	

}
