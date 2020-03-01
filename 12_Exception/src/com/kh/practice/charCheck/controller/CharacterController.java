package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	public CharacterController() {}
	public int countAlpha(String s) throws CharCheckException {
		
		throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
		
	}
}
