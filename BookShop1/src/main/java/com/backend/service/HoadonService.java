package com.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.entity.Hoadon;
import com.backend.repository.HoadonRepository;

@Service
public class HoadonService {

	@Autowired
	HoadonRepository<Hoadon> hoadonRepository;
	
	
	@Transactional
	public List<Hoadon> getAllhoadon() {
		return (List<Hoadon>) hoadonRepository.findAll();
	}
	
	@Transactional
	public Optional<Hoadon> getById(Integer id) {
		return hoadonRepository.findById(id);
	}
	
//	@Transactional
//	public List<Hoadon> findByContainingName(String name) {
//		return booksRepository.findByContainingName(name);
//	}
		
	@Transactional
	public void deleteHoadon(Integer hoadonId) {
		hoadonRepository.deleteById(hoadonId);
	}

	@Transactional
	public boolean addHoadon(Hoadon hoadon) {
		return hoadonRepository.save(hoadon) != null;
	}

	@Transactional
	public boolean updateHoadon(Hoadon hoadon) {
		return hoadonRepository.save(hoadon) != null;
	}
}
