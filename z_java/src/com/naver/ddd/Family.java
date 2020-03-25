package com.naver.ddd;

public class Family {
	//------------------
	// Famliy 클래스 선언
	//-----------------
	private String relation;
	private String f_name;
	private String gender;
	//------------------
	//생성자 선언
	//------------------
	public Family(String relation,String f_name,String gender){
		this.relation=relation;
		this.f_name=f_name;
		this.gender=gender;
	}
	//--------------------
	//메소드선언.
	//--------------------
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
