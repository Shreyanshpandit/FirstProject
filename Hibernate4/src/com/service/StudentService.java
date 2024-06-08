package com.service;

import java.util.List;

import com.dao.StudentDao;
import com.entity.Student;

public class StudentService {

	private StudentDao sd = new StudentDao();

	public List<Student> countMarks() {
		return sd.countMarks();
	}

	public List<Student> maxPer() {
		return sd.maxPer();
	}
	
	public List<Student> minPer() {
		return sd.minPer(); 
	}
	
	public List<Student> sumMarks() {
		return sd.sumMarks();
	}
	
	public List<Student> rowsCount() {
		return sd.rowsCount();
	}
	
	public List<Student>avgMarks(){
		return sd.avgMarks();
	}
	
	public List<Student> startWith(){
		return sd.startWith();
	}
	
	public List<Student> startWithPer(){
		return sd.startWithPer();
	}
	
	public List<Student> readStudent(){
		return sd.readStudent();
	}
	
	
	public int updateStudent() {
		return sd.upadteStudent();
	}
	
	public int deleteStudent() {
		return sd.deleteStudent();
	}
	
//	public int insertStudent() {
//		return sd.insertStudent();
//	}
}