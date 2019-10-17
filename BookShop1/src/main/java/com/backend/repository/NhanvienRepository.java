package com.backend.repository;

import org.springframework.data.repository.CrudRepository;

import com.backend.entity.Nhanvien;


public interface NhanvienRepository<P> extends CrudRepository<Nhanvien, Integer> {

}
