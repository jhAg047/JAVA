package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator<Music>{
	@Override
	public int compare(Music o1, Music o2) {
		// ����Ʈ �� �� �������� ����, ������ ������ ���� ������ �������� ����, 1 ����
		String standard = o1.getTitle();
		String object = o2.getTitle();
		String standardSinger = o1.getSinger();
		String objectSinger = o2.getSinger();
		
		if(standard.compareTo(object) == 1) {
			return -1;
		} else if(standard.compareTo(object) == 0) {
			return standardSinger.compareTo(objectSinger);
		} else {
			return 1;
		}
	}
}
