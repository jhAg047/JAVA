package com.kh.practice.dimension;

public class DimensionPractice {
	public void practice1() {
		int value =0;
		int[][] iArr = new int[3][3];
		for(int i=0; i<iArr.length;i++) {
			for(int j=0;j<iArr[i].length;j++) {
				iArr[i][j] =value;
			}
			System.out.println();
		}
		for(int i=0; i<iArr.length;i++) {
			for(int j=0;j<iArr[i].length;j++) {
				System.out.printf("(%d,%d)",iArr[i],iArr[j]);
			}
			System.out.println();
		}
	}
//	public void practice2() {
//		int[][] bArr = new int[4][4];
//		int value =1;
//		for(int i=0;)
//	}
}
