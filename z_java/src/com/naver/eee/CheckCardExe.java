package com.naver.eee;

//-------------------------------
//계좌 정보를 관리하는 [Account 클래스] 선언
//------------------------------
class Account{
	//------------------
	//속성변수 선언
	//------------------
	String accountNo;			//계좌번호
	int remainAmount= 9000;		//잔액 
	//------------------
	//생성자 선언, 생성자 오버로딩.
	//------------------
	public Account() {
	}
	public Account(String accountNo, int remainAmount) {
		this.accountNo = accountNo;
		this.remainAmount = remainAmount;
	}
	//---------------------
	//메소드 선언
	//---------------------
	//입급하는 메소드 선언
	  public void deposit(int inputAmount) {
		//속성변수 remainAmount 에 매개변수 inputAmount 안의 값을 누적해 더하기
		remainAmount =remainAmount+inputAmount;
		//입출급액 정보를 도스창에 출력하기
		System.out.print("\n[입금발생]=> [입금액]:"+inputAmount+"[잔고]:"+remainAmount+"\n");
	}
	
	//출금하는 메소드 선언
	 public void withdraw(int outputAmount){
		//만약 출금액이 잔액보다 크면
		if(remainAmount >= outputAmount){
			//속성변수 remainAmount에 매개변수outputAmount 의 값을 뺸다.
			remainAmount = remainAmount - outputAmount;
			System.out.print("\n[출금발생]=>[출금액]:"+outputAmount+"[잔고:]"+remainAmount+"\n");
			
		}
		//만약 출금액이 잔액보다 크면
		else {
			//경고문자를 도스창에 출력하기
			System.out.print("\n[출금발생]=>[출금실패]:출금액이 잔액보다 큽니다.\n");
		};
	}
	
}

//-------------------------------
//체크카드 정보를 관리하는 [CheckCard 클래스] 선언
	//Account 클래스를 슈퍼 클래스로 삼고있다.
//-------------------------------
class CheckCard extends Account{
	//-------------
	//속성변수 선언
	//-------------
	public String cardNo;		//체크카드 번호
	public int totPaymentAmount; //체크카드 총 지출액
	//-------------
	//생성자 선언
	//-------------
	public CheckCard() {
		System.out.print("CheckCard 생성자 호출되었음");
	}
	public CheckCard( String accountNo, int remainAmount, String cardNo) {
		//부모 클래스의 생성자 호출
		super(accountNo, remainAmount);
		//매개변수 cardNo 안의 데이터를 속성변수 cardNo 에 저장
		this.cardNo = cardNo;
	}
	//------------------
	//메소드 선언
	//------------------
	public void cardPayment(int paymentAmount) {
		//만약 카드 지출액이 잔액보다 같거나 적으면
		if(remainAmount >= paymentAmount) {
			//카드 지출액 누적
			totPaymentAmount = totPaymentAmount+paymentAmount;
			//계좌 잔액에서 빼기
			remainAmount = remainAmount - paymentAmount;
			//도스창에 카드 지출내역 출력
			System.out.print("\n[체크카드지출발생]=> [카드지출액]:"+paymentAmount + "[잔고]:"+remainAmount +"[총지출액]"+totPaymentAmount+"\n");
		}
		//만약 카드 지출액이 잔액보다 크면
		else {
			System.out.print("\n[체크카드지출발생]=>[체크카드지출실해]:지출금액이 잔액보다 큽니다.\n");
		}
	}
	public int getTotPaymentAmount() {
		return totPaymentAmount;
	}
}
//-------------------------------
// [CheckCard 클래스]를 객체화 하고 메소드를 호출하는 [CheckCardExe] 선언
//-------------------------------
public class CheckCardExe {
	public static void main(String[] args){
		//CheckCard 클래스를 객체화 하고 객체의 메위주를 card 변수 저장
		//----------------------------------------------------------
			//<1>객참변수 card 선언
			//<2>생성자 CheckCard(문자,정수,문자) 를 소유한 CheckCard 클래스를 찾아서 있으면
			//	CheckCard 클래스가 메모리 공간에 올라가 객체화 한다.
			// 이때 CheckCard 클래스의 조상 클래스도 같이 모두 객체화 된다.
			//<3>메모리 공간에 올라간 CheckCard 클래스의
			//   생성자 CheckCard("123-456-78-9",999000,"456-789-10-2")를 호출한다.
			//   이 때 호출되는 자식 클래스의 생성자 첫줄에는 반드시
			//   부모 클래스의 생성자를 호출하는 super(~) 라는 코딩이 반드시 있어야한다.
			//	 만약에 없다면 컴파일 할 때 super( ) 라는 코딩을 넣어준다.
			//<4>객체의 메모리 위치 주소값을 리턴하여 변수 card 에 저장
		 CheckCard card = new CheckCard("123-456-78-9",999000,"456-789-10-2");
		
		// cardPayment 메소드 호출로 카드 긁기
		card.cardPayment(70000); // 긁기 성공
		card.cardPayment(300000);// 긁기 성공
		card.cardPayment(700000);// 긁기 실패
		//deposit 메소드 호출로 입금하기
		card.deposit(1000000);
		card.cardPayment(700000);// 긁기 성공
	}
}


