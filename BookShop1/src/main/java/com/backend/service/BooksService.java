package com.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.entity.Books;
import com.backend.repository.BooksRepository;

@Service
public class BooksService {

	@Autowired
	BooksRepository<Books> booksRepository;
	
	
	@Transactional
	public List<Books> getAllbooks() {
		return (List<Books>) booksRepository.findAll();
	}
	
	@Transactional
	public Optional<Books> getById(Integer id) {
		return booksRepository.findById(id);
	}
	
	@Transactional
	public List<Books> findByContainingName(String name) {
		return booksRepository.findByContainingName(name);
	}
		
	@Transactional
	public void deleteBook(Integer bookId) {
		booksRepository.deleteById(bookId);
	}

	@Transactional
	public boolean addBook(Books books) {
		return booksRepository.save(books) != null;
	}

	@Transactional
	public boolean updateBook(Books books) {
		return booksRepository.save(books) != null;
	}
}
