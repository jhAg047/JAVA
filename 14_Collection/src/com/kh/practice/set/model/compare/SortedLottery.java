package com.kh.practice.set.model.compare;

import java.util.Comparator;

import com.kh.practice.set.model.vo.Lottery;

public class SortedLottery implements Comparator<Lottery>{

	@Override
	public int compare(Lottery o1, Lottery o2) {
		String stdPhone = o1.getPhone();
		String objPhone = o2.getPhone();
		String stdName = o1.getName();
		String objName = o2.getName();
		
		//이름으로 오름차순 정렬하되 이름이 같으면 번호로 오름차순
		if(stdName == objName) {
			return stdPhone.compareTo(objPhone);
		} else {
			return stdName.compareTo(objName);
		}
	}
}
