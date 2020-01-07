package com.ashburnere.springbootcrud;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LoadYAMLTest {

	@Autowired
	private LoadConfigFromYAMLService loadYAMLService;

	@Test
	public void testLoad() {
		BookStoreList data = loadYAMLService.getData();
		System.out.println(data);

	}
}
