package com.backend.repository;

import org.springframework.data.repository.CrudRepository;

import com.backend.entity.Baiviet;

public interface BaivietRepository<P> extends CrudRepository<Baiviet, Integer> {

}
