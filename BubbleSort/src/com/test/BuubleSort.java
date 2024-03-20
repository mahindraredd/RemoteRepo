package com.test;

public class BuubleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {10,3,2,1,7,11};
		System.out.println("Elements before bubble sort");
		for(int ele:a) {
			System.out.print(ele+" ");
		}
		for(int i=0;i<a.length;i++) {
			for(int j=1;i<a.length-j;j++) {
				if(a[j]<a[j-1]) {
					int temp =a[j];
					a[j]=a[j-1];
					a[j-1]=temp;	
						
				}
			}
		}
		System.out.println("Elements after bubble sort");
		for(int ele:a) {
			System.out.print(ele+" ");
		}

	}

}
