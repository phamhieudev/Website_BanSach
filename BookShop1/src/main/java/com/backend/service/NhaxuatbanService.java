package com.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.entity.Nhaxuatban;
import com.backend.repository.NhaxuatbanRepository;

@Service
public class NhaxuatbanService {
	
	@Autowired
	NhaxuatbanRepository<Nhaxuatban> nhaxuatbanRepository;
	
	
	@Transactional
	public List<Nhaxuatban> getAllnhaxuatban() {
		return (List<Nhaxuatban>) nhaxuatbanRepository.findAll();
	}
	
	@Transactional
	public Optional<Nhaxuatban> getById(Integer id) {
		return nhaxuatbanRepository.findById(id);
	}
	
		
	@Transactional
	public void deleteNhaxuatban(Integer nhaxuatbanId) {
		nhaxuatbanRepository.deleteById(nhaxuatbanId);
	}

	@Transactional
	public boolean addNhaxuatban(Nhaxuatban nhaxuatban) {
		return nhaxuatbanRepository.save(nhaxuatban) != null;
	}

	@Transactional
	public boolean updateNhaxuatban(Nhaxuatban nhaxuatban) {
		return nhaxuatbanRepository.save(nhaxuatban) != null;
	}

}
