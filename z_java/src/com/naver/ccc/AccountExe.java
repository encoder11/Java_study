package com.naver.ccc;

public class AccountExe {
	public static void main(String[] args){
		//-----------------------
		//Account 클래스를 객체화 하기
		//-----------------------
		Account account = new Account("123-123456",500);
			// <1>객체 참조변수 account 선언
			// <2>수입한 클래스 중에 Account(~,~) 생성자를 가진 클래스를 찾아 객체화
			// <3>메모리 공간에 올라간 객체의 생성자 Account("123-123456",500) 로 호출
			// <4>객체의 메위주를 리턴하고 객체 참조 변수 account 에 저장
		
		//----------------------------
		//Account 객체의 메소드 호출하기
		//----------------------------
		account.deposit(50);
		account.deposit(100);
		account.withdraw(60);
		account.withdraw(700);

		//-----------------------
		//Account 클래스를 객체화 하기
		//-----------------------
		Account account2 = new Account("456-456789",1000);
		account2.withdraw(200);
		account2.withdraw(300);

	}
}
