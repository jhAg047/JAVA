package com.kh.run;

import com.kh.variable.A_Variable; // ��Ű�� ���� �ذ�! com.kh.variable.A_Variable ��ġ�� �˷���
import com.kh.variable.B_Constant;
import com.kh.variable.C_Overflow;
import com.kh.variable.D_Cast;
import com.kh.variable.E_PrintMethod;
import com.kh.variable.F_KeyboardInput;


public class Run {
	public static void main (String[] args) { //���� �޼ҵ� : ���� 
		A_Variable av = new A_Variable(); // A_Variable�̶�� �ܺ� Ŭ������ ������ ���δ�!,import ���ϸ� ��Ű���� �޶� ������ ��
//		av.declareVariable(); // av �ȿ� �ִ� declareVariable �޼ҵ带 �ҷ��� ���δ�!
//		av.initVariable(); // av �ȿ� �ִ� initVariable �޼ҵ带 �ҷ��� ���� .=> ������ ���ڴ�
		B_Constant bc = new B_Constant(); 
		//bc.finalConstant();
		
		//import ����Ű shift + ctrl + o
		C_Overflow co = new C_Overflow(); //import���ϸ� ��ġ ���� ����
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
