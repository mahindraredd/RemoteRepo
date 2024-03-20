package com.test;
class Student{
	private int age;
	private String name;
	private String city;
	void setAge(int age) {
		this.age=age;
	}
	int getAge() {
		return this.age;
	}
	void setName(String  name) {
		this.name=name;
	}
	String getName() {
		return name;
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std=new Student();
		std.setAge(10);
//		std.name="Mahi";
//		std.city="texas";
		System.out.println(std.getAge());
	}

}
