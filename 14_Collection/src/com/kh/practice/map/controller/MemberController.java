package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	HashMap<String,Member> map = new HashMap<String,Member>();
	
	public boolean joinMembership(String id, Member m) {
		if(!map.containsKey(id)) {
			map.put(id, m);
			return true;
		} else {
			return false;
		}
	}
	public String logIn(String id, String password) {
		if(map.containsKey(id)) {
		if(map.get(id).getPassword().equals(password)) {
			return map.get(id).getName();
		}
		}
		return null;
	}
	public boolean changePassword(String id,String oldPw,String newPw) {
		if(map.containsKey(id) && map.get(id).getPassword().equals(oldPw)) {
			map.get(id).setPassword(newPw);
			return true;
		} else {
			return false;
		}
	}
	public void changeName(String id,String newName) {
		map.get(id).setName(newName);
	}
	public TreeMap<String,String> sameName(String name){
		TreeMap<String,String> tm = new TreeMap<String,String>();
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String id = it.next(); //Ű 
			if(name.equals(map.get(id).getName())) {
				tm.put(id,name);
			}
		}
		return tm;
	}
}
