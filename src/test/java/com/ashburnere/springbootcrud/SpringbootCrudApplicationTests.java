package com.ashburnere.springbootcrud;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootCrudApplicationTests {

	@Autowired
	private BookRepository bookRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testSampleData() {
		this.bookRepository.findAll().stream().forEach(book -> System.out.println(book.getTitle()));
		assertEquals(10, this.bookRepository.count());
	}

}
