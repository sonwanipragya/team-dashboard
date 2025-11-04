package com.smartcollab.team_dashboard.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Data
@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String status;
    private String Description;
    private String Assignee;
    private String assignedTo;
    private LocalDate dueDate;

    @ManyToOne
    @JoinColumn(name = "project_id")
    @JsonBackReference
    private Project project;

    public Task() {}

    public Task(String title, String status, String assignedTo, LocalDate dueDate,String Description,String Assignee) {
        this.title = title;
        this.status = status;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
        this.Description = Description;
        this.Assignee = Assignee;
    }}
