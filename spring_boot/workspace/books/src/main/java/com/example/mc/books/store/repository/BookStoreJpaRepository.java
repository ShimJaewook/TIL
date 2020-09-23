package com.example.mc.books.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

//list - page 처리
public interface BookStoreJpaRepository extends JpaRepository<BookJpo, String> {
	
}
