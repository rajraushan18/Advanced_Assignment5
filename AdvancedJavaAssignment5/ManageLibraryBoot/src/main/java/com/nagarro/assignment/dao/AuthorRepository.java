package com.nagarro.assignment.dao;

import org.springframework.data.repository.CrudRepository;

import com.nagarro.assignment.model.Authors;

public interface AuthorRepository extends CrudRepository<Authors, Integer> {

	public Authors findById(int id);

}
