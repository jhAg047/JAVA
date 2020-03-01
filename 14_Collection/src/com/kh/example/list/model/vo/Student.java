package com.kh.example.list.model.vo;

public class Student implements Comparable<Student>{
	// - name:String
	// - score:int
	
	// + Student()
	// + Student(name:String, score:int)
	
	// + getter/setter
	// + toString():String
	private String name;
	private int score;
	
	public Student() {}
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return name+ "(" + score+"��)";
	}
	
	//�������̵�(equals/hashCode) - eclipse���� �⺻���� �����ϴ� ������� �Ҳ���~!
	@Override
	public int hashCode() {
		//eclipse���� �⺻���� �����ϴ� ���
		//hashcode �������̵� ã�ƺ��� �ٸ� ����� ���� 
		final int prime = 31; //��ǻ�Ͱ� ���������� ����ϱ� �����鼭 ������ ū �Ҽ� = 31
		int result =1;
		result = prime * result + ((name == null ) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		//��ü ��ü�� ��(this,obj) �ʵ� �񱳴� ����
		if(this == obj) { //���� ��(������ ����:�ּҰ��������ִ°�)�� �Ű������� ������ ~! �ּҰ�
			return true;
			}
		if(obj == null) { 
			return false;
		}
		if(getClass() != obj.getClass()) { //getClass : �� Ŭ������ ���� ������ ������ �ִ� �޼ҵ�
			return false;
		}
		//////////////
		////�ʵ� ��////
		Student other =(Student)obj; //����ȯ
		//�̸�
		//������ �ڷ��� �� �Ҷ�
		if(name == null) {
			if(other.name != null) {
				return false;
			}
		} else if(!name.equals(other.name)){
			return false;
		}
		//���� 
		//�⺻�ڷ��� �� �� �� 
		if(score != other.score) {
			return false;
		}
		return true;
	}
	@Override
	public int compareTo(Student o) {
		// �̸��� ���ؼ� �������� ����
		// �̸� ==> String
		// ==> String�� ���ؼ� �������� ����
		
		String otherName = o.getName();
		
		/*
		 	compareTo�� ��ȯ�� : int
		 	�� ��ü�� �� ���� ������ 0 ��ȯ
		 	�� ��ü�� �� ��󺸴� ũ�� 1 ��ȯ
		 	�� ��ü�� �� ��󺸴� ������ -1 ��ȯ
		 	���������� ��� �������� �Ǵϱ� - �� ���̸� ��
		 */
		
		return name.compareTo(otherName); // �������� 
//		return -name.compareTo(otherName); // ���������� ���̳ʽ��� ���̸� ��
	}
}
