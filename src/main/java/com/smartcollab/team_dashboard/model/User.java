package com.smartcollab.team_dashboard.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")  // "user" is a reserved keyword in PostgreSQL, so use plural
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;   // unique user ID

    @Column(nullable = false, unique = true)
    private String email;   // for login / contact

    @Column(nullable = false)
    private String name;    // display name

    private String role;    // e.g., "Developer", "Manager", "Tester"

    private String department; // optional - for team grouping

    @Column(nullable = false)
    private String password;   // hashed password later when security added

    private boolean active = true; // to soft-disable users if needed
}
