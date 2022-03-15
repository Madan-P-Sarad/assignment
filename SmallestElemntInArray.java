package com.te.javabasics.assignments;

import java.util.Scanner;

public class SmallestElemntInArray {
	public static void main(String[] args) {
		int length; 
		Scanner scanner=new Scanner(System.in);
		System.out.println("The the size of the Array");
		length=scanner.nextInt();
		System.out.println("Enter the array elemnts");
		int[] array=new int[length];
		for(int i=0;i<array.length;i++) {
			array[i]=scanner.nextInt();
		}
		int small=array[0];
		for(int i=1;i<array.length;i++) {
		if(array[i]<small) {
			small=array[i];
		}
		}
		System.out.println("The smallest element in given array");
		System.out.println(small);
		}

}
