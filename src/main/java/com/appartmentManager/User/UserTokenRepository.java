package com.appartmentManager.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserTokenRepository extends JpaRepository<UserToken , Integer> {

    Optional<UserToken> findByUserToken(String token);
}
