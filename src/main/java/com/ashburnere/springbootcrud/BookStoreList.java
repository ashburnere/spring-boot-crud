package com.ashburnere.springbootcrud;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BookStoreList {

	private List<BookStoreEntity> bookStoreEntities;
}
