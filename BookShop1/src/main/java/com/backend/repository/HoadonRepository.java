package com.backend.repository;

import org.springframework.data.repository.CrudRepository;

import com.backend.entity.Hoadon;

public interface HoadonRepository<P> extends CrudRepository<Hoadon, Integer> {

}
