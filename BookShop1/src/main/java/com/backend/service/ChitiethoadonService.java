package com.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.entity.Chitiethoadon;
import com.backend.repository.ChitiethoadonRepository;

@Service
public class ChitiethoadonService {
	
	@Autowired
	ChitiethoadonRepository<Chitiethoadon> chitiethoadonRepository;
	
	@Transactional
	public List<Chitiethoadon> getAllchitiethoadon() {
		return (List<Chitiethoadon>) chitiethoadonRepository.findAll();
	}
	
	@Transactional
	public Optional<Chitiethoadon> getById(Integer id) {
		return chitiethoadonRepository.findById(id);
	}
	
//	@Transactional
//	public List<Books> findByContainingName(String name) {
//		return booksRepository.findByContainingName(name);
//	}
		
	@Transactional
	public void deleteChitiethoadon(Integer chitiethoadonId) {
		chitiethoadonRepository.deleteById(chitiethoadonId);
	}

	@Transactional
	public boolean addChitiethoadon(Chitiethoadon chitiethoadon) {
		return chitiethoadonRepository.save(chitiethoadon) != null;
	}

	@Transactional
	public boolean updateChitiethoadon(Chitiethoadon chitiethoadon) {
		return chitiethoadonRepository.save(chitiethoadon) != null;
	}
}
