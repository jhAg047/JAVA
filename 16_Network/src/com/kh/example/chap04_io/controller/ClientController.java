package com.kh.example.chap04_io.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import com.kh.example.chap04_io.model.vo.Person;

public class ClientController {
	public ClientController() {
	// �⺻������ ������ ��ü�� ���Ϸ� �����
	// ��ü�� ���Ϸ� �����ϱ� ���� Stream ���� (���� �̸� : person.txt)
	try (FileOutputStream fos = new FileOutputStream("person.txt");
		 ObjectOutputStream oos = new ObjectOutputStream(fos);) {
		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("������",23));
		list.add(new Person("���ǰ�",30));
		list.add(new Person("������",25));
		
		for(Person p : list) {
			oos.writeObject(p);
		}
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch(IOException e) {
		e.printStackTrace();
	}
	}
	public void startClient() {
		// 1. ���� IP�ּҿ� ���� ��Ʈ��ȣ�� �Ű������� �ϴ� Ŭ���̾�Ʈ ���� ����
		try {
			String serverIP = InetAddress.getLocalHost().getHostAddress();
			Socket socket = new Socket(serverIP, 8500);
			
			if(socket != null) {
				// 2. ����� ��Ʈ�� ���� 
				// 3. ������Ʈ���� ���� ���� ���
				// ��ü�� ���Ϸ� ����� �о����
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"));
				// ��ü�� ������ �������� ����� ����
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				// 4. ��Ʈ���� ���� �а� ����
					try {
						while(true) {
						Person p =(Person)ois.readObject();
						oos.writeObject(p); //EOFException �߻�
						}
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch(EOFException e) {
						//EOFException�� �߻��ߴ�? ==> ������ ���� �����ߴ�
						oos.writeObject(null);
						oos.flush();
						// 5. ��� ����
						ois.close();
						oos.close();
						socket.close();
					}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
