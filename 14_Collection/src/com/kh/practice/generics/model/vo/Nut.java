package com.kh.practice.generics.model.vo;

public class Nut extends Farm{
	private String name;
	
	public Nut() {}
	public Nut(String kind,String name) {
		super(kind);
		this.name =name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return super.toString() +" : "+ name;
	}
	@Override
	public boolean equals(Object obj) {
		Nut nother = (Nut)obj;
		if(name == null) {
			if(nother.name != null) return false;
		} else if(!name.equals(nother.name)) return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result =1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
}
