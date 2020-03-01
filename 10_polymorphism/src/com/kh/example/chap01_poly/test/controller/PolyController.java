package com.kh.example.chap01_poly.test.controller;

import com.kh.example.chap01_poly.test.model.vo.Child1;
import com.kh.example.chap01_poly.test.model.vo.Child2;
import com.kh.example.chap01_poly.test.model.vo.Parent;

public class PolyController {
	
	public void method() {
		System.out.println("1. 부모타입 레퍼런스로 부모 객체를 다루는 경우");
		Parent p = new Parent();
		// ㄴ부모타입 레퍼런스              ㄴ 부모 객체
		p.printParent();
		System.out.println();
		System.out.println("2. 자식타입 레퍼런스로 자식 객체를 다루는 경우");
		Child1 c1 = new Child1();
		// ㄴ 자식타입 레퍼런스          ㄴ 자식 객체
		c1.printChild1();
		c1.printParent();
		
		System.out.println();
		
		System.out.println("3. 부모타입 레퍼런스로 자식 객체를 다루는 경우");
		Parent p2 = new Child2(); // 다형성 - 자식 객체가 부모 레퍼런스에 담기는거 = 업 캐스팅
//		Parent p3 = new Child1(); // 다형성
		p2.printParent(); // 업 캐스팅 * 부분 예제
		((Child2)p2).printChild2(); // 부모가 자식으로 바뀌는거 = 다운 캐스팅 /형변환 해야함
		// 형변환 = 시야 넓어짐 그래서 오류 X
		//객체를 만든건 둘째인데 타입이 Parent라서 Parent영역밖에 못봄
		//Child2 영역까지 보고싶으면 형변환을 통해서 확장시키기 가능
		
		System.out.println();
		
		System.out.println("4. 자식타입 레퍼런스로 부모 객체를 다루는 경우");
//		Child2 c2 = new Parent(); // 에러 : 더 작은 영역(Parent)에서 더 큰 영역(Child2)을 보고 싶어해서 오류가 남
		// 형변환 해도 아예 없는 상태에서 형변환 해도 오류 
//		Child2 c2 = (Child2) new Parent(); // 형변환 해도 아예 없는 상태에서 형변환 해도 오류  객체를 확장할수는 없음
		//더이상 할 수 있는게 없다~~!
		//Type mismatch: cannot convert from Parent to Child2
		
		System.out.println();
		System.out.println("=== 간단 예제  ===");
		System.out.println();
		
		Parent[] pArr = new Parent[4];
		pArr[0] = new Child1();
		pArr[1] = new Child2();
		pArr[2] = new Child1();
		pArr[3] = new Child2();
		
		for(int i =0; i<pArr.length;i++) {
			if(pArr[i] instanceof Child1) {
				((Child1)pArr[i]).printChild1();
			} 
			else if(pArr[i] instanceof Child2) {
				((Child2)pArr[i]).printChild2();
			}
		}
		
		for(int i=0;i<pArr.length;i++) {
			//동적 바인딩
			pArr[i].print(); //오버라이딩이 되어있을때는 자식 객체를 통한 실행 시 후손 것이 우선권을 가짐
		}
		
		
	}
}
