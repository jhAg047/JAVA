package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {}
	public String afterToken(String str) {
		StringTokenizer strt = new StringTokenizer(str," ");
		return strt+"";
	}
	public String firstCap(String input) {
		return input;
	}
	public int findChar(String input,char one) {
		return 0;
	}
}
