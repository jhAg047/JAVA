package com.kh.example.chap02_sendMsg.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	// ServerSocket
	//		��Ʈ�� ����Ǿ� �ܺ��� ��û�� ��ٸ��� ��û�� ������ 
	//		Socket�� �����Ͽ� ���ϰ� ���ϰ��� ����� �̷�������� ��
	//		�� ��Ʈ�� �� ServerSocket�� ���ᰡ��
	// Socket
	//		���μ��� �� ��� ���
	//		InputStream/OutputStream ���� : �� ��Ʈ���� ���� ���μ��� ���� ���(�����)�� �̷����
	public void serverStart() {
		// ������ TCP���� ���α׷��� ����
		// 1. ���� ��Ʈ��ȣ ����
		// 2. ������ ���� ��ü ���� �� ��Ʈ�� ����
		// 3. Ŭ���̾�Ʈ�� ��û�� ���⸦ ��ٸ�
		// 4. Ŭ���̾�Ʈ�� ���� ��û�� ������ ���� ������ (accept()) Ŭ���̾�Ʈ�� ���� ���� ����
		// 5. ����� Ŭ���̾�Ʈ�� ����� ��Ʈ�� ����
		// 6. ���� ��Ʈ���� ���� ���� ����
		// 7. ��Ʈ���� ���� �а� ����
		// 8. ��� ����
		
		// 1. ���� ��Ʈ��ȣ ����
		int port = 8500; //��Ʈ��ȣ ���� : 0~65535(1023�� ���ϴ� �̹� ��� ���� ��Ʈ�� ������ �̿��� ��Ʈ �����ϱ�,��κ� 3000���̻��̳� 5000�� �̻��� ����)
		try {
			// 2. ������ ���� ��ü(ServerSocket) ���� �� ��Ʈ�� ����
			ServerSocket server = new ServerSocket(port);
			// 3. Ŭ���̾�Ʈ�� ��û�� ���⸦ ��ٸ�
			System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� �ֽ��ϴ�..");
			
			// 4. Ŭ���̾�Ʈ�� ���� ��û�� ������ ���� ������ (accept()) Ŭ���̾�Ʈ�� ���� ���� ����
			Socket client = server.accept();
			String clientIP = client.getInetAddress().getHostAddress();
			System.out.println(clientIP + "�� ������ ��û��..");
	
			// 5. ����� Ŭ���̾�Ʈ�� ����� ��Ʈ�� ���� - Socket�� ����� ��Ʈ���� ������ ���� 
			InputStream input = client.getInputStream(); // ����Ʈ ���
			OutputStream output = client.getOutputStream(); // ����Ʈ ���
			
			// 6. ���� ��Ʈ���� ���� ���� ����
			BufferedReader br = new BufferedReader(new InputStreamReader(input)); // ���ڱ�� ����Ʈ���� ���ڷ� �ٲ������
			PrintWriter pw = new PrintWriter(output); //println�� ������ִ°�
			
			// 7. ��Ʈ���� ���� �а� ����
			String message = br.readLine(); // �ٷ� �о���� �޼ҵ�
			System.out.println(clientIP + "�� ���� �޼��� : " + message);
			pw.println("������ �ݰ����ϴ�.");
			pw.flush(); // ���ۿ� ���� �ִ� ���� ���� ����
			
			// 8. ��� ����
			pw.close();
			br.close();
			output.close();
			input.close();
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
