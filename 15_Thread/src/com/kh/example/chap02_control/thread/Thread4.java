package com.kh.example.chap02_control.thread;

public class Thread4 implements Runnable{
	// thread 생성 방법 :thread 클래스 상속 / runnable interface 구현 
	@Override
	public void run() {
		int count = 0;         
		//count가 10미만이면서, 현재 스레드의 interrupted가 false인 경우 진행
		while (count < 10 && !Thread.currentThread().isInterrupted()) {
			//interrupt : 일시정지의 상태인 스레드를 다시 깨워서 실행대기로 만들어주는 메소드
			try {
				Thread.sleep(1000);
				System.out.println((++count) + "초");
			} catch (InterruptedException e) { // 잠자고 있는 스레드를 깨웠다
			// 잠들었다가 일어나다가(sleep)를 반복하다가 interrupt를 만나면 예외가 발생하는건 맞음
			// 발생했는데도 왜 카운트가 되지? 
			// InterruptedException이 발생하면 isInterrupeted를 다시 false로 초기화 시킴
			// 그렇게 되면 위에 있는 조건문에 걸려서 또 반복됨
			// catch안에서 다시 예외를 발생시켜서 false를 true로 바꾸면 조건에 안걸려서 반복 정지
				System.out.println(count + "초에 카운트 종료");
				Thread.currentThread().interrupt(); // 예외 때문에 false로 초기화 됐던걸 다시 true로 바꿈
			}
		}
	}
}
