package org.finalproject.controller;

import org.finalproject.entity.Task;
import org.finalproject.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;

    }

    @GetMapping()
    public List<Task> getUserTasks() {

        return taskService.getAllTasks();
    }

    @GetMapping("/{taskId}")
    public ResponseEntity<Task> getTaskById(@PathVariable int taskId) {
        Task task = taskService.getTaskById(taskId);
        return ResponseEntity.ok(task);

    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        Task createdTask = taskService.createTask(task);
        return ResponseEntity.ok(createdTask);
    }

    @PutMapping("/{taskId}")
    public ResponseEntity<Task> updateTask(@PathVariable int taskId, @RequestBody Task task) {
        Task updatedTask = taskService.updateTask(taskId, task);
        return ResponseEntity.ok(updatedTask);
    }

    @DeleteMapping("/{taskId}")
    public ResponseEntity<Void> deleteTask(@PathVariable int taskId) {
        taskService.deleteTaskById(taskId);
        return ResponseEntity.noContent().build();
    }

}
