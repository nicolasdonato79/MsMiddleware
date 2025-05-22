package com.example.msMiddleware.repo;

import com.example.msMiddleware.entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailRepository extends JpaRepository<UserDetail, Long> {
    UserDetail findByUsername(String username);
}
