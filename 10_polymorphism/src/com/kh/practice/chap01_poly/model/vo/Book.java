package com.kh.practice.chap01_poly.model.vo;

public class Book {
	private String title;
	private String author;
	private String publisher;
	
	public Book() {}
	public Book(String title,String author,String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title + author + publisher;
	}
}
