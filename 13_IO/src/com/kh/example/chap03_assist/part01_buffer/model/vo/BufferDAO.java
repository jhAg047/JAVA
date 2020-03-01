package com.kh.example.chap03_assist.part01_buffer.model.vo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDAO {
	public void output() {
		try(FileWriter fw = new FileWriter("c_buffer.txt");
				BufferedWriter bw = new BufferedWriter(fw);){
			// 이 자체로도 데이터를 출력(저장)할 수 있음
			// 하지만 여기에 성능향상을 시키고 싶어서 보조스트림을 달 예정임
			// 성능향상과 관련된 보조스트림은 BufferedXXXX인데
			// 종류가 4개 ==> BufferedInputStream 
			//			  BufferedReader
			//            BufferedOutputStream
			//            BufferedWriter
			// 이 중 무엇을 써야하지? ==> BufferedWriter 보조 스트림은 기반스트림과 InputStream/OutputStream/Reader/Writer가 동일해야함 
			//보조스트림은 매개변수로 기반스트림을 받는다.
			//보조스트림 사용시에는 보조스트림만 닫아도 상관은 없다.
			bw.write("안녕하세요\n");
			bw.write("반갑습니다\n");
			bw.write("저리가세요\n");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void input() {
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"));) {
//		FileReader fr = new FileReader("c_buffer.txt");
//		BufferedReader br = new BufferedReader(fr);
		//close는 항상 IOException 처리 해야함
			String value;
			while((value = br.readLine()) != null ) {
			System.out.println(value);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		}
}
