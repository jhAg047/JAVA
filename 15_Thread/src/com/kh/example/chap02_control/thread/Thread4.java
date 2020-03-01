package com.kh.example.chap02_control.thread;

public class Thread4 implements Runnable{
	// thread ���� ��� :thread Ŭ���� ��� / runnable interface ���� 
	@Override
	public void run() {
		int count = 0;         
		//count�� 10�̸��̸鼭, ���� �������� interrupted�� false�� ��� ����
		while (count < 10 && !Thread.currentThread().isInterrupted()) {
			//interrupt : �Ͻ������� ������ �����带 �ٽ� ������ ������� ������ִ� �޼ҵ�
			try {
				Thread.sleep(1000);
				System.out.println((++count) + "��");
			} catch (InterruptedException e) { // ���ڰ� �ִ� �����带 ������
			// �����ٰ� �Ͼ�ٰ�(sleep)�� �ݺ��ϴٰ� interrupt�� ������ ���ܰ� �߻��ϴ°� ����
			// �߻��ߴµ��� �� ī��Ʈ�� ����? 
			// InterruptedException�� �߻��ϸ� isInterrupeted�� �ٽ� false�� �ʱ�ȭ ��Ŵ
			// �׷��� �Ǹ� ���� �ִ� ���ǹ��� �ɷ��� �� �ݺ���
			// catch�ȿ��� �ٽ� ���ܸ� �߻����Ѽ� false�� true�� �ٲٸ� ���ǿ� �Ȱɷ��� �ݺ� ����
				System.out.println(count + "�ʿ� ī��Ʈ ����");
				Thread.currentThread().interrupt(); // ���� ������ false�� �ʱ�ȭ �ƴ��� �ٽ� true�� �ٲ�
			}
		}
	}
}
