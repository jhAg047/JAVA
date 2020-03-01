package com.kh.example.map.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

import com.kh.example.map.model.vo.Snack;

public class MapController {
	public void doMap() {
		//Interface Map<K,V> ==> 키와 값 / 키와 값 둘다 타입 제한 해줘야함
		Map<String, Snack> map = new HashMap<String, Snack>();
		
		// 요소 넣기 : put(K key, V value) : 키와 값 추가, 성공 시 value(값) 반환
		// 형식 : 키 = 값
		// 순서 유지가 안됨  / 값이 중복이 되어도 문제가 없음 
		map.put("새우깡", new Snack("짠맛",1500));
		map.put("다이제", new Snack("단 맛",2500));
		map.put("포테이토칩", new Snack("짠맛",1500));
		map.put("고소미", new Snack("고소한맛",1000));
		System.out.println(map);
		
		map.put("새우깡", new Snack("매운맛",1500));
		System.out.println(map);
		//키값 중복 안되서 새우깡 짠맛에 새우깡 매운맛으로 value가 덮어씌워짐
		
		// 키 또는 값이 있는지 없는지 확인하는 메소드 
		// list,set에서는 객체 하나로만 하기때문에 유무를 확인가능
		// containsKey(Object key) : key가 있으면 true 반환
		// containsValue(Object value) : value가 있으면 true 반환 
		System.out.println(map.containsKey("새우깡"));
		System.out.println(map.containsValue(new Snack("짠맛",1500))); // 주소값으로 비교하는거라서 new로 하면 새로운 객체 생성 -> 주소 달라짐
		//내용 비교 하려면 hashCode와 equals 오버라이딩 해줘야함
		
		// get(Object key) : 키의 값 반환
		System.out.println(map.get("새우깡")); // 해당하는 키가 있을때는 해당 키의 값 반환
		System.out.println(map.get("홈런볼")); // 해당하는 키가 없을때는 null 반환 
		
		// 1. values() : 모든 value를 Collection에 담아 반환
		System.out.println(map.values()); 
		// 2. keySet() : 키들이 담겨있는 Set을 반환해주는 메소드 / 모든 key를 Set에 담아 반환 /map안에 있는 키를 set으로 만들어줌
		Set<String> set1 = map.keySet();
//		System.out.println(set1); // 결과 : [다이제, 새우깡, 포테이토칩, 고소미]
		//key들을 set으로 묶어놔서 iterator사용 가능 
		Iterator<String> it = set1.iterator();
		while(it.hasNext()){
			String key = it.next();
			System.out.println("키 : "+ key+", 값 : "+map.get(key));
		}
		
		// 3. entrySet() : 모든 entry객체(키+값의 쌍)를 set에 담아 반환
		// import java.util.Map.Entry;
		Set<Entry<String,Snack>> set2 = map.entrySet();
		Iterator<Entry<String, Snack>> it2 = set2.iterator();
		while(it2.hasNext()) {
			Entry<String,Snack> entry = it2.next();
			System.out.println("키 : " + entry.getKey()+", 값 : "+ entry.getValue());
		}
		// 2번째보단 3번째가 더 많이 쓰임
		
		//TreeMap
		Map<String, Snack> map2 = new TreeMap<String, Snack>();
		//String은 comparable이 정의 되어있어서 기본적으로 오름차순 정렬
		map2.putAll(map);
		System.out.println(map2);
		//내림차순 하려면 comparator로 내림차순 기준만들어서 해줘야함
		//remove(key)
	}
	// Properties
	public void doProperties() {
		Properties prop = new Properties();
//		prop.put => hashtable꺼임 상속받아와서 있는거임 put사용 XXXXXXX
		prop.setProperty("채소", "오이");
		prop.setProperty("과일", "사과");
		prop.setProperty("간식", "젤리");
		prop.setProperty("채소", "피망");
		System.out.println(prop);
		//{과일=사과, 채소=피망, 간식=젤리} 키가 같아서 피망으로 덮어씌워짐
		System.out.println(prop.getProperty("채소")); // 키값으로 value가지고 오는거
		System.out.println(prop.getProperty("땅콩")); //null 
		//                                   여기있는 값이 키에 존재하면 해당 값 가져오기 없으면 뒤에 있는거 가져오기
		System.out.println(prop.getProperty("채소", "땅콩"));
		System.out.println(prop.getProperty("견과", "땅콩"));
	}
	
	public void fileSave() {
		// 시험문제 나올수도있음
//		try(FileOutputStream fos = new FileOutputStream("test.proterties");) {
			try(FileOutputStream fos = new FileOutputStream("test.xml");) {
			Properties prop = new Properties();
			prop.setProperty("title", "Properties Practice");
			prop.setProperty("language", "kor");
			
			// Properties 저장하기
			// store(OutputStream os, String comments)
			// store(Writer writer, String comments)
			// os(또는  Writer)에 prop저장(바이트 또는 문자 형식으로), comments는 주석으로 저장
//			prop.store(fos, "Properties Test File");
//			xml 저장 메소드 
//			storeToXML(OutputStream os, String comments)
//			저장된 정모를 바이트 스트림으로 xml 출력 저장
			prop.storeToXML(fos, "storeToXML Test");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void fileOpen() {
		//properties 읽어오기
//		try (FileInputStream fis = new FileInputStream("test.properties");){
		//xml 읽어오기
		try (FileInputStream fis = new FileInputStream("test.xml");){
			//읽어올때 properties 객체에 저장 
			//읽어오는거 저장하는 객체
			Properties prop = new Properties();
			// load(InputStream is) 
			// : 바이트스트림으로 저장된 파일의 내용을 읽어와서 Properties 객체에 저장
			// load(Reader reader) 
			// : 문자스트림으로 저장된 파일의 내용을 읽어와서 Properties객체에 저장 
//			prop.load(fis);
			
			//xml 읽어오기
			// loadFromXML (InputStream is)
			// : 바이트스트림으로 저장된 xml파일의 내용을 읽어와서 Properties객체에 저장
			prop.loadFromXML(fis);
			System.out.println(prop);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
