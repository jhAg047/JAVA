package com.kh.example.chap01_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
	public void fileOpen() {
		
		try(FileInputStream fis = new FileInputStream("a_byte.txt");) {
//			abcdefgcde
//			while(fis.read() != -1) { //fis �ѹ� �о���� a���µ�  : a, c ~~
//				System.out.print((char)fis.read() + " "); //fis �ι� �о b �� :b, d ~~
////				Reads the next byte of data from this input stream.
//			}
			int value;
			while((value = fis.read()) != -1) {
				System.out.print((char)value + " ");
			}
			
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void fileSave() {
		try(FileOutputStream fos = new FileOutputStream("a_byte.txt");) { //���ܰ� �߻��Ҽ��ִ� �ڵ带 �־���°�
			//("a_byte.txt",boolean append) true : �̾���̱�
			// write(int b) : void 
			fos.write(97);
			
			// write(byte[] b) : void
			byte[] bArr = {98, 99, 100, 101, 102, 103};
			//			   b   c    d    e    f    g 
			fos.write(bArr);
			
			//write(byte[] b, int off, int len):void
			fos.write(bArr,1,3); // 1 index ���� 3�� : cde
			//���� �ִ� ���뿡 �������(�ѹ���)
		} catch(FileNotFoundException e) { 
			e.printStackTrace();
		} catch(IOException e) { //catch�� ������ �־ ���X exception ��Ӱ��� ��� (�����ź��� �����ɷ�)
			e.printStackTrace();
		}
	}
}
