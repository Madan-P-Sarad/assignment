package com.te.javabasics.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.te.javabasics.collections.Employee;

public class StudentTest {

	public static void main(String[] args) {
		boolean count=true;
		do {
		System.out.println("Enter 1 to sort student details by Id:");
		System.out.println("Enter 2 to sort student details by Name:");
		System.out.println("Enter 3 to sort student details by Age:");
		System.out.println("Enter 4 to sort student details by Marks:");
		System.out.println("Enter 5 to sort student details by Adress:");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(101, "Madan", 25, 90, "Rnr"));
		arrayList.add(new Student(104, "Vikas", 23, 76, "Shivamoga"));
		arrayList.add(new Student(105, "Kiran", 24, 68, "Pune"));
		arrayList.add(new Student(102, "Rakesh", 29, 39, "Mysore"));
		arrayList.add(new Student(103, "Abhi", 21, 80, "Bengalore"));
		
		switch (choice) {
		case 1:
			Collections.sort(arrayList, new StudentSortById());
			for (Student student : arrayList) {
				System.out.println(student);
			}
			break;

		case 2:
			Collections.sort(arrayList, new StudentSortByName());
			for (Student student : arrayList) {
				System.out.println(student);
			}
			break;
		case 3:
			Collections.sort(arrayList, new StudentSortByAge());
			for (Student student : arrayList) {
				System.out.println(student);

			}
			break;
		case 4:
			Collections.sort(arrayList, new StudentSortByMarks());
			for (Student student : arrayList) {
				System.out.println(student);

			}
			break;
		case 5:
			Collections.sort(arrayList, new StudentSortByAdress());
			for (Student student : arrayList) {
				System.out.println(student);
			}
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
		System.out.println("Again wanted see Student Detalis??");
		String str=scanner.next();
		if(str.equalsIgnoreCase("yes")){
			count=true;	
		}else if(str.equalsIgnoreCase("no")) {
			count=false;
			System.out.println("Thank You");
		}
		
		}while(count);
	
		
	}

}
