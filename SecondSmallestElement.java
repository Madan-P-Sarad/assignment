package com.te.javabasics.assignments;

import java.util.Arrays;

public class SecondSmallestElement {
	public static void main(String[] args) {
		int arr[]= {1,2,3,1,2,3,1,2,3,7,9,7,9,8,4,8};
		Arrays.sort(arr);
		int j=0;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j]=arr[i];
				j++;
				
			}
		}
		arr[j]=arr[arr.length-1];
		
		for(int k=0;k<=j;k++) {
			System.out.println(arr[k]);
		}
		System.out.println("Second largest element is");
System.out.println(arr[1]);

}
}