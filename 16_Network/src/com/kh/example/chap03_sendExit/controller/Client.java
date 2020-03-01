package com.kh.example.chap03_sendExit.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public void startClient() {
		try {
			//1. 서버 IP주소와 서버의 포트번호를 매개변수로 하는 클라이언트용 소켓 객체 생성
			int port = 8500; // 포트번호 
			String serverIP = InetAddress.getLocalHost().getHostAddress(); //지금은 내 아이피 주소로 이렇게 쓰지만 원래는 다른 사람의 아이피 주소를 써야함
			Socket socket = new Socket(serverIP, port); // 연결 실패시 null 반환
			
			if(socket != null) {
				//2. 입출력 스트림 생성 
				InputStream input = socket.getInputStream();
				OutputStream output = socket.getOutputStream();
				//3. 보조 스트림으로 성능개선
				BufferedReader br = new BufferedReader(new InputStreamReader(input));
				PrintWriter pw = new PrintWriter(output);
				
				Scanner sc = new Scanner(System.in);
				
				do {
					// 4. 스트림을 통해 읽고 쓰지
					System.out.print("대화 입력 : ");
					String message = sc.nextLine();
					
					pw.println(message);
					pw.flush();
					if(message.equals("exit")) {
						break;
					}
					String recieveMessage = br.readLine();
					System.out.println(recieveMessage);
				} while(true);
				
				// 5. 통신 종료
				 br.close();
				 pw.close();
				 socket.close();
				
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
