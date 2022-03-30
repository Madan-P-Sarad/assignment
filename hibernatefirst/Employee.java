package com.te.hibernatefirst;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "emp_details")
public class Employee {
	@Id
	@Column(name = "emp_id")
	private Integer empId;
	@Column(name = "emp_name")
	private String ename;
	@Column(name = "emp_address")
	private String address;
	@Column(name = "emp_password")
	private String password;
}
