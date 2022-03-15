package com.te.javabasics.assignments;

import java.util.Comparator;

public class StudentSortByAge implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.student_age-o2.student_age;
	}

}
