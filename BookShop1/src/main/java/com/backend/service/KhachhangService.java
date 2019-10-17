package com.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.entity.Khachhang;
import com.backend.repository.KhachhangRepository;

@Service
public class KhachhangService {

	@Autowired
	KhachhangRepository<Khachhang> khachhangRepository;
	
	
	@Transactional
	public List<Khachhang> getAllkhachhang() {
		return (List<Khachhang>) khachhangRepository.findAll();
	}
	
	@Transactional
	public Optional<Khachhang> getById(Integer id) {
		return khachhangRepository.findById(id);
	}
	
//	@Transactional
//	public List<Khachhang> findByContainingName(String name) {
//		return booksRepository.findByContainingName(name);
//	}
		
	@Transactional
	public void deleteKhachhang(Integer khachhangId) {
		khachhangRepository.deleteById(khachhangId);
	}

	@Transactional
	public boolean addKhachhang(Khachhang khachhang) {
		return khachhangRepository.save(khachhang) != null;
	}

	@Transactional
	public boolean updateKhachhang(Khachhang khachhang) {
		return khachhangRepository.save(khachhang) != null;
	}
}
