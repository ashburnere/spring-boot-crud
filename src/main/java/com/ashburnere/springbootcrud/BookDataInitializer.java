package com.ashburnere.springbootcrud;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;


@Component
public class BookDataInitializer implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(BookDataInitializer.class);

	@Autowired
	private BookRepository bookRepository;

	@Override
	public void run(String... args) throws Exception {

		log.info("Start initializing sample data...");
		Faker faker = new Faker();

		for (int i = 0; i < 10; i++) {
			Book book = new Book();
			book.setIsbn(UUID.randomUUID().toString());
			book.setAuthor(faker.book().author());
			book.setTitle(faker.book().title());

			log.info("Created new book: " + book.getTitle());
			this.bookRepository.save(book);
		}

		log.info("Finished initialization of sample data...");

	}

}
