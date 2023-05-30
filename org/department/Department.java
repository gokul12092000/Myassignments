package org.department;

import org.college.college;

public class Department extends college{
	public void deptName() {
		System.out.println("cse");
	}
	

	public static void main(String[] args) {
		Department dept=new Department();
		dept.collegeName();
		dept.collegeCode();
		dept.collegeRank();
		dept.deptName();

	}

}
