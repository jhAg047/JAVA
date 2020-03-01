package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	Scanner sc = new Scanner(System.in);
	CharacterController cct = new CharacterController();
	public void menu() {
		System.out.println("¹®ÀÚ¿­ : ");
		String s = sc.next();
		try {
			cct.countAlpha(s);
		} catch (CharCheckException e) {
			e.printStackTrace();
		}
	}
}
