package com.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.entity.Tacgia;
import com.backend.repository.TacgiaRepository;

@Service
public class TacgiaService {

	@Autowired
	TacgiaRepository<Tacgia> tacgiaRepository;
	
	
	@Transactional
	public List<Tacgia> getAlltacgia() {
		return (List<Tacgia>) tacgiaRepository.findAll();
	}
	
	@Transactional
	public Optional<Tacgia> getById(Integer id) {
		return tacgiaRepository.findById(id);
	}
	
		
	@Transactional
	public void deleteTacgia(Integer bookId) {
		tacgiaRepository.deleteById(bookId);
	}

	@Transactional
	public boolean addTacgia(Tacgia tacgia) {
		return tacgiaRepository.save(tacgia) != null;
	}

	@Transactional
	public boolean updateTacgia(Tacgia tacgia) {
		return tacgiaRepository.save(tacgia) != null;
	}
}
