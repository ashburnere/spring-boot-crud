package com.ashburnere.springbootcrud;

import lombok.Data;

@Data
public class BookStoreEntity {

	private String bookStoreName;

	private Long id;

	private String isbn;

	private String title;

	private String author;
}
