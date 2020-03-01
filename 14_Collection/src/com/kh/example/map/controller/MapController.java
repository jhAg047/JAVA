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
		//Interface Map<K,V> ==> Ű�� �� / Ű�� �� �Ѵ� Ÿ�� ���� �������
		Map<String, Snack> map = new HashMap<String, Snack>();
		
		// ��� �ֱ� : put(K key, V value) : Ű�� �� �߰�, ���� �� value(��) ��ȯ
		// ���� : Ű = ��
		// ���� ������ �ȵ�  / ���� �ߺ��� �Ǿ ������ ���� 
		map.put("�����", new Snack("§��",1500));
		map.put("������", new Snack("�� ��",2500));
		map.put("��������Ĩ", new Snack("§��",1500));
		map.put("���ҹ�", new Snack("�����Ѹ�",1000));
		System.out.println(map);
		
		map.put("�����", new Snack("�ſ��",1500));
		System.out.println(map);
		//Ű�� �ߺ� �ȵǼ� ����� §���� ����� �ſ������ value�� �������
		
		// Ű �Ǵ� ���� �ִ��� ������ Ȯ���ϴ� �޼ҵ� 
		// list,set������ ��ü �ϳ��θ� �ϱ⶧���� ������ Ȯ�ΰ���
		// containsKey(Object key) : key�� ������ true ��ȯ
		// containsValue(Object value) : value�� ������ true ��ȯ 
		System.out.println(map.containsKey("�����"));
		System.out.println(map.containsValue(new Snack("§��",1500))); // �ּҰ����� ���ϴ°Ŷ� new�� �ϸ� ���ο� ��ü ���� -> �ּ� �޶���
		//���� �� �Ϸ��� hashCode�� equals �������̵� �������
		
		// get(Object key) : Ű�� �� ��ȯ
		System.out.println(map.get("�����")); // �ش��ϴ� Ű�� �������� �ش� Ű�� �� ��ȯ
		System.out.println(map.get("Ȩ����")); // �ش��ϴ� Ű�� �������� null ��ȯ 
		
		// 1. values() : ��� value�� Collection�� ��� ��ȯ
		System.out.println(map.values()); 
		// 2. keySet() : Ű���� ����ִ� Set�� ��ȯ���ִ� �޼ҵ� / ��� key�� Set�� ��� ��ȯ /map�ȿ� �ִ� Ű�� set���� �������
		Set<String> set1 = map.keySet();
//		System.out.println(set1); // ��� : [������, �����, ��������Ĩ, ���ҹ�]
		//key���� set���� ������� iterator��� ���� 
		Iterator<String> it = set1.iterator();
		while(it.hasNext()){
			String key = it.next();
			System.out.println("Ű : "+ key+", �� : "+map.get(key));
		}
		
		// 3. entrySet() : ��� entry��ü(Ű+���� ��)�� set�� ��� ��ȯ
		// import java.util.Map.Entry;
		Set<Entry<String,Snack>> set2 = map.entrySet();
		Iterator<Entry<String, Snack>> it2 = set2.iterator();
		while(it2.hasNext()) {
			Entry<String,Snack> entry = it2.next();
			System.out.println("Ű : " + entry.getKey()+", �� : "+ entry.getValue());
		}
		// 2��°���� 3��°�� �� ���� ����
		
		//TreeMap
		Map<String, Snack> map2 = new TreeMap<String, Snack>();
		//String�� comparable�� ���� �Ǿ��־ �⺻������ �������� ����
		map2.putAll(map);
		System.out.println(map2);
		//�������� �Ϸ��� comparator�� �������� ���ظ��� �������
		//remove(key)
	}
	// Properties
	public void doProperties() {
		Properties prop = new Properties();
//		prop.put => hashtable���� ��ӹ޾ƿͼ� �ִ°��� put��� XXXXXXX
		prop.setProperty("ä��", "����");
		prop.setProperty("����", "���");
		prop.setProperty("����", "����");
		prop.setProperty("ä��", "�Ǹ�");
		System.out.println(prop);
		//{����=���, ä��=�Ǹ�, ����=����} Ű�� ���Ƽ� �Ǹ����� �������
		System.out.println(prop.getProperty("ä��")); // Ű������ value������ ���°�
		System.out.println(prop.getProperty("����")); //null 
		//                                   �����ִ� ���� Ű�� �����ϸ� �ش� �� �������� ������ �ڿ� �ִ°� ��������
		System.out.println(prop.getProperty("ä��", "����"));
		System.out.println(prop.getProperty("�߰�", "����"));
	}
	
	public void fileSave() {
		// ���蹮�� ���ü�������
//		try(FileOutputStream fos = new FileOutputStream("test.proterties");) {
			try(FileOutputStream fos = new FileOutputStream("test.xml");) {
			Properties prop = new Properties();
			prop.setProperty("title", "Properties Practice");
			prop.setProperty("language", "kor");
			
			// Properties �����ϱ�
			// store(OutputStream os, String comments)
			// store(Writer writer, String comments)
			// os(�Ǵ�  Writer)�� prop����(����Ʈ �Ǵ� ���� ��������), comments�� �ּ����� ����
//			prop.store(fos, "Properties Test File");
//			xml ���� �޼ҵ� 
//			storeToXML(OutputStream os, String comments)
//			����� ���� ����Ʈ ��Ʈ������ xml ��� ����
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
		//properties �о����
//		try (FileInputStream fis = new FileInputStream("test.properties");){
		//xml �о����
		try (FileInputStream fis = new FileInputStream("test.xml");){
			//�о�ö� properties ��ü�� ���� 
			//�о���°� �����ϴ� ��ü
			Properties prop = new Properties();
			// load(InputStream is) 
			// : ����Ʈ��Ʈ������ ����� ������ ������ �о�ͼ� Properties ��ü�� ����
			// load(Reader reader) 
			// : ���ڽ�Ʈ������ ����� ������ ������ �о�ͼ� Properties��ü�� ���� 
//			prop.load(fis);
			
			//xml �о����
			// loadFromXML (InputStream is)
			// : ����Ʈ��Ʈ������ ����� xml������ ������ �о�ͼ� Properties��ü�� ����
			prop.loadFromXML(fis);
			System.out.println(prop);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}