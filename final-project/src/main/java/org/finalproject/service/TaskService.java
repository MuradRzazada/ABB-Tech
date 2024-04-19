package org.finalproject.service;

import org.finalproject.entity.Task;

import java.util.List;

public interface TaskService {

    List<Task> getAllTasks();

    void deleteTaskById(int id);

    Task updateTask(int id, Task task);

    Task createTask(Task task);

    Task getTaskById(int taskId);
}
