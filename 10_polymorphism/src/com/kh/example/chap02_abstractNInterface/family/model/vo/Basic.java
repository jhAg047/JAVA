package com.kh.example.chap02_abstractNInterface.family.model.vo;

import java.io.Serializable;

public interface Basic extends Cloneable, Serializable {
	// 안에 아무것도 없고 이름만 있는 인터페이스 ------------------------- => Marker Interface
	// 이 인터페이스를 구현한 클래스는 이러한 특성이 있다 라는 표시를 보여주기위해 사용
	// 마커인터페이스는 (상속받은?)클래스의 특성을 나타내기 위해서 사용
	/*public abstract*/ void eat();
	/*public abstract*/ void sleep();
	
}
