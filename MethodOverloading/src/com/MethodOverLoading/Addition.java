package com.MethodOverLoading;

public class Addition {
	int a=10,b=20;
	void add() {
		int c=a+b;
		System.out.println(c);
	}
	int  add(int a, int b) {
		int c=a+b;
		return c;
	}
	String add(String a) {
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition test=new Addition();
		test.add();
		int a=1,b=2;
		System.out.println(test.add(a,b));
		System.out.println(test.add("mahi"));

	}

}
