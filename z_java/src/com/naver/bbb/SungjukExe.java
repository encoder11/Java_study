package com.naver.bbb;
import com.naver.aaa.Sungjuk;

public class SungjukExe {
	//SungjukExe 클래스 실행 시 JVM이 자동으로 가장먼저 찾아서
	//호출하는 main 메소드 선언
	public static void main(String[] args) {
		//변수 sungjuk을 선언하고 Sungjuk 클래스를 객체화하고 객체의 메위주를 저장하기
		Sungjuk sungjuk=new Sungjuk(1,"이동하",90,80);
			//--------------------------------------------------------------
			//<1>변수 sungjuk을 선언
			//<2>Sungjuk(~,~,~)라는 생성자를 가진 클래스를 찾아
			// 메모리 공간에 올려 객체화 한다.
			//<3>메모리 공간에 올려진 Sungjuk 객체의 생성자를
			// Sungjuk(1,90,80) 형대롤 한번 호출한다.
			//<4>메모리 공간에 올려진 Sungjuk 객체의 메모리위치 주소값을 리턴해
			//	변수sungjuk 에 저장한다.
			//--------------------------------------------------------------
		//----------------------------------------
		//Sungjuk 객체의 메소드를 호출하여 얻은 데이터를 도스창에 출력한다.
		//----------------------------------------
		System.out.println("[총점]"+sungjuk.getTot() );
		System.out.println("[평균]"+sungjuk.getAvg() );
	}
}
/*
--------------------------------------------------
<문> import com.naver.aaa.Sungjuk; 를 생략하면?
--------------------------------------------------
Sungjuk sungjuk=new Sungjuk(1,90,80); 에서 에러발생.
new Sungjuk(1,90,80)의 의미는 수입된 클래스 중에 Sungjuk(~,~,~) 라는 생성자를 가진
클래스를 찾아서 객체화 하라는 의미인데 Sungjuk 클래스를 수입하지 않았으므로
Sungjuk(~,~,~) 라는 생성자를 가진 클래스가 없으므로 객체 생성시 에러가 발생한다.

 */