package com.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.backend.entity.Books;

public interface BooksRepository<P> extends CrudRepository<Books, Integer> {

	@Query("select w from Books w where w.tenS like %?1%")
	List<Books> findByContainingName(String tenSach);
}
