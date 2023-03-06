package org.example.task;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    @Override
    public TaskDto create(TaskDto taskDto) {
        return null;
    }

    @Override
    public TaskDto findById(Long id) {
        return null;
    }

    @Override
    public List<TaskDto> findAll() {
        return null;
    }

    @Override
    public TaskDto updateById(Long id, TaskDto taskDto) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
