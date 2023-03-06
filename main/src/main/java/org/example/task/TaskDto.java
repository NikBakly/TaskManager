package org.example.task;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TaskDto {
    private String name;

    private String description;

    private LocalDateTime dateTime;
}
