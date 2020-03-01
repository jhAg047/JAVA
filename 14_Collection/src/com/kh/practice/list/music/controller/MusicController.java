package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	List<Music> list = new ArrayList<Music>();
	
	public int addList(Music music) {
		list.add(music);
		return 1;
	}
	public int addAtZero(Music music) {
		list.add(0,music);
		return 1;
	}
	public List<Music> printAll() {
		return list;
	}
	public Music searchMusic(String title) {
		for(Music m : list) {
			if(m.getTitle().equals(title)) {
				return m;
			}
		}
		return null;
	}
	public Music removeMusic(String title) {
		for(Music m : list) {
			if(m.getTitle().equals(title)) {
				list.remove(m);
				return m;
			}
		}
		return null;
	}
	public Music setMusic(String title, Music music) {
		for(Music m : list) {
			if(m.getTitle().equals(title)) {
				list.set(list.indexOf(m), music);
				return m;
			}
		}
		return null;
	}
	public int ascTitle() {
		list.sort(new AscTitle());
		return 1;
	}
	public int descSinger() {
		Collections.sort(list);
		return 1;
	}
}
