package com.ashburnere.springbootcrud;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService {

	private static final Logger log = LoggerFactory.getLogger(BookService.class);

	@Autowired
	private BookRepository bookRepository;

	public Long createNewBook(BookRequest bookRequest) {
		Book book = new Book();
		book.setIsbn(bookRequest.getIsbn());
		book.setAuthor(bookRequest.getAuthor());
		book.setTitle(bookRequest.getTitle());

		book = bookRepository.save(book);

		log.info("Created new book: " + book.getTitle());

		return book.getId();
	}

	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	public Book getBookById(Long id) {
		Optional<Book> requestedBook = bookRepository.findById(id);

		if (!requestedBook.isPresent()) {
			throw new BookNotFoundException(String.format("Book with id: '%s' not found", id));
		}

		return requestedBook.get();
	}

	@Transactional
	public Book updateBook(Long id, BookRequest bookToUpdateRequest) {

		Optional<Book> bookFromDatabase = bookRepository.findById(id);

		if (!bookFromDatabase.isPresent()) {
			throw new BookNotFoundException(String.format("Book with id: '%s' not found", id));
		}

		Book bookToUpdate = bookFromDatabase.get();

		bookToUpdate.setAuthor(bookToUpdateRequest.getAuthor());
		bookToUpdate.setIsbn(bookToUpdateRequest.getIsbn());
		bookToUpdate.setTitle(bookToUpdateRequest.getTitle());

		log.info("Updated book with ID: " + bookToUpdate.getId());

		return bookToUpdate;
	}

	public void deleteBookById(Long id) {
		bookRepository.deleteById(id);

		log.info("Deleted book with ID: " + id);
	}

}
