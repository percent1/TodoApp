package com.taskmanagerapi.repository;

// Import the Task entity that this repository will manage.
import com.taskmanagerapi.entity.Task;

// Import Spring Data JPA to access built-in database operations.
import org.springframework.data.jpa.repository.JpaRepository;

// Defines the repository for Task entities.
// JpaRepository provides built-in methods to save, retrieve, update,
// and delete tasks without requiring us to write SQL queries manually.
public interface TaskRepository extends JpaRepository<Task, Long> {

}
