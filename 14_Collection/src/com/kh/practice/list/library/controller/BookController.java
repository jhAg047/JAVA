package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	ArrayList<Book> bookList = new ArrayList<Book>();
	//�ʱ� ���� �־��� �⺻ ������
	public BookController() {
		bookList.add(new Book("�ڹ��� ����", "���� ��", "��Ÿ", 20000));
		bookList.add(new Book("���� ���� �˰���", "������", "��Ÿ", 15000));
		bookList.add(new Book("��ȭ�� ���", "������", "�ι�", 17500));
		bookList.add(new Book("�� ������", "�ڽſ�", "�Ƿ�", 21000));
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
