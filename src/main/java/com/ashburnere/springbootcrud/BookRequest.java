package com.ashburnere.springbootcrud;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class BookRequest {

	@NotEmpty
	private String title;

	@NotEmpty
	@Size(max = 20)
	private String isbn;

	@NotEmpty
	private String author;
}
