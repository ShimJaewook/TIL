package com.example.mc.books.store.repository;

import java.util.List;

public interface BookStoreJpaRepositoryCustom {
	List<BookJpo> findByQuery(String navtiveQuery);
}
