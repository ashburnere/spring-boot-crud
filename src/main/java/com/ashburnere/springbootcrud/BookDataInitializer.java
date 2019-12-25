package com.ashburnere.springbootcrud;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class BookDataInitializer implements CommandLineRunner {

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

			this.bookRepository.save(book);
		}

		log.info("Finished initialization of sample data...");

	}

}
