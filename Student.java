package com.te.javabasics.assignments;

public class Student {
	int student_id;
	String student_name;
	int student_age;
	int student_marks;
	String student_address;
	public Student(int student_id, String student_name, int student_age, int student_marks, String student_address) {
		
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_age = student_age;
		this.student_marks = student_marks;
		this.student_address = student_address;
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", student_age=" + student_age
				+ ", student_marks=" + student_marks + ", student_address=" + student_address + "]";
	}

}
