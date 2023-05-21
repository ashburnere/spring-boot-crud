package com.ashburnere.springbootcrud;

import java.util.List;

public class BookStoreList {

	private List<BookStoreEntity> bookStoreEntities;

	public BookStoreList() {
	}

	public List<BookStoreEntity> getBookStoreEntities() {
		return bookStoreEntities;
	}

	public void setBookStoreEntities(List<BookStoreEntity> bookStoreEntities) {
		this.bookStoreEntities = bookStoreEntities;
	}


}
