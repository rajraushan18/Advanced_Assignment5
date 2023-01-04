package com.nagarro.assignment.dao;

import org.springframework.data.repository.CrudRepository;

import com.nagarro.assignment.model.Books;

public interface BookRepository extends CrudRepository<Books, Integer>{

	public Books findById(int id);
	
}
