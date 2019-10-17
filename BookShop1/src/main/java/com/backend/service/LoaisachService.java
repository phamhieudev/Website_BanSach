package com.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.entity.Loaisach;
import com.backend.repository.LoaisachRepository;

@Service
public class LoaisachService {

	@Autowired
	LoaisachRepository<Loaisach> loaisachRepository;
	
	
	@Transactional
	public List<Loaisach> getAllloaisach() {
		return (List<Loaisach>) loaisachRepository.findAll();
	}
	
	@Transactional
	public Optional<Loaisach> getById(Integer id) {
		return loaisachRepository.findById(id);
	}
	
//	@Transactional
//	public List<Loaisach> findByContainingName(String name) {
//		return booksRepository.findByContainingName(name);
//	}
		
	@Transactional
	public void deleteLoaisach(Integer loaisachId) {
		loaisachRepository.deleteById(loaisachId);
	}

	@Transactional
	public boolean addLoaisach(Loaisach loaisach) {
		return loaisachRepository.save(loaisach) != null;
	}

	@Transactional
	public boolean updateLoaisach(Loaisach loaisach) {
		return loaisachRepository.save(loaisach) != null;
	}
}
