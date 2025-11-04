package com.smartcollab.team_dashboard.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // unique project ID

    @Column(nullable = false)
    private String name;  // project name

    private String description; // short summary or details

    private LocalDate startDate; // project start date
    private LocalDate endDate;   // project target end date

    private String status; // e.g., "Active", "On Hold", "Completed"

    @ManyToOne
    @JoinColumn(name = "owner_id")  // references a User
    private User owner; // project manager / creator

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Task> tasks;  // link all tasks under this project
}
