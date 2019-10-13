package com.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.entity.Nhanvien;
import com.backend.repository.NhanvienRepository;

@Service
public class NhanvienService {
	
	@Autowired
	NhanvienRepository<Nhanvien> nhanvienRepository;

	@Transactional
	public List<Nhanvien> getAllNV() {
		return (List<Nhanvien>) nhanvienRepository.findAll();
	}

	
	// @Transactional public List<Work> findByName(String tenvieclam) { return
	// workRepository.findByTenvieclam(tenvieclam);
	 //}
	 
	
	//@Transactional
	//public List<Work> findByContainingName(String name) {
	//	return workRepository.findByContainingName(name);
	//}
	
	
	  //public List<Work> findByNameContainingWorks(String name) { return
	  //workRepository.findByContainingName(name); }
	 

	@Transactional
	public Optional<Nhanvien> getById(Integer id) {
		return nhanvienRepository.findById(id);
	}

	@Transactional
	public void deleteNhanvien(Integer nvId) {
		nhanvienRepository.deleteById(nvId);
	}

	@Transactional
	public boolean addNhanvien(Nhanvien Nhanvien) {
		return nhanvienRepository.save(Nhanvien) != null;
	}

	@Transactional
	public boolean updateNhanvien(Nhanvien Nhanvien) {
		return nhanvienRepository.save(Nhanvien) != null;
	}
}

