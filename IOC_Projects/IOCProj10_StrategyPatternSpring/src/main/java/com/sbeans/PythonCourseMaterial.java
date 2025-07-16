package com.sbeans;

public class PythonCourseMaterial implements CourseMaterial{
	 private String course;
     private int length;
     private String instructor;

	public PythonCourseMaterial(String course, int length, String instructor) {
		this.course = course;
		this.length = length;
		this.instructor = instructor;
	}

	@Override
	public String toString() {
		return "PythonCourseMaterial [course=" + course + ", length=" + length + ", instructor=" + instructor + "]";
	}

}
