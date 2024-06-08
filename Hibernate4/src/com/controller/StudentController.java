package com.controller;

import java.util.List;

import com.entity.Student;
import com.service.StudentService;

public class StudentController {

	private StudentService ss = new StudentService();

	void countMarks() {
		List<Student> ls = ss.countMarks();
		System.out.println("Count marks:");
		System.out.println(ls);

	}

	void maxPer() {
		List<Student> ls = ss.maxPer();
		System.out.println("Max percentage:");
		System.out.println(ls);

	}

	void minPer() {
		List<Student> ls = ss.minPer();
		System.out.println("Min percentage:");
		System.out.println(ls);

	}

	void sumMarks() {
		List<Student> ls = ss.sumMarks();
		System.out.println("Sum of marks:");
		System.out.println(ls);
	}

	void rowsCount() {
		List<Student> ls = ss.rowsCount();
		System.out.println("Total rows count:");
		System.out.println(ls);
	}

	void avgMarks() {
		List<Student> ls = ss.avgMarks();
		System.out.println("Avg of marks:");
		System.out.println(ls);
	}

	void startWith() {
		List<Student> ls = ss.startWith();
		System.out.println("List of student name start with 'v' and end with 'y':");
		for (Student student : ls) {
			System.out.println(student);
		}

	}

	void startWithPer() {
		List<Student> ls = ss.startWithPer();
		System.out.println("List of student percentage start with '7' :");
		for (Student student : ls) {
			System.out.println(student);
		}

	}

	void readStudent() {
		List<Student> ls = ss.readStudent();
		System.out.println("Read student data:");
		for (Student student : ls) {
			System.out.println(student);
		}
	}

	void updateStudent() {

		int check = ss.updateStudent();
		System.out.println("Student data inserted:" + check);

	}

	void deleteStudent() {
		int check = ss.deleteStudent();
		System.out.println("Student data deleted:" + check);
	}

//	void insertStudent() {
//		int check = ss.insertStudent();
//		System.out.println("Student data inserted:" + check);
//	}

	public static void main(String[] args) {
		StudentController sc = new StudentController();
		sc.countMarks();
		sc.maxPer();
		sc.minPer();
		sc.sumMarks();
		sc.rowsCount();
		sc.avgMarks();
		sc.startWith();
		sc.startWithPer();
		sc.readStudent();
		sc.updateStudent();
		sc.deleteStudent();
	//	sc.insertStudent();
	}
}
