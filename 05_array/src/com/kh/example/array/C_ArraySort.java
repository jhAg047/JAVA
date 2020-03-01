package com.kh.example.array;

import java.util.Arrays;

public class C_ArraySort {
	public void method1() {
		//변수의 두 값 변경하기
		int num1 =10;
		int num2 =20;
		
		System.out.println("num1 : " +num1);
		System.out.println("num2 : " +num2);
		
//		num1 = num2;
//		num2 = num1;
		
		int temp; //임시로 값을 저장할 변수 생성
		temp =num1; //temp=10
		num1 =num2; //num1=20
		num2 =temp;
		System.out.println("num1 : " +num1);
		System.out.println("num2 : " +num2);
		
		int[] arr = {2,1,3};
		int temp2;
		temp2 = arr[0];
		arr[0] = arr[1];
		arr[1] = temp2;
		
	}
	public void method2() {
		//sort 메소드
		int[] iArr = {2,5,4,6,1,3};
		
		for(int i=0; i<iArr.length;i++) {
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
		
		//정렬
		Arrays.sort(iArr);
		
		for (int i =0; i<iArr.length; i++) {
			System.out.print(iArr[i]+" ");
		}
		
	}
}
