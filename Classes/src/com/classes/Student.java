package com.classes;

public class Student {
	int studentId;
	String name;
	
	void study() {
		System.out.println(studentId);
	}
	void play(int a, int b) {
		int res=a+b;
		
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student();
		stu.study();
		stu.play(20,30);

	}

}
