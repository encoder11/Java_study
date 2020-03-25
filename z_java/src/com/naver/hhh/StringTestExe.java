package com.naver.hhh;

public class StringTestExe {
	public static void main(String[] args) {
		int a =10;
		int b =10;
		System.out.println(a==b); //기본형 데이터는 ==으로 비교가 가능하다.
		//--------------
		//String 객체 5개 생성
		//--------------Z
		String str1 = new String("Beatles");
		String str2 = new String("Beatles");
		String str3 = "Beatles";
		String str4 = "Beatles";
		String str5 = "BEATLES";
		//--------------------------------
		//String 객체으 ㅣ메모리 위치 주소값을 비교.
		//--------------------------------
		//<주의>절대 String 객체의 소유 문자열을 비교한것이 아님.
		//서로다른 String객체 위치주소 값 비교
		System.out.println("str1==str2=>"+(str1==str2));
		//서로다른 String객체 위치주소 값 비교
		System.out.println("str2==str3=>"+(str2==str3));
		//서로다른 String객체 위치주소 값 비교
		System.out.println("str3==str4=>"+(str3==str4));
		//서로다른 String객체 위치주소 값 비교
		System.out.println("str4==str=5>"+(str4==str5));
		//------------------------------
		// String 객체가 소유한 문자열을 비교.
		//------------------------------
		//<주의>절대 String 객체의 메모리 위치 주소값 을 비교한것이 아님.
		System.out.println("str1.equals(str2)=>"+(str1.equals(str2)) );
		System.out.println("str2.equals(str3)=>"+(str2.equals(str3)) );
		System.out.println("str3.equals(str4)=>"+(str3.equals(str4)) );
		System.out.println("str4.equals(str5)=>"+(str4.equals(str5)) );
		System.out.println("str4.equalsIgnoreCase(str5)=>"+(str4.equalsIgnoreCase(str5)) );
		
		//--------------------------
		//String 객체 생성
		//--------------------------
		String str="This is a love";
		System.out.println("str.charAt(5)=>"+(str.charAt(5)) );

		System.out.println("str.concat(\"girl\")=>"+str.concat("girl") );
		System.out.println("str+\"girl\"=>"+(str+"girl") );
		System.out.println("str.startsWith(\"This\")=>"+(str.startsWith("This")) );
		System.out.println("str.endsWith(\"love\")=>"+(str.endsWith("love")) );
		System.out.println("-----------------------------------");
		System.out.println("str.indexOf(\"i\")=>"+str.indexOf("i"));
		System.out.println("str.indexOf(\"i\")=>"+str.indexOf("i",3));
		
		System.out.println("str.indexOf(\"is\")=>"+str.indexOf("is"));
		System.out.println("str.lastIndexOf(\"is\")=>"+str.lastIndexOf("is"));
		System.out.println("-----------------------------------");
		System.out.println("str.length()=>"+str.length());
		System.out.println("str.replace(\"i\",\"Q\")=>"+str.replace("i","Q"));//자스의 String 객체의 replace메소드는 하나만 바꾼다.
		System.out.println("str.replaceFirst(\"i\",\"Q\")=>"+str.replaceFirst("is","IS")); 
		System.out.println("str.substring(5,13)=>"+str.substring(5,13));
		System.out.println("str.substring(5)=>"+str.substring(5));
		System.out.println("str.toLowerCase()=>"+str.toLowerCase());
		System.out.println("str.toUpperCase()=>"+str.toUpperCase());
		System.out.println("str.trim()=>"+str.trim());
		//valueOf 를 사용한 문자열로 바꾸기
		System.out.println("String.valueOf(1234)=>"+String.valueOf(1234) );
		System.out.println("String.valueOf(12,345)=>"+String.valueOf(12.345) );
		//간단히 문자열로 바꾸기
		System.out.println("(1234+\"\")=>"+(1234+"") );
		System.out.println("(12.345+\"\")=>"+(12.345+"") ); //문자열로 변환
		
		//split 메소드를 사용하여 -기준으로 ㄴ
		String date ="2019-12-25";
		String[] arr=date.split("-");
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]+"");
		}
		
	}
}
