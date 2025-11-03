package com.smartcollab.team_dashboard.repository;


import com.smartcollab.team_dashboard.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
