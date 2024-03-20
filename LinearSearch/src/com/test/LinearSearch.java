package com.test;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {10,20,30,40,50,60,30};
		Scanner scan=new Scanner(System.in);
		int ele;
		int [] store=new int[5];
		int count=0;
		System.out.println("Enter the elemnet you want to search");
		ele=scan.nextInt();
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				System.out.println("i found the element at the index "+i);
				count++;
				store[count]=i;
				
			}
			
		}
//		if(count>0) {
//			System.out.println("element founded"+store[1]);
//		}
//			else {
//			System.out.println("element not found");
//		}
		for(int dis:store) {
			System.out.println(dis);
		}
		}
	}


