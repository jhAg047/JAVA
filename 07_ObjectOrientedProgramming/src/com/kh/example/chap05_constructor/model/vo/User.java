package com.kh.example.chap05_constructor.model.vo;

import java.util.Date;

public class User {
	// - = private
	//- userId : String
	//- userPwd : String
	//- userName : String
	//- enrollDate : Date(java.util)
	private String userId;
	private String userPwd;
	private String userName;
	private Date enrollDate;
	
	//������ ��� ����(��ü�� �ϴ� ��)
	//		1. ��ü�� �������ֱ� ���� ����
	// 		2. �Ű������� ���޹��� ������ �ʵ� �ʱ�ȭ�ϴ� ����
	
	//������ ��� ��Ģ
	//		1. �����ڸ��� Ŭ������� �����ؾ��Ѵ�
	//		2. ��ȯ��(������)�� �������� ���� 
	
	public User() {} // �⺻ ������  : �Ű������� ���� ������
	//JVM�� �⺻������ ��������
	//�Ű����� �ִ� �����ڸ� ����� JVM�� �ڵ����� ���������� �ʱ� ������ �ݵ�� ����ؾ���
	
//	public User() {} 
	//Duplicate method User() in type User : �޼ҵ� User()�� �ߺ��� ��? �����ε��� ����X
	//���� �̸��� ������(�޼ҵ�)�� ���� �� �����ε��� ������������� ���� �߻�
	
	//���� �̸��̶�� ���������� �켱���� ������
	public User(String userId,String userPwd) { //�Ű������� ������ �޶� �����ε� ����
		//this. �� ������ ���� ã�°� : ��������
		this.userId = userId; //���������� �켱���� �������°Ŷ� �ƹ� ȿ���� ���� 
		this.userPwd = userPwd;
	}
	
	public User(String userId,String userPwd,String userName) {
//		this.userId = userId;
//		this.userPwd = userPwd;
		this(userId,userPwd); //���� �ִ�User(Stirng userId,String userPwd) ȣ��
		this.userName = userName;
	}
	
	public User(String userId,String userPwd,String userName,Date enrollDate)
		{
		//1) ������ ���� 
//		this.userId = userId;
//		this.userPwd = userPwd;
//		this.userName = userName;
//		this.enrollDate = enrollDate;
		
		//2) this() ���
		this(userId,userPwd,userName);
		this.enrollDate = enrollDate;
	}
		
	
//	public User(String id,String name) { 
//		//Duplicate method User(String, String) in type User
//		//���� ���� Ÿ���� ���Ƽ� �����ε��� �ȵ� �Ű������� �̸��� �޶� Ÿ���̶� ������ ���Ƽ� �ȵ�
//		
//		userId = id;
//		userName = name;
//	}
	public void inform() {
		System.out.println(userId +", "+userPwd+", "+userName+", "+enrollDate);
	}
}
