package com.kh.run;

import com.kh.operator.A_LogicalNegation;
import com.kh.operator.B_InDecrease;
import com.kh.operator.C_Arithmetic;
import com.kh.operator.D_Comparison;
import com.kh.operator.E_Logical;
import com.kh.operator.F_Compound;
import com.kh.operator.G_Triple;

public class Run {
	public static void main(String args[]) {
		A_LogicalNegation al = new A_LogicalNegation();
//		al.method1();
		B_InDecrease bi = new B_InDecrease();
//		bi.method1();
//		bi.method2();
//		bi.method3();
//		bi.method4();
		C_Arithmetic ca = new C_Arithmetic();
//		ca.method1();
//		ca.method2();
		D_Comparison dc = new D_Comparison();
//		dc.method();
		E_Logical el = new E_Logical();
//		el.method1();
//		el.method2();
		F_Compound fc = new F_Compound();
//		fc.method();
		G_Triple gt = new G_Triple();
//		gt.method();
		gt.method2();
	}
}
