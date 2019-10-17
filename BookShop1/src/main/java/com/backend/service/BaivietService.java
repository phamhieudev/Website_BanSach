package com.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.entity.Baiviet;
import com.backend.repository.BaivietRepository;

@Service
public class BaivietService {

	@Autowired
	BaivietRepository<Baiviet> baivietRepository;
	
	
	@Transactional
	public List<Baiviet> getAllbaiviet() {
		return (List<Baiviet>) baivietRepository.findAll();
	}
	
	@Transactional
	public Optional<Baiviet> getById(Integer id) {
		return baivietRepository.findById(id);
	}
	
//	@Transactional
//	public List<Baiviet> findByContainingName(String name) {
//		return booksRepository.findByContainingName(name);
//	}
		
	@Transactional
	public void deleteBaiviet(Integer baivietId) {
		baivietRepository.deleteById(baivietId);
	}

	@Transactional
	public boolean addBaiviet(Baiviet baiviet) {
		return baivietRepository.save(baiviet) != null;
	}

	@Transactional
	public boolean updateBaiviet(Baiviet baiviet) {
		return baivietRepository.save(baiviet) != null;
	}
}
