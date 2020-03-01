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
	// 기본생성자 생성시 객체를 파일로 만들기
	// 객체를 파일로 저장하기 위한 Stream 구현 (파일 이름 : person.txt)
	try (FileOutputStream fos = new FileOutputStream("person.txt");
		 ObjectOutputStream oos = new ObjectOutputStream(fos);) {
		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("전희은",23));
		list.add(new Person("강건강",30));
		list.add(new Person("남나눔",25));
		
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
		// 1. 서버 IP주소와 서버 포트번호를 매개변수로 하는 클라이언트 소켓 생성
		try {
			String serverIP = InetAddress.getLocalHost().getHostAddress();
			Socket socket = new Socket(serverIP, 8500);
			
			if(socket != null) {
				// 2. 입출력 스트림 생성 
				// 3. 보조스트림을 통한 성능 향상
				// 객체를 파일로 만든걸 읽어오기
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"));
				// 객체를 서버에 보내려는 기반을 생성
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				// 4. 스트림을 통한 읽고 쓰기
					try {
						while(true) {
						Person p =(Person)ois.readObject();
						oos.writeObject(p); //EOFException 발생
						}
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch(EOFException e) {
						//EOFException이 발생했다? ==> 문서의 끝에 도달했다
						oos.writeObject(null);
						oos.flush();
						// 5. 통신 종료
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
