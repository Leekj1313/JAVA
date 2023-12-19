package day8access1;

public class Student {
	private int grade;
	int classNum; // 접근제어자가 default
	public int gnum;
	private int StringName;
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public int getGnum() {
		return gnum;
	}
	public void setGnum(int gnum) {
		this.gnum = gnum;
	}
	public int getStringName() {
		return StringName;
	}
	public void setStringName(int stringName) {
		StringName = stringName;
	}
	
	
	
	}