/*
--------------------------------------------------------
<문> int remainAmount; 를 private int remainAmount; 로 수정하면?
--------------------------------------------------------
	if(remainAmount >= paymentAmount) { 77지점
	remainAmount = remainAmount - paymentAmount; 81지점
	System.out.print("\n[체크카드지출발생]=> [카드지출액]:"+paymentAmount + "[잔고]:"+remainAmount +"[총지출액]"+totPaymentAmount+"\n");
		} 83지점
	=>서브클래스에서 슈퍼클래스의 멤버 중 private 이 붙은 멤버는 호출 불가능
	=>서브클래스에서 슈퍼클래스의 멤버 중 private 이 없는 멤버는 호출 가능
	
--------------------------------------------------------
<문> CheckCard 클래스에서 CheckCard(String accountNo, int remainAmount, String cardNo){~}
	생성자 안에서 super(accountNo, remainAmount); 삭제하면?
--------------------------------------------------------
	=>에러 없음
	=>super(accountNo, remainAmount); 를 삭제하면 컴파일 할 떄 super()를 넣어준다.
	  super( ) 는 부모클래스의 생성자() 를 호출하라는 애기인데
	  현재 슈퍼클래스에는 호출할 Account() 라는 생성자가 있으므로 아무일 없다.
	  만약 부모 클래스에 Account() 라는 생성자가 없다면 에러가 발생한다.

--------------------------------------------------------
<문> super(accountNo, remainAmount); this.cardNo = cardNo; 를
	 this.cardNo = cardNo; super(accountNo, remainAmount); 로 바꾸면?
--------------------------------------------------------
	=>에러 발생
	=>자식클래스 생성자 안에서 호출되는 super(~)는 반드시 첫줄에 나와야한다.
	
--------------------------------------------------------
<문> Account 클래스에서 public Account(){}를 삭제하면?
--------------------------------------------------------
	=>에러 발생
	=>서브클래스의 생성자 public CheckCard(){} 안의 첫줄에는 super() 가 자동 삽입 된다.
	  super()는 슈퍼클래스의 생성자 Account(){} 를 호출하라는 말 인데
	  삭제했으므로 호출할 부모 생성자가 없어 에러 발생.
	 
	 
--------------------------------------------------------
<문> CheckCard 클래스에서 public CheckCard(){}를 삭제하면?     ???????
--------------------------------------------------------
	=>아무일 없음
	=>만약 서브클래스를 객체 생성할 떄 new ChackCard() 라는 코딩이 있었다면 에러발생.
	 
--------------------------------------------------------
<문> CheckCard card = new CheckCard("123-456-78-9",999000,"456-789-10-2"); 를
	 Account card = new CheckCard("123-456-78-9",999000,"456-789-10-2"); 로 수정하
--------------------------------------------------------
	=>에러 발생. card.cardPayment(70000); 에러발생
	=>에러 발생. card.cardPayment(300000); 에러발생
	=>에러 발생. card.cardPayment(300000); 에러발생
	=>에러 발생. card.cardPayment(70000); 에러발생
	=>슈퍼클래스 객체참조변수 = new 서브클래스명(~) 선언시 서브클래스의 고유 멤버는 호출 불가능.
	=>객참변수의 자료형을 부모형으로 쓰는 이유
		자식클래스가 2개 이상일때 어느 자식 클래스가 객체화 될지 모를 경우이다.
		어느 자식이 객체화 될지 모르는 상태에서 자식의 고유 메소드를 호출하는 것은 모순이다.
		그러므로 모든 자식이 호출할수 있는 오버라이딩한 메소드나
		부모의 메소드만 호출 가능하도록 허락한 것이다.
	=>새끼문제
		------------------------------------------------
		만약 card.cardPayment(70000); 부문에서 발생하는 에러를 없앨수 있다면
		card.cardPayment(70000); 를 어떻게 수정하나?
		------------------------------------------------
		((CheckCard)card).cardPayment;
	
--------------------------------------------------------
<문> 하나의 자바 파일에 2개 이상의 클래스를 선언할 수 있는가?
--------------------------------------------------------	
	=>가능하다. 작성된 자바 파일 컴파일 할 떄 선언된 모든 클래스가 클래스 파일로 따로 컴파일되어
	  생성된다. 즉 하나의 자바 파일로 여러 클래스를 관리할 때 사용한다.
	=><주의>하나의 자바 파일에 2개 이상의 클래스를 선언할 시
			public static void main(String[] args) 메소드를 가진 클래스만 public 이 붙을 수 있고
			다른 클래스는 public 이 붙으면 안된다.
			 
	 
	 
	 
	 
	 
	 
	 
	 
*/