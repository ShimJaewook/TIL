package com.example.mc.todos.store.repository;

import java.util.List;

public interface TodoStoreJpaRepositoryCustom {
	List<TodoJpo> findByQuery(String  nativeQuery);
}
