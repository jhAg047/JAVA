package com.kh.run;

import com.kh.variable.A_Variable; // 패키지 오류 해결! com.kh.variable.A_Variable 위치를 알려줌
import com.kh.variable.B_Constant;
import com.kh.variable.C_Overflow;
import com.kh.variable.D_Cast;
import com.kh.variable.E_PrintMethod;
import com.kh.variable.F_KeyboardInput;


public class Run {
	public static void main (String[] args) { //메인 메소드 : 실행 
		A_Variable av = new A_Variable(); // A_Variable이라는 외부 클래스를 가져다 쓰겄다!,import 안하면 패키지가 달라서 오류가 뜸
//		av.declareVariable(); // av 안에 있는 declareVariable 메소드를 불러다 쓰겄다!
//		av.initVariable(); // av 안에 있는 initVariable 메소드를 불러다 쓰기 .=> 안으로 들어가겠다
		B_Constant bc = new B_Constant(); 
		//bc.finalConstant();
		
		//import 단축키 shift + ctrl + o
		C_Overflow co = new C_Overflow(); //import안하면 위치 몰라서 오류
		//co.overflow();
		//co.calc(); 
		D_Cast dc = new D_Cast();
		//dc.rule1();
		//dc.rule3();
		E_PrintMethod ep = new E_PrintMethod();
//		ep.printExample(); 
//		ep.printlnExample();
//		ep.printfExample();
		F_KeyboardInput fk = new F_KeyboardInput();
//		fk.inputScanner();
		fk.inputScanner2();
	}
	
}
