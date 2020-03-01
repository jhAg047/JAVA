package com.kh.practice.chap01_poly.model.vo;

public class AniBook extends Book{
	private int accessAge;
	
	public AniBook() {}
	public AniBook(String title,String author,String publisher,int accessAge) {
		super(title,author,publisher);
		this.accessAge = accessAge;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + accessAge;
	}
}
