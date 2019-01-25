package com.mkpouto.tasks.service;

import com.mkpouto.tasks.domain.Task;
import com.mkpouto.tasks.repository.TaskRepository;

public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list(){
        return this.taskRepository.findAll();
    }
}
