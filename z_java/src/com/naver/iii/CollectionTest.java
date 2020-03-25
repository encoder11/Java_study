package com.naver.iii;
import java.util.*;


//------------------
//1명의 고객 정보를 관리하는 Cumster 클래스 선언
//	[xxx 속성변수, setXxx메소드,getXxx 메소드] 1쌍이 여러 쌍으로 존재하는
//	클래스를 DTO 클래스 라고 한다.
//	1개의 [DTO 객체]는 다량의 데이터를 저장하고 반환하는 역활을 한다.
//  비유=>이삿짐 쌀때 낱개로 이동하는 것 보다 하나의 박스 안에 여러 짐을 넣고
//		이동하는 것이 좋은것 처럼 다량의 데이터는 DTO에 저장하여 옮겨다니는 것이 좋다.
//		스프링 같은 프레임워크 에서 DTO를 즐겨쓴다.
//	DTO는 오라클에 존재하는 테이블과 구조가 동일하다.
//	DTO 는 VO(=Value Object) 라고 부르기도 한다.
//	DTO=Date Transfer Object
//	<참고>DAO(=Date Access Object)
//				=> DB 연동을 할수 있는 메소드로 구성되어있는 객체
//-----------------

//------------------
//1명의 직원 정보를 관리하는 	Employee 클래스 선언
//------------------
class Employee{
		private int emp_no;						//직원 번호 저장
		private String emp_name;				//직원 이름 저장
		private String jumin_num;				//직원 주민번호 저장
		private ArrayList<Family> familyList;	//직원 가족정보 저장

	public int getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getJumin_num() {
		return jumin_num;
	}
	public void setJumin_num(String jumin_num) {
		this.jumin_num = jumin_num;
	}
	public ArrayList<Family> getFamilyList() {
		return familyList;
	}
	public void setFamilyList(ArrayList<Family> familyList) {
		this.familyList = familyList;
	}
}

//------------------
//1명의 가족 정보를 관리하는 	Family 클래스 선언
//------------------
class Family{
	private String relation;		//가족 관계 저장
	private String f_name;			//가족 이름 저장
	private int age;				//가족 나이 저장
	
	
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
public class CollectionTest {
	public static void main(String[] args) {
		
		//---------------------
		//Employee 객체 생성
		//---------------------
		Employee emp1 = new Employee();
		emp1.setEmp_no(1);
		emp1.setEmp_name("사오정");
		emp1.setJumin_num("991225-2001003");

		//---------------------
		//1명의 가족 정보를 관리하는 Family 객체 생성
		// setter 메소드를 사용하여 가족 정보 저장하기
		//---------------------
		Family family1= new Family();
		family1.setRelation("부");
		family1.setF_name("유재석");
		family1.setAge(48);

		//---------------------
		//1명의 가족 정보를 관리하는 Family 객체 생성
		// setter 메소드를 사용하여 가족 정보 저장하기
		//---------------------
		Family family2= new Family();
		family2.setRelation("모");
		family2.setF_name("신봉선");
		family2.setAge(45);
		
		//-----------------------
		//ArrayList 객체를 생성하고 2개의 Family 객체를 저장하기
		//-----------------------
		ArrayList<Family> list = new ArrayList<Family>();
		list.add(family1);
		list.add(family2);
		//-----------------------
		//Family 객체 들이 저장된 ArrayList 객체를 Employee 객체의 속성변수에 저장하기
		//-----------------------
		emp1.setFamilyList(list);
		
		//-----------------------
		//Employee 객체에 저장된 각종 정보를 꺼내서 출력하기
		//-----------------------
		System.out.println("-----------------------");
		System.out.println("직원번호 직원명 주민번호");
		System.out.println("-----------------------");
		ArrayList<Family> familyList = emp1.getFamilyList();
		System.out.println(emp1.getEmp_no()+"  "+emp1.getEmp_name()+"  "+emp1.getJumin_num() );
		for(int i=0 ; i<familyList.size() ; i++) {
			Family family = familyList.get(i);
			System.out.println(family.getRelation()+"  "+ family.getF_name()+" "+family.getAge() );
			
		}
		
	}
}


















