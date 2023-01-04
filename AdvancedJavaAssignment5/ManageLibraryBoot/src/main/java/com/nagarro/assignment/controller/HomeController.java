package com.nagarro.assignment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.assignment.model.Books;
import com.nagarro.assignment.services.BookService;

@RestController
public class HomeController {

	@Autowired
	private BookService bookService;

	@GetMapping("/book")
	public ResponseEntity<List<Books>> getBooks() {
		List<Books> book_list = bookService.getAllBooks();
		if (book_list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(book_list));
	}

	@GetMapping("/book/{id}")
	public ResponseEntity<Books> getBookById(@PathVariable("id") int id) {

		Books book = bookService.getBookByID(id);
		if (book == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(book));
	}

	@PostMapping("/book")
	public ResponseEntity<Books> addBook(@RequestBody Books book) {
		Books added_book = null;

		try {
			added_book = this.bookService.addBook(book);
			return ResponseEntity.of(Optional.of(added_book));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@DeleteMapping("/book/{id}")
	public ResponseEntity<Void> deleteBook(@PathVariable("id") int id) {

		try {
			this.bookService.deleteBook(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PutMapping("/book/{id}")
	public ResponseEntity<Books> updateBook(@RequestBody Books book, @PathVariable("id") int id) {

		try {
			this.bookService.updateBook(book, id);
			return ResponseEntity.ok().body(book);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
