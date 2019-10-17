package com.backend.repository;

import org.springframework.data.repository.CrudRepository;

import com.backend.entity.Khachhang;

public interface KhachhangRepository<P> extends CrudRepository<Khachhang, Integer> {

}
