package com.example.mc.todos.store.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class TodoStoreRepositoryImpl implements TodoStoreJpaRepositoryCustom {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<TodoJpo> findByQuery(String nativeQuery) {
		// TODO Auto-generated method stub
		return entityManager.createNativeQuery(nativeQuery, TodoJpo.class).getResultList();
	}

}
