package com.mkpouto.service;

import com.mkpouto.domain.Task;

public interface TaskService {

    Iterable<Task> list();

    //save a new task
    Task save(Task task);


}
