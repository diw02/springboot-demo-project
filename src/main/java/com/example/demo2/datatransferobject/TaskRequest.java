package com.example.demo2.datatransferobject;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TaskRequest {
    @NotBlank
    private String title;

    @NotBlank
    private String description;

    private String status;
    private String priority;
    private LocalDate dueDate;
}
