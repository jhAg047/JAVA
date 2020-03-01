package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import com.kh.practice.set.model.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	HashSet<Lottery> lottery = new HashSet<Lottery>();
	HashSet<Lottery> win = new HashSet<Lottery>(4);
	
	public boolean insertObject(Lottery l) {
		if(!lottery.contains(l)) {
			lottery.add(l);
		}else {
			return false;
		}
		return true;
	}
	public boolean deleteObject(Lottery l) {
		if(lottery.contains(l)) {
			lottery.remove(l);
			if(win.contains(l)) {
				win.remove(l);
			}
			return true;
		}
		
		return false;
	}
	public HashSet<Lottery> winObject() {
		List<Lottery> l = new ArrayList<Lottery>();
		l.addAll(lottery);
		while(win.size() < 4) {
			int random = (int)(Math.random()*l.size());
			win.add(l.get(random));
			if(!lottery.contains(l.get(random))) {
				win.remove(l.get(random));
			}
		}
		
		return win;
	}
	public TreeSet<Lottery> sortWinObject() {
		TreeSet<Lottery> ts = new TreeSet<Lottery>(new SortedLottery());
		ts.addAll(win);
		return ts;
	}
	public boolean searchWinner(Lottery l) {
		if(win.contains(l)) {
			return true;
		}
		return false;
	}
}
