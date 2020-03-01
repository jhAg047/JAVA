package com.kh.practice.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		int[] aArr = new int[10];
		for(int i = 0;i<aArr.length;i++) {
			aArr[i] = i+1; 
		System.out.print(aArr[i]+" ");
	}
	}
	public void practice2() {
		int[] bArr = new int[10]; 
		for(int  i= 0;i<bArr.length;i++ ) {
			bArr[i] = 10 - i;
			System.out.print(bArr[i]+" ");
		}
	}
	public void practice3() {
		System.out.print("양의 정수 : ");
		int[] cArr = new int[10];
		int num = sc.nextInt();
		for(int i =0;i < num;i++) {
			cArr[i] = i+1;
			System.out.print(cArr[i]+" ");
		}
	}
	public void practice4() {
		String[] dArr = {"사과","귤","포도","복숭아","참외"};
		System.out.print(dArr[1]);
	}
	public void practice5(){
		System.out.print("문자열 : ");
		String a = sc.nextLine();
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		char[] eArr = new char[a.length()];
		for(int i=0;i < eArr.length;i++) {
			eArr[i] =(a.charAt(i));
		}
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ",a,ch);
		for(int j=0;j<eArr.length;j++) {
			if(eArr[j]==ch) {
				System.out.print(j + " ");
			}
		}
		System.out.println();
		int count=0;
		for(int h=0;h<eArr.length;h++) {
			if(eArr[h]==ch) {
				count++;
			}
		}
		System.out.printf("%c의 개수 : %d",ch,count);
	
		}
		public void practice6() {
			char[] week = {'월','화','수','목','금','토','일'};
			System.out.print("0 ~ 6 사이 숫자 입력 : ");
			int num = sc.nextInt();
			if (num <= 6) {
				System.out.println(week[num]+"요일");
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		public void practice7() {
			System.out.print("정수 : ");
			int num =sc.nextInt();
			int sum =0;
			int[] fArr = new int[num];
			for(int i=0;i<num;i++) {
				System.out.printf("배열 %d번째 인덱스에 넣을 값 : ",i);
				fArr[i] =sc.nextInt();
				sum =+ fArr[i];
			}
			for(int j=0;j<num;j++) {
				System.out.print(fArr[j] +" ");
			}
			System.out.println();
			System.out.print(sum);
		}
		public void practice8() {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			int[] gArr = new int[num];
			if (num >= 3 && num%2 != 0) {
				for(int i=0;i<gArr.length;i++) {
					if(i <= num/2) {
						gArr[i] = i+1;
					} else {
						gArr[i] = num-i;
					}
					System.out.print(gArr[i]);
				}
			}
			
			else {
				System.out.println("다시 입력하세요.");
				practice8();
				}
			} 
		//?
		public void practice9() {
			System.out.print("치킨 이름을 입력하세요 : ");
			String name = sc.nextLine();
			String[] chicken = {"양념","후라이드"};
			String[] a = new String[name.length()];
			a = name.split(name);
			if (a.equals(chicken)) {
				System.out.printf("%s치킨 배달 가능", name);
			} else {
				System.out.printf("%s치킨은 없는 메뉴 입니다.", name);
			}
		}
		public void practice10() {
			System.out.print("주민등록번호(-포함) : ");
			String str = sc.nextLine();
			char[] a = new char[str.length()];
			char[] b= new char[str.length()];
			System.arraycopy(a,0, b, 0, a.length);
			for(int i=0;i < b.length;i++) {
				b[i] =(str.charAt(i));
				if(i <=7) {
				System.out.print(b[i]);
			} else {
				System.out.print("*");
			}
	}
		}
		public void practice11() {
			int[] a = new int[10];
			for(int i=0;i<a.length;i++){
			double d = Math.random();
			a[i] = (int)(d*10)+1;
			System.out.print(a[i]+" ");
		}
		}
		public void practice12() {
			int[] a = new int[10];
			for(int i=0; i<a.length;i++) {
				double d =Math.random();
				a[i] = (int)(d*10) +1;
				System.out.print(a[i]+" ");
			}
			System.out.println();
			int max=a[0]; //최대값을 배열의 첫번쨰 값으로 초기화
			int min=a[0]; //최소값을 배열의 첫번쨰 값으로 초기화
			for(int s = 1;s<a.length;s++) {
				if(a[s] > max) {
					max=a[s];
				} else if(a[s] < min) {
					min=a[s];
				}
			}
			System.out.println(max);
			System.out.println(min);
		}
		public void practice13() {
			int[] a = new int[10];
			double d =Math.random();
			for(int i=0; i<a.length;i++) {
				a[i] = (int)(d*10) +1;
			for(int j=0;j<i;j++) {
				if(a[i]!=a[j]) {
					break;
				}
				}
				System.out.print(a[i]+" ");
		}
			}
		public void practice14() {
			int[] a = new int[6];
			Random r = new Random();
			for(int i=0;i<a.length;i++)
			{
				
			}
		}
		public void practice15() {
			System.out.print("문자열 : ");
			String str = sc.nextLine();
			char[] hArr = new char[str.length()];
			System.out.print("문자열에 있는 문자 : ");
			for(int i =0;i<hArr.length;i++) {
				hArr[i] = (str.charAt(i));
				for(int j=0;j<i;j++) {
				if(hArr[i]==hArr[j]) {
					i--;
					break;
				} 
				}
				System.out.print(hArr[i]+", ");
			}
			System.out.println();
			System.out.println("문자 개수 : " + str.length());
		}
		}
