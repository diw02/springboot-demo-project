package com.example.demo2.repository;

import com.example.demo2.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * REPOSITORY INTERFACE: TaskRepository
 * 
 * A Repository is like a database translator.
 * It lets you query/save/delete data from the database without writing SQL.
 * 
 * Instead of writing raw SQL like: "SELECT * FROM tasks WHERE id = 1"
 * You just call: taskRepository.findById(1)
 * 
 * Spring Boot automatically creates all the methods we need!
 */
public interface TaskRepository extends JpaRepository<Task, Long> {
    // JpaRepository <Task, Long> means:
    //   - Task = We're working with Task objects
    //   - Long = The ID type is Long (the 'id' field in Task entity)
    //
    // JpaRepository automatically gives us these methods:
    //   - findAll() = Get all tasks
    //   - findById(Long id) = Get one task by ID
    //   - save(Task task) = Save a new task or update an existing one
    //   - delete(Task task) = Delete a task
    //   - deleteById(Long id) = Delete a task by ID
    //
    // If you need custom queries, add methods here with @Query annotation
    
}
