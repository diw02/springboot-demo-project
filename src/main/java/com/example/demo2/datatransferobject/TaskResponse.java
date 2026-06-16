package com.example.demo2.datatransferobject;
import java.time.LocalDate;

public class TaskResponse {
    private Long id;
    private String title;
    private String description;
    private String status;
    private String priority;
    private LocalDate dueDate;

    public TaskResponse(Long id, String title, String description, String status, String priority, LocalDate dueDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getStatus() { return status; }
    public String getPriority() { return priority; }
    public LocalDate getDueDate() { return dueDate; }
}

/*instead of manually writing this, you can use Lombok to generate the constructor and getters 
automatically by adding @AllArgsConstructor and @Getter annotations at the class level.*/
