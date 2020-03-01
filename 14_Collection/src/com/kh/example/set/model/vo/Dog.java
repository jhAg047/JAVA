package com.kh.example.set.model.vo;

public class Dog implements Comparable<Dog> {
	// - name : String
	// - weight : double
	
	// + �⺻ ������
	// + �Ű����� �ִ� ������(���)
	
	// + getter/setter()
	// + toString() : String
	//        ������ : �̸�(������kg)
	private String name;
	private double weight;
	
	public Dog() {}
	public Dog(String name,double weight) {
		this.name = name;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�̸� : "+ name + "(������:" + weight + "kg)";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int)weight;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		// ��ü ��ü�� ��
		if(this == obj) { 
		return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() !=obj.getClass()) {
			return false;
		}
		// �ʵ� ��
		Dog other = (Dog)obj;  // ����ȯ
		if(name == null) {
			if(other.name != null) {
				return false;
			}
		} else if(!name.equals(other.name)) {
			return false;
		}
		if(weight != other.weight) {
			return false;
		}
		return true;
	}
	@Override
	public int compareTo(Dog o) {
		// �̸��� ���ؼ� ��������
		String other = o.getName();
		return name.compareTo(other);
	}
		
//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
}
