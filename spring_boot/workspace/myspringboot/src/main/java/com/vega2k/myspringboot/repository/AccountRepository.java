package com.vega2k.myspringboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vega2k.myspringboot.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{
	Optional<Account> findByUsername(String username);
	Optional<Account> findByEmail(String email);
}
