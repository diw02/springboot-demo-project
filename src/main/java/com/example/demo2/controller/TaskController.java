package com.example.demo2.controller;

import com.example.demo2.entity.Task;
import com.example.demo2.service.TaskService;
import com.example.demo2.datatransferobject.TaskRequest;
import com.example.demo2.datatransferobject.TaskResponse;

/**
 * CONTROLLER CLASS: TaskController
 * 
 * A Controller handles HTTP requests from the client (like your web browser or mobile app).
 * When someone visits http://localhost:8080/tasks, this controller responds with data.
 * 
 * Think of it like a restaurant waiter:
 * - Client asks: "Give me all tasks" (GET request to /tasks)
 * - Controller gets the request and asks the database for tasks
 * - Controller returns the tasks as JSON
 */
import org.springframework.web.bind.annotation.*;

import java.util.List;
import jakarta.validation.Valid;

@RestController  // Annotation that says: "I handle HTTP requests and return JSON responses"
@RequestMapping("/tasks")  // The base URL for all methods in this class is "/tasks"
public class TaskController {
    
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    // METHOD: GET all tasks - listen for GET requests at /tasks
    @GetMapping
    public List<TaskResponse> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public TaskResponse createTask(@Valid @RequestBody TaskRequest request) {
        return taskService.createTask(request);
    }

    @PutMapping("/{id}")
    public TaskResponse updateTask(@PathVariable Long id, @Valid @RequestBody TaskRequest request) {        
        return taskService.updateTask(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}