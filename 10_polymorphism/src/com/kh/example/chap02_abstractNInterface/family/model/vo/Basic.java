package com.kh.example.chap02_abstractNInterface.family.model.vo;

import java.io.Serializable;

public interface Basic extends Cloneable, Serializable {
	// �ȿ� �ƹ��͵� ���� �̸��� �ִ� �������̽� ------------------------- => Marker Interface
	// �� �������̽��� ������ Ŭ������ �̷��� Ư���� �ִ� ��� ǥ�ø� �����ֱ����� ���
	// ��Ŀ�������̽��� (��ӹ���?)Ŭ������ Ư���� ��Ÿ���� ���ؼ� ���
	/*public abstract*/ void eat();
	/*public abstract*/ void sleep();
	
}
