package com.example.demo2.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotBlank;

/**
 * ENTITY CLASS: Task
 * 
 * An Entity is a Java class that directly maps to a DATABASE TABLE.
 * Each field in this class = one column in the database.
 * When you create a Task object, it gets saved to the "tasks" table in PostgreSQL.
 * 
 * Think of it like a template: "Every Task has an id, title, and description"
 */
@Entity  // This annotation tells Spring: "Create a database table for this class"
@Table(name = "tasks")  // This names the table "tasks" (if you don't specify, it uses the class name)
@Getter  // Lombok: Automatically creates getter methods (getId(), getTitle(), etc.)
@Setter  // Lombok: Automatically creates setter methods (setId(), setTitle(), etc.)
public class Task {
    
    // PRIMARY KEY: Unique identifier for each task
    @Id  // This is the "primary key" - like a unique ID for each row
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-increment: database generates the ID automatically
    private Long id;

    // COLUMN: Task title - Required field (cannot be null/empty)
    @Column(nullable = false)  // nullable=false means this field MUST have a value
    @NotBlank(message = "Title is required")
    private String title;

    // COLUMN: Task description - Required field (cannot be null/empty)
    @Column(nullable = false)  // Same as above - must have a value
    @NotBlank(message = "Description is required")
    private String description;

    private String status;
    private String priority;
    private LocalDate dueDate;
}
