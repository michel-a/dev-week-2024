package com.malves.devweek2024.domain.repository;

import com.malves.devweek2024.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
