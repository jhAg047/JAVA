package com.kh.example.chap05_constructor.run;

import com.kh.example.chap05_constructor.model.vo.User;

public class Run {
	public static void main(String[] args) {
		User u1 = new User();
		//�Ű����� �ִ� �����ڸ� ���� ���¿��� �⺻ �����ڸ� ������ �� ���� ����
		//Duplicate method User() in type User
		u1.inform();
		
		User u2 = new User("id�Դϴ�","pwd�Դϴ�");
		u2.inform();
		
		User u3 = new User("id�Դϴ�","pwd�Դϴ�","�̸��Դϴ�");
		u3.inform();
		
		
	}
}
