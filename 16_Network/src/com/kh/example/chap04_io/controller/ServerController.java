package com.kh.example.chap04_io.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.kh.example.chap04_io.model.vo.Person;

public class ServerController {
	public void startServer() {
		//1. 서버 포트 번호 정하기
		int port = 8500;
		
		try {
			//2. ServerSocket으로 서버 소켓 객체 생성 매개변수는 포트번호 
			ServerSocket server = new ServerSocket(port);
			//3. 클라이언트의 요청이 들어올때까지 대기
			System.out.println("클라이언트의 요청을 기다리는 중...");
			//4. 클라이언트의 요청이 들어오면 accept()를 이용해서 요청수락후 클라이언트용 소켓 객체 생성
			Socket client = server.accept();
			
			//5. 입출력 스트림 생성
			//6. 보조스트림을 통한 성능 개선
			InputStream in = client.getInputStream();
			ObjectInputStream ois= new ObjectInputStream(in);
			
			//7. 스트림을 이용해서 읽고 쓰기
			Person message = null;
			while(true) {
				message = (Person)ois.readObject();
				
				if(message != null) {
					System.out.println(client.getInetAddress().getHostAddress() +"가 보낸 메세지 : " + message);
				} else {
					break;
				}
			}
			//8. 통신 종료
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
