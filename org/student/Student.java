package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("gokul");
	}
	public void studentDept() {
		System.out.println("cse");
	}
	public void studentId() {
		System.out.println("12133"); 
	}

	public static void main(String[] args) {
		Student stud=new Student();
		stud.collegeCode();
		stud.collegeName();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
		

	}

}
