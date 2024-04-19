package org.finalproject.service.impl;

import org.finalproject.entity.Task;
import org.finalproject.exception.TaskNotFoundException;
import org.finalproject.repository.TaskRepository;
import org.finalproject.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository repository;

    public TaskServiceImpl(TaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Task> getAllTasks() {
        List<Task> tasks = repository.findAll();
        return tasks;
    }

    @Override
    public void deleteTaskById(int id) {
        repository.deleteById(id);
    }

    @Override
    public Task getTaskById(int taskId) {
        Task task = repository.findById(taskId);
        if (task == null) {
            throw new TaskNotFoundException(taskId);
        }
        return task;
    }

    @Override
    public Task createTask(Task req) {
        Task res = repository.save(req);
        return res;
    }

    @Override
    public Task updateTask(int id, Task task) {
        Task oldTask = getTaskById(id);
        oldTask.setTitle(task.getTitle());
        oldTask.setDescription(task.getDescription());
        oldTask.setPriority(task.getPriority());
        oldTask.setUserId(task.getUserId());
        return repository.save(oldTask);
    }




}
