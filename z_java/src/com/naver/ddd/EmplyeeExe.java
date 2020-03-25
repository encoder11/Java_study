package com.naver.ddd;

public class EmplyeeExe {
	public static void main(String[] args) {
		//-----------------------
		//배열 객체 메위주가 저장할 변수 familys 선언하고
		//배열 객체를 생성하고 배열 객체의 메위주를 familys 변수에 저장하기
		//배열 객체 안에 배열 변수 2개가 있고 배열변수에는 Family 객체의 메위주가
		//추후 들어갈 예정이다.
		//-----------------------
		Family[] familys =new Family[2];
		//-------------------------
		//위에서 생성한 배열 객체의 배열 변수에 Family 객체를 생성한 후 객체의 메위주 저장하기
		//-------------------------
		familys[0] = new Family("부","사오정","남");
		familys[1] = new Family("부","저팔순","여");
		
		
		//------------------------
		//Famliy 객체 생성하기
		//------------------------
		Family family = new Family("부","사오정","남");
		//-----------------------
		//Employee 객체를 생성하기
		//-----------------------
		Employee employee = new Employee(1,"사오순","901225-2028312","주임",familys);
		//Employee 객체의 메소드 호출하기
		System.out.print(
				"[직원번호]:"+employee.getEmp_no()
				+"[직원명]:"+employee.getEmp_name()
				+"[주민번호]:"+employee.getEmp_jumin_num()
				+"[직급]:"+employee.getJikup()
				+"\n"
				);
		for(int i=0 ; i<employee.getFamilys().length ; i++){
			Family[] family_tmp = employee.getFamilys();
			System.out.print("[직원가족]\n");
			System.out.print("[관계]:"+family_tmp[i].getRelation() );
			System.out.print("[이름]:"+family_tmp[i].getF_name() );	
			System.out.print("[성별]:"+family_tmp[i].getGender() +"\n");
		};
		/*System.out.print("[직원가족]\n");
		System.out.print("[관계]:"+employee.getFamily().getRelation() );
		System.out.print("[이름]:"+employee.getFamily().getF_name() );
		//System.out.print("[성별]:"+employee.family.getGender() );		
		System.out.print("[성별]:"+employee.getFamily().getGender() );*/
	}
}