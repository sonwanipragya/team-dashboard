package com.smartcollab.team_dashboard.repository;

import com.smartcollab.team_dashboard.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

