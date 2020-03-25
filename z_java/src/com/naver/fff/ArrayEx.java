

/*
<문제 1>
--------------------------------------------
int index = 1;
int[] test = new int[3];
int foo = test[index];
System.out.pirntin(“foo = ”+foo);

	What is the result?
	A. foo = 
	B. foo =0
	C. Compilation fails
	D. An exception is thrown at runtime
---------------------------------------------
	Anser=B
		int 형 배열변수의 초기 값은 0이다.
		int foo 에서 test[index];를 선언 하는순간.+++++++++
		test[~]배열 변수에 초기 값인 0이 들어가
		test[1] 은 0이 되어
		foo=0 이 출력된다.
	
<문제 1-2>
--------------------------------------------
int index = 1;
String[] test = new String[3];
int foo = test[index];
System.out.pirntin(“foo = ”+foo);

	What is the result?
	A. foo = 
	B. foo =null
	C. Compilation fails
	D. An exception is thrown at runtime
---------------------------------------------
	Anser=B
		String 형 배열변수의 초기 값은 null 이다.
		String foo 에서 test[index];를 선언 하는순간.
		test[~]배열 변수에 초기 값인 null 이 들어가
		test[1] 은 null이 되어
		foo=null 이 출력된다.

<문제 2>
-------------------------------------------
int index[]=1;   //에러
int[] foo = new int [3];
int bar = foo[index];
int baz = bar + index;
System.out.println("baz = "+ baz);
	
	What is the result?
	A. baz = 0
	B. baz = 1
	C. baz = 2
	D. Compilation fails
	E. An exception is thrown at runtime
------------------------------------------
	Anser=D
		int index[]=1; 은 문법적에러다.
		
<문제 3>
-------------------------------------------
public static void main(String[] args){
		int index;
		char[] array = {‘x’,‘y’,‘z’};
    	System.out.println(array[index]);
	}
  What is the result?
	A.x
	B.y
	C.z
	D.Compilation fails
	E.An exception is thrown at runtime
-------------------------------------------
	Anser=D
		=>지역변수는 자동 초기화가 안된다.
		  그러므로 변수 D 에는 아무것도 저장되어 있지 않다.

<문제 4>
----------------------------------------------------
public static void main(String[ ] args){
	int index = -1;
	char[] array ={‘x’,‘y’,‘z’};
    System.out.println(array[index]);
	}
  What is the result?
	A.x
	B.y
	C.z
	D.Compilation fails
	E.An exception is thrown at runtime
----------------------------------------------------
Answe:E
=> 배열변수 [] 안의 들어가는 값은 0~배열변수개수-1 사이의 정수이다 이 범위를 벋어 나면 
	  컴파일시 에러발생하지 않고 실행시 예외가 발생한다.
      범위를 벗어난 배열변수를 찾을수 없기 때문이다.
----------------------------------------------------

<문제 5>
----------------------------------------------------
class Test{
	 private static int[] x;
}
public class Exe{
	public static void main(String[] args){
		System.out.println(Test.x[0]);
	}
} 
----------------------------------------------------
예외 발생. NullPointerException 예외발생
x 변수는 존재하나 x 변수에 메위주가 없으므로.
=> 현재 속성변수 x에는 null 이 저장되어 있다.
   즉 배열 객체가 생성이 안되어 있다. 그러므로 x[0] 으로 배열변수에 접근할수 없다.
----------------------------------------------------
   
<문제 6>
----------------------------------------------------
class X{
	 public static void main(int[] a){
		a[0]++;				//4
	}
}
public class Exe{
	public static void main(String[] args){
		int[] a =new int[1];
		X.modify(a);		
		System.out.println(a[0]);	//8
	}
}
-----------------------------------------------------
What is the result?
A. 0
B. 1
C. An exception is thrown at runtime.
D. Compilation fails because of an error at line 4.
E. Compilation fails because of an error at line 8.
답=B
-----------------------------------------------------

<문제 7>
-----------------------------------------------------
class X{
	public static void modify(String a){
		a= a+"효자";
	}
}
public class Exe{
	public static void main(String[] args){
		String x= new String("홍길동");
		X.modefy(x);		//x.toString 형태로자동 변환되어 객체의 메위주가 아닌 문자열만 전달됨
		System.out.println(x);
	}
}
-----------------------------------------------------
 답=홍길동
 스트링 객체는 문자열이 전달된다. 객체의 메위주가 넘어 가지 않는다.
 
 
 
 
 
 String 객체 ocjp 문제
 
<문제 1>
-----------------------------------------------------
public class X{
	public static void main(String[] args){
		String s1 = new String("true");
		String b1 = new Boolean(true);
		if(s1.equals(b1)){
			System.out.println("Equal");
		}
	}
}

Whit is the result?
 A. Equal
 B. Compilation fails
 C. The code runs with no output;
 D. An exception is thrown at runtime.
-----------------------------------------------------
 답=C 
 실행은되나 b1은 불린형이다. 불린형의 리턴형은 문자열이 아니기 때문에. 
 if구문에서 false 가 일어나 아무것도 출력 되지 않는다.
  
<문제 2>
-----------------------------------------------------
class Banana {
	private int x;
	private static int nth;
	Banana() {x = nth++;};
	Banana(int x){this.x=x;}
}
public class BananaExe{
	pulbic static void main(String[] args){
		Banana b1 = new Banana();   //7
		Banana b2 = new Banana();   //8
		Banana b3 = new Banana(1);  //9
		Banana b4 = b3;				//10
	}
}

Which two evaluate to true after lines 7~10 have executed? (Choose two.)
 A. b2 == b3
 B. b3 == b4
 C. b1.equals(b2)
 D. b2.equals(b3)
 E. b3.equals(b4)
-----------------------------------------------------
 답=B,E
 equals 메소드는 Object 클래스의 메소드로 모든 클래스가 소유하고 있으며
 객체의 메모리 위치 주소값을 비교한다.
 단 String 클래스에서는 오버라이딩되어 문자열을 비교한다.
 
<문제 3>
-----------------------------------------------------
Object objA = new Object();
Object objB = new Object();
Object objC = objA;
Which two evaluate true? (Choose two.)
 A. objA == objB
 B. objC == objA
 B. objB == objA
 C. objA.equals(objC)
 D. objB.equals(objA)
 E. objC.equals(objB)
-----------------------------------------------------
 답=B,D
 equals 메소드는 Object 클래스의 메소드로 모든 클래스가 소유하고 있으며
 객체의 메모리 위치 주소값을 비교한다.
 단 String 클래스에서는 오버라이딩되어 문자열을 비교한다.

<문제 4>
-----------------------------------------------------
String s="abcde";
Object ob =(Object)s;
if(ob.equals(s)){
	System.out.println("AAAA");
}else{
	System.out.println("BBBB");
}
if(s.equals(ob)){
	System.out.println("DDDD");
}else{
	System.out.println("CCCC");
}

Which two line are output? (Choose two.)
 A. AAAA
 B. BBBB
 C. DDDD
 D. CCCC
-----------------------------------------------------
 답=A,C
 	=> ob.equals(s) 에서 equals는 Object 꺼가 아닌 String 객체 꺼이다.
 		객체 참조 변수의 자료형을 자기꺼가 아닌 조상꺼로 쓰면 오버라이딩한 메소드나
 		조상 메소드를 호출한다. 자기 고유 멤버는 호출이 불가능하다.
*/
