package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Student name is :suma");
	}
	
	public void studentDept() {
		System.out.println("Student Dept is :ECE");
	}
	
	public void studentId() {
		System.out.println("Student id is :123");
	}
	
	public static void main(String[] args) {
		Student stu=new Student();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		stu.deptName();
		stu.studentDept();
		stu.studentName();
		stu.studentId();
		
	}
	

}
