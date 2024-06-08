package com.entity;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student  {

	private int id;
	private	String s_name;
	private	int marks ;
	private	String per;
	private	String grade;
	private	String remark;

	@Id
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getPer() {
		return per;
	}
	public void setPer(String per) {
		this.per = per;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", s_name=" + s_name + ", marks=" + marks + ", per=" + per + ", grade=" + grade
				+ ", remark=" + remark + "]";
	}



}
