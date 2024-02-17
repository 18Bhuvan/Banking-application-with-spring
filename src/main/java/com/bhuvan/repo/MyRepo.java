package com.bhuvan.repo;

import org.springframework.data.repository.CrudRepository;

import com.bhuvan.entity.SdfcBank;

public interface MyRepo extends CrudRepository<SdfcBank, Integer> {

}
