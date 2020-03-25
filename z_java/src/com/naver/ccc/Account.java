package com.naver.ccc;

public class Account {
	//---------------------
	//속성변수 선언
	//---------------------
	private String account_no;	//계좌번호 저장
	int remainAmount;			//잔액 저장
	int cnt;					//거래횟수 저장
	static int tot_cnt;				//은행 차원의 총거래 횟수 저장
	//---------------------
	//생성자 선언
	//---------------------
	public Account( String account_no,int remainAmount) {
		// 메개변수 accountNo 의 데이터를 속성변수 accountNo 에 저장하기
		this.account_no=account_no;
		// 메개변수 remainAmount 의 데이터를 속성변수 remainAmount 에 저장하기
		this.remainAmount = remainAmount;
		// 개인용 거래회수를 1증가
		cnt++;
		// 입출급액 정보를 도스창에 출력하기
		System.out.print("\n---------------------------------------------");
		System.out.print("\n[계좌개설]=> [입금액]:"+remainAmount+"[잔고]:"+remainAmount+"[거래 횟수]:"+cnt+"[거래 횟수]:"+"[총거래 횟수]:"+ (++tot_cnt) );
	}
	//---------------------
	//메소드 선언
	//---------------------
	//입급하는 메소드 선언
	public void deposit(int inputAmount) {
		//개인용 거래 회수를 1증가하기
		cnt++;
		//속성변수 remainAmount 에 매개변수 inputAmount 안의 값을 누적해 더하기
		remainAmount =remainAmount+inputAmount;
		//입출급액 정보를 도스창에 출력하기
		System.out.print("\n[입금발생]=> [입금액]:"+inputAmount+"[잔고]:"+remainAmount+"[거래 횟수]:"+cnt+"[총거래 횟수]:"+ (++tot_cnt) );
	}
	//출금하는 메소드 선언
	public void withdraw(int outputAmount){
		//만약 출금액이 잔액보다 크면
		if(remainAmount < outputAmount){
			//경고문자를 도스창에 출력하기
			System.out.print("\n[출금발생]=>[출금실패]:출금액이 잔액보다 큽니다.\n");
			
		}else {
			// 개인용 거래 회수를 1증가하기
			cnt++;
			//속성변수 remainAmount에 매개변수outputAmount 의 값을 뺸다.
			remainAmount= remainAmount - outputAmount;
			System.out.print("\n[출금발생]=>[출금액]:"+outputAmount+"[잔고:]"+remainAmount+"[거래 횟수]:"+cnt+"[총거래 횟수]:"+ (++tot_cnt) );
		};
	}
}
