package com.vega2k.myspringboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vega2k.myspringboot.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByEmail(String email);
}
