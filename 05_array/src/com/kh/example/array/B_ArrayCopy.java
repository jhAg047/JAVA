package com.kh.example.array;

import java.util.Arrays;

public class B_ArrayCopy {
	// 얕은 복사 : 배열의 주소만 복사
	// 깊은 복사 : 동일한 새로운 배열을 생성하여 실제 내부 값 복사
	// 깊은 복사 4가지 방법
	//		1) for문을 이용한 1:1 복사
	//		2) System.arraycopy() 이용한 복사
	//		3) Arrays.copyOf() 이용한 복사
	//		4) clone() 이용한 복사 : 앵간하면 사용하지 말라고 경고 메세지 뜸 
	public void method1() {
		// 얕은 복사
		int[] originArr = {1,2,3,4,5};
		int[] copyArr= originArr;
		for(int i =0; i<originArr.length;i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println();
		for(int i =0;i<copyArr.length;i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
		
		//원본 배열의 0번째 인덱스를 99로 변경 
		originArr[0] =99;
		
		//같은 주소값을 참조하고있기때문에 하나를 바꾸면 다른것도 바뀜
		for(int i=0; i<originArr.length;i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i =0;i<copyArr.length;i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
		
		System.out.println("originArr의 주소값 : " + originArr);
		System.out.println("copyArr의 주소값 : "+ copyArr);
	}
	public void method2() {
		// 깊은 복사  1. for문 이용
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[5];
		
		for(int i =0; i<originArr.length;i++) {
			copyArr[i] = originArr[i];
		}
		System.out.println("===== 복사 직후 =====");
		for(int i =0; i<originArr.length;i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for (int i=0; i<copyArr.length;i++) {
			System.out.print(copyArr[i] +" ");
		}
		System.out.println();
		
		System.out.println("===== originArr의 0번째 인덱스를 99로 변경 =====");
		originArr[0] =99;
		
		for(int i =0; i < originArr.length;i++) {
			System.out.print(originArr[i] + " ");
		} 
		System.out.println();
		for(int i =0; i<copyArr.length;i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
	}
	public void method3() {
		//깊은 복사2 : arrayCopy() 이용
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
//		System.arraycopy(src, srcPos, dest, destPos, length);
		//scr : 원본배열 
		//scrPos : 원본배열 시작위치 (어디서 부터 복사를 시작할꺼냐)
		//dest : 복사 배열 (어떠한 값을 어디에 복사할꺼냐)
		//destPos : 복사배열 시작위치
		//length : 복사 길이 
		//originArr배열의 모든 데이터를 copyArr배열에 복사를 하는데 
		//copyArr의 3번째에서부터 붙여넣고 싶음
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
		
		for(int i =0; i<originArr.length;i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i=0; i<copyArr.length;i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		originArr[0]=99;
		
		for(int i =0; i <originArr.length;i++) {
			System.out.print(originArr[i] +" ");
		} 
		System.out.println();
		for(int i =0; i<copyArr.length;i++) {
			System.out.print(copyArr[i]+" ");
		} 
		System.out.println();
	}
	public void method4() {
		//깊은 복사 3 : Arrays.copyOf()
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];//int의 기본값 0으로 초기화되서 다 0이 들어가있음
		
		System.out.println("===== 처음 값 =====");
		for(int i =0;i<originArr.length;i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i=0; i<copyArr.length;i++) {
			System.out.print(copyArr[i] +" ");
		}
		System.out.println();
		
		System.out.println("===== copyOf()로 복사 후 =====");
//		Arrays.copyOf(original, newLength)
		//original : 원본 배열
		//newLength : 복사할 길이
		copyArr = Arrays.copyOf(originArr,originArr.length);
		//Arrays.==> 배열을 사용할때 배열에 사용할때 편리/유용한 메소드를 모아놓은 메소드
		//Collections ==> 컬렉션을 사용할때 편리/유용한 메소드를 모아놓은 메소드
		
		for(int i =0;i<originArr.length;i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i=0; i<copyArr.length;i++) {
			System.out.print(copyArr[i] +" ");
		}
		System.out.println();
	}
}
