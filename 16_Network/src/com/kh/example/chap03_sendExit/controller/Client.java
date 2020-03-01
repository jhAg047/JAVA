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
			//1. ���� IP�ּҿ� ������ ��Ʈ��ȣ�� �Ű������� �ϴ� Ŭ���̾�Ʈ�� ���� ��ü ����
			int port = 8500; // ��Ʈ��ȣ 
			String serverIP = InetAddress.getLocalHost().getHostAddress(); //������ �� ������ �ּҷ� �̷��� ������ ������ �ٸ� ����� ������ �ּҸ� �����
			Socket socket = new Socket(serverIP, port); // ���� ���н� null ��ȯ
			
			if(socket != null) {
				//2. ����� ��Ʈ�� ���� 
				InputStream input = socket.getInputStream();
				OutputStream output = socket.getOutputStream();
				//3. ���� ��Ʈ������ ���ɰ���
				BufferedReader br = new BufferedReader(new InputStreamReader(input));
				PrintWriter pw = new PrintWriter(output);
				
				Scanner sc = new Scanner(System.in);
				
				do {
					// 4. ��Ʈ���� ���� �а� ����
					System.out.print("��ȭ �Է� : ");
					String message = sc.nextLine();
					
					pw.println(message);
					pw.flush();
					if(message.equals("exit")) {
						break;
					}
					String recieveMessage = br.readLine();
					System.out.println(recieveMessage);
				} while(true);
				
				// 5. ��� ����
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
