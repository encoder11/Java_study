package com.naver.ddd;

//---------------------------
//Employee 클래스 선언
//---------------------------
class Employee {
	//-----------------------
	//속성변수 선언
	//-----------------------
	private int emp_no;           //직원 번호 저장
	private String emp_name;      //직원명 저장
	private String emp_jumin_num; //주민번호 저장
	private String jikup;	      //직급 저장
	private Family[] familys;	// Family 객체의 메위주 저장
	
	//---------------------
	//생성자 선언
	//---------------------
	public Employee(int emp_no,String emp_name,String emp_jumin_num,String jikup,Family[] familys) {
		this.emp_no=emp_no;
		this.emp_name=emp_name;
		this.emp_jumin_num=emp_jumin_num;
		this.jikup=jikup;
		this.familys=familys;
	}
	//---------------------
	//메소드 선언
	//---------------------

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

	public String getEmp_jumin_num() {
		return emp_jumin_num;
	}

	public void setEmp_jumin_num(String emp_jumin_num) {
		this.emp_jumin_num = emp_jumin_num;
	}

	public String getJikup() {
		return jikup;
	}

	public void setJikup(String jikup) {
		this.jikup = jikup;
	}

	public Family[] getFamilys() {
		return familys;
	}

	public void setFamilys(Family[] familys) {
		this.familys = familys;
	}
	
}
