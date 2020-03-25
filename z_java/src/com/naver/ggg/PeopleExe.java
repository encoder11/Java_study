package com.naver.ggg;

//-------------------------
//People 클래스 선언
class People{
	//속성변수 선언
	String name;
	int age;
}
//---------------------------------
//PeopleExe 클래스 선언
public class PeopleExe{
	public static void main(String[] args) {
		//----------------------------------
		//<1>배열 객체의 메위주가 저장될 pp 변수 선언.
		//<2>배열 객체 생성
		//<3>배열 객체 내부에 People 형 변수 2개 선언하고 디폴트 값 null 저장
		//<4>배멸 객체의 메위주 리턴하여 pp 변수에 저장
		//----------------------------------
		People[] pp = new People[2];
		//----------------------------------
		//<1>People() 생성자를 가진 People 클래스를 메모리에 올려 객체화
		//<2>메모리에 올려진 People 클래스의 생성자를 People() 형식으로 호출
		//<3>People 객체의 메위주 리턴하여 pp[0] 변수에 저장.
		//----------------------------------
		pp[0] = new People();
		//----------------------------------
		//People 객체의 속성변수 name에 "최수현"저장
		//People 객체의 속성변수 age에 26 저장
		//----------------------------------
		pp[0].name = "최수현";
		pp[0].age=26;
		

		//----------------------------------
		//<1>People() 생성자를 가진 People 클래스를 메모리에 올려 객체화
		//<2>메모리에 올려진 People 클래스의 생성자를 People() 형식으로 호출
		//<3>People 객체의 메위주 리턴하여 pp[0] 변수에 저장.
		//----------------------------------
		pp[1] = new People();
		//----------------------------------
		//People 객체의 속성변수 name에 "최수현"저장
		//People 객체의 속성변수 age에 26 저장
		//----------------------------------
		pp[1].name = "김수민";
		pp[1].age=23;
		//----------------------------------
		//People 객체의 속성변수를 호출
		//----------------------------------
		System.out.println(pp[0].name+":"+pp[0].age);
		System.out.println(pp[1].name+":"+pp[1].age);


		System.out.println("------------------------------");
		//----------------------------------
		//반복문을 사용하여 배열 객체 내부의 배열변수 안의 People 객체에 접근하여
		//속성변수를 출력해보자
		//----------------------------------
		for(int i=0 ; i<pp.length ; i++) {
			System.out.println(pp[i].name+":"+pp[i].age);
		}
	}
}

/*
----------------------------------------------------------
<문> 어째서 People 객체들을 일반 변수가 아닌 1개의 배열객체 안의 배열변수들에 저장하는가? ***********************************
----------------------------------------------------------
	2개 이상의 People 객체를 일반 변수에 저장해서 다른 곳으로 전달할 경우
	일반 변수 개수 만큼 전달해야 한다
	배열변수에 저장하면 배열객체의 메위주 1개만 전달하면 된다.
	
*/