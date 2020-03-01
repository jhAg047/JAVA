package com.kh.example.chap01_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
	public void fileOpen() {
		
		try(FileInputStream fis = new FileInputStream("a_byte.txt");) {
//			abcdefgcde
//			while(fis.read() != -1) { //fis 한번 읽어오고 a들어가는데  : a, c ~~
//				System.out.print((char)fis.read() + " "); //fis 두번 읽어서 b 들어감 :b, d ~~
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
		try(FileOutputStream fos = new FileOutputStream("a_byte.txt");) { //예외가 발생할수있는 코드를 넣어놓는곳
			//("a_byte.txt",boolean append) true : 이어붙이기
			// write(int b) : void 
			fos.write(97);
			
			// write(byte[] b) : void
			byte[] bArr = {98, 99, 100, 101, 102, 103};
			//			   b   c    d    e    f    g 
			fos.write(bArr);
			
			//write(byte[] b, int off, int len):void
			fos.write(bArr,1,3); // 1 index 부터 3개 : cde
			//원래 있던 내용에 덮어씌워짐(한묶음)
		} catch(FileNotFoundException e) { 
			e.printStackTrace();
		} catch(IOException e) { //catch는 여러개 있어도 상관X exception 상속관계 고려 (좁은거부터 넓은걸로)
			e.printStackTrace();
		}
	}
}
