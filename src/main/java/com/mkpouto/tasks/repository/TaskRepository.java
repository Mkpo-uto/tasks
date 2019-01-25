package com.mkpouto.tasks.repository;

import com.mkpouto.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {


}
