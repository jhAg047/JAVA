package com.kh.example.chap04_io.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.kh.example.chap04_io.model.vo.Person;

public class ServerController {
	public void startServer() {
		//1. ���� ��Ʈ ��ȣ ���ϱ�
		int port = 8500;
		
		try {
			//2. ServerSocket���� ���� ���� ��ü ���� �Ű������� ��Ʈ��ȣ 
			ServerSocket server = new ServerSocket(port);
			//3. Ŭ���̾�Ʈ�� ��û�� ���ö����� ���
			System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� ��...");
			//4. Ŭ���̾�Ʈ�� ��û�� ������ accept()�� �̿��ؼ� ��û������ Ŭ���̾�Ʈ�� ���� ��ü ����
			Socket client = server.accept();
			
			//5. ����� ��Ʈ�� ����
			//6. ������Ʈ���� ���� ���� ����
			InputStream in = client.getInputStream();
			ObjectInputStream ois= new ObjectInputStream(in);
			
			//7. ��Ʈ���� �̿��ؼ� �а� ����
			Person message = null;
			while(true) {
				message = (Person)ois.readObject();
				
				if(message != null) {
					System.out.println(client.getInetAddress().getHostAddress() +"�� ���� �޼��� : " + message);
				} else {
					break;
				}
			}
			//8. ��� ����
			ois.close();
			server.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
