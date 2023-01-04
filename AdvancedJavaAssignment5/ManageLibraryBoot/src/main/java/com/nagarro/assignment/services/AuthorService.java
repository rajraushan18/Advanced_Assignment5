package com.nagarro.assignment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nagarro.assignment.dao.AuthorRepository;
import com.nagarro.assignment.model.Authors;

@Component
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;

	public List<Authors> getAllAuthors() {
		List<Authors> author_list = (List<Authors>) this.authorRepository.findAll();
		return author_list;
	}

	public Authors getAuthorByID(int id) {

		Authors author = null;
		try {
			author = this.authorRepository.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return author;

	}
	
	public Authors addAuthor(Authors author) {
		
		Authors result = authorRepository.save(author);
		return result;
	}
	
	public void deleteAuthor(int id) {
		
		authorRepository.deleteById(id);
	}
	
	public void updateAuthor(Authors author, int id) {
		
		author.setId(id);
		authorRepository.save(author);
	}
	
}
