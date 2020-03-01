package com.kh.example.chap06_method.run;

import com.kh.example.chap05_constructor.model.vo.User;
import com.kh.example.chap06_method.controller.MethodTest;
import com.kh.example.chap06_method.model.vo.Trainee;

public class Run {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		mt.method1(); //반환값이 없어서 담을수가 없다,호출만 하고 끝남(내용실행 후 종료)
		
		int result = mt.method2();
		System.out.println(result);
		System.out.println(mt.method2());
		
		mt.method3(10, 20);
		
		int result2 = mt.method4(10, 30);
		System.out.println(result2);
		System.out.println(mt.method4(10, 30));

		// 심화 1
		int[] resultArr = mt.method5();
		System.out.println("Run resultArr : "+ resultArr);
		// 심화 2
		User user = mt.method6();
		System.out.println("Run user: "+user);
		
		///////////////////////////////////////////
		
		Trainee tt = new Trainee("전희은"); //대기생
		System.out.println(tt.inform());
		
		// 더 알아보니까 KH 너무 좋네~~ 다녀야겠다
		// 등록할게요~~!~!~!~!
		// ㅇㅋ 시험보세요~~! ==> 시험결과 20점
		Trainee.setScore(20);
		System.out.println(tt.inform());
		double score = Trainee.getScore();
		System.out.println(score);
		
		// 시험이 20점이네요 
		// 가장 가까운 개강일이 12월 23일
		// g반인데 등록할꺼?
		// ㅇㅇ => G
		tt.setClassRoom('G');
		System.out.println(tt.inform());
		System.out.println(tt.getClassRoom());
		
	}
}
