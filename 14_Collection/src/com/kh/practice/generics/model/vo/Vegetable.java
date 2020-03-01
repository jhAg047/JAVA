package com.kh.practice.generics.model.vo;

public class Vegetable extends Farm{
	private String name;
	
	public Vegetable() {}
	public Vegetable(String kind,String name) {
		super(kind);
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() +" : "+name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		Vegetable vother = (Vegetable)obj;
		if(name == null){
			if(vother.name != null) return false;
		} else if(!name.equals(vother.name)) return false;
		return true;
	}
}
