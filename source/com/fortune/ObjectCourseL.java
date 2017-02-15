package com.fortune;
/**File: ObjectCourseL.java
  */
public class ObjectCourseL {
	private String courseName;
	private String[] students = new String[4];
	private int numberOfStudents = 0;

	public ObjectCourseL() {

	}
	public ObjectCourseL(String courseName) {
		this.courseName = courseName;
	}
	public void addStudent(String student) {
		/*students = new String[4];*///不可行，每调用一次addStudent就会对students从新分配空间，
		// 随之而来的if(numberOfStudents >= students.length); students.length就会一直为4
		/*students = new String[4];	/*///如果addStudent方法没有被调用students数组则没有被初始化
		if (numberOfStudents >= students.length) {
			String[] studentsx = new String[students.length * 2];
			for (int i = 0; i < students.length; i++) {
				studentsx[i] = students[i];
			}
			studentsx[numberOfStudents] = student;
			students = studentsx;
		}
		else
			students[numberOfStudents] = student;
		numberOfStudents++;
	}
	public String[] getStudents() {
		return students;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public String getCourseName() {
		return courseName;
	}
	/** 删除某个学生 */
	public void dropStudent(String student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == student) {
				students[i] = null;
			}
		}
		numberOfStudents = 0;
	}
	/** 删除某门课程的全部学生 */
	public void clear(String courseName) {
		if (this.courseName == courseName) {
			this.students = new String[4];
		}
	}
	public static void main(String[] args) {
		ObjectCourseL courseC = new ObjectCourseL("C");
		courseC.addStudent("aaa");
		courseC.addStudent("bbb");
		courseC.addStudent("ccc");
		courseC.addStudent("llx");
		courseC.addStudent("lzh");
		courseC.addStudent("ll");
		courseC.addStudent("hfc");
		courseC.dropStudent("aaa");
		//courseC.clear("C");
		ObjectCourseL courseJava = new ObjectCourseL("Java");
		courseJava.addStudent("hfc");
		courseJava.addStudent("llx");
		courseJava.addStudent("ll");
		courseJava.addStudent("lzh");
		courseJava.clear("Java");
		for (int i = 0; i < courseC.getStudents().length; i++) {
			if (courseC.getStudents()[i] != null) {
				System.out.println(courseC.getCourseName() + " " + courseC.getStudents()[i]);
			}
		}
		for (int i = 0; i < courseJava.getStudents().length; i++) {
			if (courseJava.getStudents()[i] != null) {
				System.out.println(courseJava.getCourseName() + " " + courseJava.getStudents()[i]);
			}
		}
	}
}