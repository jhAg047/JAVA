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
		System.out.print("���� ���� : ");
		int[] cArr = new int[10];
		int num = sc.nextInt();
		for(int i =0;i < num;i++) {
			cArr[i] = i+1;
			System.out.print(cArr[i]+" ");
		}
	}
	public void practice4() {
		String[] dArr = {"���","��","����","������","����"};
		System.out.print(dArr[1]);
	}
	public void practice5(){
		System.out.print("���ڿ� : ");
		String a = sc.nextLine();
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);
		char[] eArr = new char[a.length()];
		for(int i=0;i < eArr.length;i++) {
			eArr[i] =(a.charAt(i));
		}
		System.out.printf("%s�� %c�� �����ϴ� ��ġ(�ε���) : ",a,ch);
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
		System.out.printf("%c�� ���� : %d",ch,count);
	
		}
		public void practice6() {
			char[] week = {'��','ȭ','��','��','��','��','��'};
			System.out.print("0 ~ 6 ���� ���� �Է� : ");
			int num = sc.nextInt();
			if (num <= 6) {
				System.out.println(week[num]+"����");
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		public void practice7() {
			System.out.print("���� : ");
			int num =sc.nextInt();
			int sum =0;
			int[] fArr = new int[num];
			for(int i=0;i<num;i++) {
				System.out.printf("�迭 %d��° �ε����� ���� �� : ",i);
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
			System.out.print("���� : ");
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
				System.out.println("�ٽ� �Է��ϼ���.");
				practice8();
				}
			} 
		//?
		public void practice9() {
			System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
			String name = sc.nextLine();
			String[] chicken = {"���","�Ķ��̵�"};
			String[] a = new String[name.length()];
			a = name.split(name);
			if (a.equals(chicken)) {
				System.out.printf("%sġŲ ��� ����", name);
			} else {
				System.out.printf("%sġŲ�� ���� �޴� �Դϴ�.", name);
			}
		}
		public void practice10() {
			System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
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
			int max=a[0]; //�ִ밪�� �迭�� ù���� ������ �ʱ�ȭ
			int min=a[0]; //�ּҰ��� �迭�� ù���� ������ �ʱ�ȭ
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
			System.out.print("���ڿ� : ");
			String str = sc.nextLine();
			char[] hArr = new char[str.length()];
			System.out.print("���ڿ��� �ִ� ���� : ");
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
			System.out.println("���� ���� : " + str.length());
		}
		}
