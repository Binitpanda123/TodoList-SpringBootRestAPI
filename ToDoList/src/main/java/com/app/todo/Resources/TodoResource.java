package com.app.todo.Resources;

import org.springframework.data.repository.CrudRepository;

import com.app.todo.Entity.Task;

public interface TodoResource extends CrudRepository<Task, String> {

	void deleteByStatus(String status);

	Task findTaskById(String id);

}
