package com.backend.repository;

import org.springframework.data.repository.CrudRepository;

import com.backend.entity.Tacgia;

public interface TacgiaRepository<P> extends CrudRepository<Tacgia, Integer> {

}
