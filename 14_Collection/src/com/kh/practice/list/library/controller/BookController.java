package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	ArrayList<Book> bookList = new ArrayList<Book>();
	//초기 값을 넣어줄 기본 생성자
	public BookController() {
		bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
		bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
	}
	public void insertBook(Book bk) {
		bookList.add(bk);
	}
	public ArrayList<Book> selectList() {
		return bookList;
	}
	public ArrayList<Book> searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList<Book>();
		for(Book b : bookList) {
			if((b.getTitle()).contains(keyword)) {
				searchList.add(b);
			}
		}
		return searchList;
	}
	public Book deleteBook(String title, String author) {
		Book removeBook = null;
		for(Book b : bookList) {
		if(b.getTitle().equals(title) &&  b.getAuthor().equals(author)) {
			bookList.remove(b);
			removeBook = b;
			break;
		}
		}
		return removeBook;
	}
	public int ascBook() {
		Collections.sort(bookList);
		return 1;
	}
}
