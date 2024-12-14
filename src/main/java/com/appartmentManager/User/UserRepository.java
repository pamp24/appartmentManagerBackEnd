package com.appartmentManager.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    // Additional queries can go here if necessary
}
