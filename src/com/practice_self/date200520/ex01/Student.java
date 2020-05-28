package com.practice_self.date200520.ex01;

public class Student {

	int studentId;
	String studentName;
	int grade;
	String address;
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public String getAddress() {
		return address;
	}
	public void showStudentInfo() {
		System.out.println(studentName+","+address);
	}
	
}
