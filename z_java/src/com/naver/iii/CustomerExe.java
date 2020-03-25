package com.naver.iii;
import java.util.*;

class Customer{
	private int cus_no;
	private String cus_name;
	private String addr;

	public int getCus_no() {
		return cus_no;
	}
	public void setCus_no(int cus_no) {
		this.cus_no = cus_no;
	}
	public String getCus_name() {
		return cus_name;
	}
	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
}
public class CustomerExe {
	public static void main(String[] args) {
		//n행 n열의 고객 정보를
		//ArrayList<HashMap<String,String>> 객체에 저장 해보자.
		//----------------------------------------------------
		// 1명의 고객정보를 저장하는 HashMap<String,String> 객체 생성하기.
		HashMap<String,String> customerMap1 = new HashMap<String,String>();
		//HashMap<String,String> 객체에 1명의 고객 정보를 저장하기
		customerMap1.put("cus_no", "1");
		customerMap1.put("cus_name", "저팔순");
		customerMap1.put("addr", "서울");

		HashMap<String,String> customerMap2 = new HashMap<String,String>();
		//HashMap<String,String> 객체에 1명의 고객 정보를 저장하기
		customerMap2.put("cus_no", "2");
		customerMap2.put("cus_name", "사오순");
		customerMap2.put("addr", "부산");
		
		HashMap<String,String> customerMap3 = new HashMap<String,String>();
		//HashMap<String,String> 객체에 1명의 고객 정보를 저장하기
		customerMap3.put("cus_no", "3");
		customerMap3.put("cus_name", "손오순");
		customerMap3.put("addr", "인천");

		//ArrayList<HashMap<String,String>> 객체에 3개의 HashMap<String,String>을 저장 해보자.
		ArrayList<HashMap<String,String>> cusList = new ArrayList<HashMap<String,String>>();
		cusList.add(customerMap1);
		cusList.add(customerMap2);
		cusList.add(customerMap3);
		
		//n행 n열의 고객 정보를
		//ArrayList<Customer> 객체에 저장 해보자.
		//-----------------------------------------
		//1명의 고객 정보를 저장하는 Customer 객체 생성하기
		Customer customer1 = new Customer();
		//Customer 객체에 1명의 고객 정보 저장하기.
		customer1.setCus_no(1);
		customer1.setCus_name("저팔순");
		customer1.setAddr("서울");
		
		Customer customer2 = new Customer();
		//Customer 객체에 1명의 고객 정보 저장하기.
		customer2.setCus_no(2);
		customer2.setCus_name("사오순");
		customer2.setAddr("부산");

		Customer customer3 = new Customer();
		//Customer 객체에 1명의 고객 정보 저장하기.
		customer3.setCus_no(3);
		customer3.setCus_name("손오순");
		customer3.setAddr("인천");
		
		//ArrayList<Customer> 객체에 3개의 Customer 객체 저장하기
		ArrayList<Customer> cusList2 = new ArrayList<Customer>();
		cusList2.add(customer1);
		cusList2.add(customer2);
		cusList2.add(customer3);
		//----------------------------------
		//ArrayList<HashMap<String,String>> 객체에 저장된 고객 정보를 꺼내어 출력하기
		//----------------------------------
		for(int i=0 ; i<cusList.size(); i++) {
			HashMap<String,String> tmpMap = cusList.get(i);
			System.out.println(tmpMap.get("cus_no")+tmpMap.get("cus_name")+tmpMap.get("addr"));
			
		}
		System.out.println("-------------------------------------------");
		

		for(int i=0 ; i<cusList2.size(); i++) {
			Customer tmpCustomer = cusList2.get(i);
			System.out.println(tmpCustomer.getCus_no()+tmpCustomer.getCus_name()+tmpCustomer.getAddr());
			
		}
		System.out.println("-------------------------------------------");
		
	}
}
