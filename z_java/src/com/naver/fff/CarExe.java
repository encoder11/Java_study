package com.naver.fff;

//---------------------------
// [Speed 인터페이스] 선언 
//---------------------------
	interface Speed{
		//속성변수 선언
		public int startSpeed = 10;
		//추상메소드 선언
		public void speedUp();
		public void speedDown();
	}
//---------------------------
// [Speed 인터페이스]를 구현 받은 [Car 클래스] 선언 
//---------------------------
	class Car implements Speed{
	//속성변수 선언
	int nowSpeed = startSpeed;
	//[오버라이딩 메소드] 선언
	public void speedUp() {nowSpeed++;}
	public void speedDown() {nowSpeed--;}
	//[고유 메소드] 선언
	public int getSpeed() {return nowSpeed;}
}
//---------------------------
// [CarExe 클래스] 를 객체화하고 메소드 호출하는 [CarExe 클래스] 선언 
//---------------------------
public class CarExe {
	public static void main(String[] args) {
		//---------------------------------
		// <1>객참변수 car 선언
		// <2>생성자 Car() 를 소유한 Car 클래스를 찾아 메모리에 올려 객체화
		// <3>메모리에 올려진 Car 클래스의 생성자 Car() 호출
		// <4>객체의 메모리 위치 주소값을 리턴하여 변수 car 에 저장
		//---------------------------------
		Car car = new Car();
		//---------------------------------
		//car 객체의 메소드 호출
		//---------------------------------
		car.speedUp();
		System.out.println(car.getSpeed() );
		car.speedDown();
		car.speedDown();
		System.out.println(car.getSpeed() );
		System.out.println(Speed.startSpeed);
	}
}
/* 
------------------------------------------
<문>int nowSpeed = startSpeed;를
	int nowSpeed = ++startSpeed; 로 수정하면?
------------------------------------------
	=>에러발생,컴파일 실패
	=>인터페이스 내부의 속성변수는 final의 성격을
		가지고 있어 데이터 갱신이 불가능하기 때문
	=>Car 클래스에서 에러가 발생하여 컴파일이 실패한다.

------------------------------------------
<문>public int startSpeed = 10;를
	private int startSpeed = 10; 로 수정하면?
------------------------------------------
	=>에러발생,컴파일 실패
	=>인터페이스 메소드,속성변수는 무조건 public 의 성격이다.
		그러므로 인터페이스 쪽에서 에러가 발생한다.

------------------------------------------
<문>public void speedUp() {nowSpeed++;}를
	void speedUp() {nowSpeed++;} 로 수정하면?
------------------------------------------
	=>에러발생,컴파일 실패
	=>인터페이스의 메소드는 public이 붙든 안 붙든
		무조건 public의 성격을 가지고있으므로 오버라이딩 규칙을 지켜야함.
		오버라이딩 시 접근 지정자는 크거나 같아야한다.

------------------------------------------
<문>Car 클래스 안에 public void speedUp(){nowSpeed++;}를 생략하면?***
------------------------------------------
	=>에러발생
	=>인터페이스를 구현받은 클래스가 인터페이스 모든 메소드를 재정의하지 않으면
		인터페이스를 구현받은 클래스는 추상클래스가 되므로
		마빡에 abstract가 붙는 추상클래스가 되야한다
		만약 abstract를 붙이면 이 추상 클래스를 객체화하는 곳에서 에러가 발생한다.

------------------------------------------
<문>Car 클래스 안에 public void speedUp(){nowSpeed++;}를 생략하면?***
------------------------------------------

*/
