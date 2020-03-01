package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	public void mainMenu() {
		System.out.println("== Welcome KH Library ==");
		int num = 0;
		do {
			System.out.println("******* ���� �޴� *******");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻� ��ȸ");
			System.out.println("4. ���� ���� ");
			System.out.println("5. ���� �� �������� ����");
			System.out.println("9. ����");
			System.out.print("�޴� ��ȣ ���� : ");
			num = sc.nextInt();
			sc.nextLine();
			switch(num) {
			case 1:insertBook();break;
			case 2:selectList();break;
			case 3:searchBook();break;
			case 4:deleteBook();break;
			case 5:ascBook();break;
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
			}
		}while(num != 9);
	}
	public void insertBook() {
		String title;
		String author;
		int category;
		int price;
		System.out.println("===== �� ���� �߰� =====");
		System.out.print("������ :");
		title = sc.nextLine();
		System.out.print("���ڸ� : ");
		author = sc.next();
		System.out.print("�帣(1. �ι�/ 2. ����/ 3. �ܱ���/ 4.��Ÿ) : ");
		category = sc.nextInt();
		System.out.print("���� : ");
		price = sc.nextInt();
		String cstr = "";
		switch(category) {
		case 1 : cstr = "�ι�";break;
		case 2 : cstr = "����";break;
		case 3 : cstr = "�ܱ���";break;
		case 4 : cstr = "��Ÿ";
		}
		Book b = new Book(title,author,cstr,price);
		bc.insertBook(b);
	}
	public void selectList() {
		System.out.println("===== ���� ��ü ��ȸ =====");
		ArrayList<Book> bookList = bc.selectList();
		if(bookList != null) {
			for(Book b : bookList) {
				System.out.println(b);
			}
		} else {
			System.out.println("�����ϴ� ������ �����ϴ�.");
		}
	}
	public void searchBook() {
		System.out.println("==== ���� �˻� ====");
		System.out.print("�˻� Ű���� : ");
		String keyword = sc.nextLine();
		ArrayList<Book> searchList = bc.searchBook(keyword);
		if(searchList != null) {
			for(Book b : searchList) {
				System.out.println(b);
			}
		}else {
			System.out.println("�˻� ����� �����ϴ�.");
		}	
	}
	public void deleteBook() {
		System.out.println("===== ���� ���� =====");
		System.out.print("������ ���� �� : ");
		String title = sc.nextLine();
		System.out.print("������ ���ڸ� : ");
		String author = sc.nextLine();
		Book remove = bc.deleteBook(title, author);
		if(remove != null) {
			System.out.println("���������� �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ ������ ã�� ���߽��ϴ�.");
		}
	}
	public void ascBook() {
		if(bc.ascBook() == 1) {
			System.out.println("���Ŀ� �����Ͽ����ϴ�.");
		} 
	}
}
