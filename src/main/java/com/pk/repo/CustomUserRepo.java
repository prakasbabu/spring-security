package com.pk.repo;

import com.pk.entity.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomUserRepo extends JpaRepository<CustomUser, Integer> {
    Optional<CustomUser> findByName(String username);
}
