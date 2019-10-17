package com.backend.repository;

import org.springframework.data.repository.CrudRepository;

import com.backend.entity.Giohang;

public interface GiohangRepository<P> extends CrudRepository<Giohang, Integer> {

}
