package com.nagarro.assignment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nagarro.assignment.dao.BookRepository;
import com.nagarro.assignment.model.Books;

@Component
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public List<Books> getAllBooks() {
		List<Books> book_list = (List<Books>) this.bookRepository.findAll();
		return book_list;
	}

	public Books getBookByID(int id) {

		Books book = null;
		try {
			book = this.bookRepository.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;

	}
	
	public Books addBook(Books book) {
		
		Books result = bookRepository.save(book);
		return result;
	}
	
	public void deleteBook(int id) {
		
		bookRepository.deleteById(id);
	}
	
	public void updateBook(Books book, int id) {
		
		book.setCode(id);
		bookRepository.save(book);
	}
	
}
