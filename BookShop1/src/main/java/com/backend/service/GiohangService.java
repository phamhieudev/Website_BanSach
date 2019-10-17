package com.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.entity.Giohang;
import com.backend.repository.GiohangRepository;

@Service
public class GiohangService {

	@Autowired
	GiohangRepository<Giohang> giohangRepository;
	
	
	@Transactional
	public List<Giohang> getAllgiohang() {
		return (List<Giohang>) giohangRepository.findAll();
	}
	
	@Transactional
	public Optional<Giohang> getById(Integer id) {
		return giohangRepository.findById(id);
	}
	
//	@Transactional
//	public List<Giohang> findByContainingName(String name) {
//		return booksRepository.findByContainingName(name);
//	}
		
	@Transactional
	public void deleteGiohang(Integer giohangId) {
		giohangRepository.deleteById(giohangId);
	}

	@Transactional
	public boolean addGiohang(Giohang giohang) {
		return giohangRepository.save(giohang) != null;
	}

	@Transactional
	public boolean updateGiohang(Giohang giohang) {
		return giohangRepository.save(giohang) != null;
	}
}
