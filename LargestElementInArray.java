package com.te.javabasics.assignments;

import java.util.Scanner;

public class LargestElementInArray {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int length;
	System.out.println("Enter the size of the array");
	 length=scanner.nextInt();
	int[] arr=new int[length];
	System.out.println("Enter the elements of the array");
	for(int i=0;i<arr.length;i++) {
		 arr[i]=scanner.nextInt();
	}
	scanner.close();
		 int large=arr[0];
		 for(int j=1;j<arr.length;j++) {
			 if(arr[j]>large) {
				 large=arr[j];
			 } 
		 }
		 System.out.println("The largest elemnt in the given array is");
		 System.out.println(large);
	}
	}


