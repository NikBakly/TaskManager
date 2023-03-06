package org.example.task;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    public TaskDto create(TaskDto taskDto) {
        return taskService.create(taskDto);
    }

    public TaskDto findById(Long id) {
        return taskService.findById(id);
    }

    public List<TaskDto> findAll() {
        return taskService.findAll();
    }

    public TaskDto updateById(Long id, TaskDto taskDto) {
        return taskService.updateById(id, taskDto);
    }

    public void deleteById(Long id) {
        taskService.deleteById(id);
    }
}
