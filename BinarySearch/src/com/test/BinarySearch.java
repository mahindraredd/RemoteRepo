package com.test;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {10,20,30,40,50};
		Scanner scan=new Scanner(System.in);
		int ele;
		System.out.println("Enter the elemnet you want to search");
		ele=scan.nextInt();
		int [] store=new int[5];
		int count=0,low=0,high=a.length,mid;
		
		while(low<=high) {
			mid=low+high/2;
			if(ele==a[mid]) {
				
				System.out.println("e;ement found at the index"+mid);
				break;
			}
			else if(ele<a[mid]) {
				high = mid-1;
				
			}
			else if(ele>a[mid]) {
				low=mid+1;
				
			}
		}
		

	}

}
