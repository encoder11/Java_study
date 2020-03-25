package com.naver.ggg;

public class Xxx {

	public static void ddd(String[] args) {
		System.out.println("Hello World!");
	}

}
class Zzz extends Xxx{
	public int bbb=9;// o
	
	//int ccc=9; // o 속성변수
	
	//fff();  //x 메소드옆에는 반드시 리턴형이 있어야한다. 만약 실행구문 이라면 생성자나 메소드 구문 안으로 들어가야한다.
	
	//kkk(){};	    //x
	//super.ddd(); //x 실행구문 이다. 생성자가 아니다.
}
//super.ddd(); 실행구문은 생성자나 메소드 안에 나와야한다.