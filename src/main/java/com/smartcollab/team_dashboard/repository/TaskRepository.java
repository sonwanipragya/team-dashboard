package com.smartcollab.team_dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.smartcollab.team_dashboard.model.Task;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // ✅ Custom method to find all tasks belonging to a specific project
    List<Task> findByProjectId(Long projectId);
}

