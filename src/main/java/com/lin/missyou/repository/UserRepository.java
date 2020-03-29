package com.lin.missyou.repository;

import com.lin.missyou.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByOpenid(String openid);
}
