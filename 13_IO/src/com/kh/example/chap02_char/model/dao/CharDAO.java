package com.kh.example.chap02_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDAO {
	public void fileSave() {
		try(FileWriter fw = new FileWriter("b_char.txt")) {  //;은 스트림의 종류가 많을때 사용
		fw.write("와, IO 정말 재밌다!");
		fw.write('A');
		fw.write(' ');
		char[] cArr = {'a','p','p','l','e'};
		fw.write(cArr);
		} catch(IOException e) {
			e.printStackTrace();
		} 
	}
	public void fileOpen() {
		try(FileReader fr = new FileReader("b_char.txt")) {

		int value; //임시변수
		while((value =fr.read()) != -1){//char를 읽어오는데 읽어올게 없으면 -1 반환
			System.out.print((char)value + " ");
		}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} 
	}
}
