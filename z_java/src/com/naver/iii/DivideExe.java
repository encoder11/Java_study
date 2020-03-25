package com.naver.iii;
import java.io.*;
class Divide{
	
	//속성변수 선언
	int num1;
	int num2;
	double result;
	
	//메소드 선언
	public double getResult() {
		try {
			calculate();
		}
		// 데이터 입출력시 발생하는 예외처리 구문 설정
		catch(IOException ie){
			System.out.print("<경고>입출력에 문제발생!");
		}
		// 숫자문자를 숫자로 바꿀 떄 발생하는 예외처리 구문 설정
		catch(NumberFormatException ne){
			System.out.print("<경고>숫자를 입력해야 합니다.");
		}
		// 숫자를 0으로 나눌 떄 발생하는 예외처리 구문 설정
		catch(ArithmeticException ae){
			System.out.print("<경고>0으로 나누는 계산은 처리할 수 없습니다.");
		}
		// 기타 발생하는 예외의 예외처리구문 설정  마치 조건문의 else 와 동일한 기능
		catch(Exception e){
			System.out.print("<경고>기타예외발생");
		}
		finally {}
		return result;
	}
	//calculate 메소드 선언
	//이 메소드 안에서 IOException,NumberFormatException,ArithmeticException,Exception 등 예외 발생시
	//이메소드를 호출한 놈이 처리하라고 집어 던진다,
	public void calculate() throws
		IOException,NumberFormatException,ArithmeticException,Exception{
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		// 도스상에서 입력된 데이터를 들여오기 위해 BufferedReader 객체 생성.
			//<참고>Stream => 자바프로그램으로 데이터가 들어오거나 나가는흐름을 말한다.	
			//자바에서는 데이터의 흐름을 제어하는 클래스들이 존재한다.
		//---------------------------------------
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		//도스상에 메시지 출력하기.
		System.out.print("첫번째 숫자를 입력하세요=>");
		//도스 상에서 입력한 숫자 문자를 자바쪽으로 읽어와서
		//리턴하는 BufferedReader 객체의 redLine 메소드 호출하기
		//readLine 메소드가 호출되면
		//도스 상에서 엔터를 치기 전까지 프로그램은 잠시 멈춘 상태가 됨.
		String str = br.readLine();
		//도스 상에서 입력한 숫자 문자를 숫자로 바꾸어 속성변수 num1 에 저장하기
		num1 = Integer.parseInt(str);
		System.out.print("두번째 숫자를 입력하세요=>");
		//도스 상에서 입력한 숫자 문자를 자바쪽으로 읽어와서
		//리턴하는 BufferedReader 객체의 redLine 메소드 호출하기
		//readLine 메소드가 호출되면
		//도스 상에서 엔터를 치기 전까지 프로그램은 잠시 멈춘 상태가 됨.
		str = br.readLine();
		//도스 상에서 입력한 숫자 문자를 숫자로 바꾸어 속성변수 num2 에 저장하기
		num2 = Integer.parseInt(str);
		// 만약 두번째 입력받은 숫자가 0이면
		// 코딩으로 ArithmeticException 클래스를 객체화함으로써
		// ArithmeticException 예외가 발생한 효과를 일으킨다.
		if(num2==0) {
			throw new ArithmeticException();
		}
		//---------------------------------
		//num1 / num2 를 계산해서 속성변수 result 에 저장하기
		result=(double)num1 / num2;
	
	}
}
public class DivideExe {
	public static void main(String[] args) {
		//Divide 클래스를 객체화하기
		//Divide 객체의 getResult() 메소드 호출한후 얻은 결과값을 출력하기
		Divide divide = new Divide();
		System.out.print("결과값=>"+divide.getResult() );
	}
}
/*
----------------------------------------------------------
<문>catch(ArithmeticException ae){~} 와 catch(Exception e){~} 의 순서를 바꾸어
	catch(Exception e){~} 이 다른 catch 구문 위로 올라가면?
----------------------------------------------------------
	=>컴파일 불가능
	=>부모에 해당하는 예외처리 구문은 하단에 나와야 한다.

----------------------------------------------------------
<문>catch(NumberFormatException ne){~} 을 생략하면 어찌 되나?
----------------------------------------------------------
	=>아무 이상 없다.
	=>catch(NumberFormatException ne){~}를 catch(Exception e){~}이 대신 처리하기 때문 
		모든 예외처리 클래스의 부모가 Exception 이기 때문이다.

----------------------------------------------------------
<문>public void calculate() throws
		IOException,NumberFormatException,ArithmeticException,Exception{~} 구문에서
	throws IOException,NumberFormatException,ArithmeticException,Exception 를 생략하면?
----------------------------------------------------------
	=>컴파일 불가능
	=>calculate 메소드 안에서 readLine();메소드는 반드시 예외처리를 해야한다.
		치명적인 영향을 줄수 있는 예외 발생 예상 코드는 반드시 예외처리를 헤야 컴파일 시켜준다.
		try.catch 구문을 설정하든가 아니면 다른쪽에서 예외를 처리하라는 throws 구문이 있어야한다.
		

----------------------------------------------------------
<문>catch(NumberFormatException ne){~} 구문의 의미는?
----------------------------------------------------------
	=> try 영역안에서 NumberFormatException 예외ㅏ가 발생하면 try 구문은 종료되고
		NumberFormatException 에외를 관리하는 NumberFormatException 객체가 생성되고
		catch(NumberFormatException){~} 을 메소드 처럼 호출한다.
		이때 매개변수로 NumberFormatException 겍체의 메위주가 흘러 들어간다.

----------------------------------------------------------
<문>throw new ArithmeticException(); 구문의 의미는?
----------------------------------------------------------
	=>ArithmeticException 클래스를 객체화하고 JVM이 ArithmeticException 예외가 발생했다고
		알리라는 뜻이다.






 */
