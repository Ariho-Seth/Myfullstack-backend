package com.ariho.fullstack_backend.Repository;

import com.ariho.fullstack_backend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
