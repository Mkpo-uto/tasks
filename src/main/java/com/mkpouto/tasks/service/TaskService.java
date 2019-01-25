package com.mkpouto.tasks.service;

import com.mkpouto.tasks.domain.Task;

public interface TaskService {

    Iterable<Task> list();
}
