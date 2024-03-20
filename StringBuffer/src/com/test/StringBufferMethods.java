package com.test;

public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer(1000);
		sb.append(3.34);
		sb.append("Pi");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.insert(0,"value");
		System.out.println(sb);
		sb.setLength(5);
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
		sb.ensureCapacity(10000);
		System.out.println(sb.capacity());
		
		
		String ex1=new String("Mahi");
		String ex2=new String("Mahi");
		String Ex1="Mahi";
		String Ex2="Mahi";
		System.out.println(ex1==ex2);
		System.out.println(Ex1==Ex2);
		
		

	}

}
