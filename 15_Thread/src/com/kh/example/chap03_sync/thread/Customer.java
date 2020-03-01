package com.kh.example.chap03_sync.thread;

import com.kh.example.chap03_sync.resource.Resources;

// �����ڿ��� ������ ����ϴ� �Һ��� Ŭ����
public class Customer extends Thread {
	private Resources critcalData;
	
	public Customer() {}
	
	public Customer(Resources resources) {
		this.critcalData = resources;
	}
	@Override
	public void run() {
		for(int i=1; i<=10;i++) {
			critcalData.getData();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
