package com.te.javabasics.assignments;

import java.util.Comparator;

public class StudentSortByAdress implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.student_address.compareTo(o2.student_address);
	}

}
