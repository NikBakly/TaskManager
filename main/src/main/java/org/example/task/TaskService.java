package org.example.task;

import java.util.List;

public interface TaskService {
    TaskDto create(TaskDto taskDto);

    TaskDto findById(Long id);

    List<TaskDto> findAll();

    TaskDto updateById(Long id, TaskDto taskDto);

    void deleteById(Long id);
}
