package com.kh.example.chap02_class.publicClass.run;

//PublicClassTest�� ��ġ�� ã������ import ��� 
import com.kh.example.chap02_class.publicClass.controller.PublicClassTest;



public class Run {
	public static void main(String[] args) {
//		PublicClassTest pct = new PublicClassTest();
		//import ���ϴ� ��� : ��θ� �پ���
		//�̸��� ������ ��Ű���� �ٸ��� ��� ex) Date��Ű�� 
		com.kh.example.chap02_class.publicClass.controller.PublicClassTest pct = new com.kh.example.chap02_class.publicClass.controller.PublicClassTest();
		pct.test();
	}
}
