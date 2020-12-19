package com.example.mc.books.store.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class BookStoreJpaRepositoryImpl implements BookStoreJpaRepositoryCustom {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<BookJpo> findByQuery(String navtiveQuery) {
		return entityManager.createNativeQuery(navtiveQuery, BookJpo.class).getResultList();
	}

}
