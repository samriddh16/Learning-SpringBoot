package com.sbeans;

public class DotNetCourseMaterial implements CourseMaterial {
	 private String course;
     private int length;
     private String instructor;

	public DotNetCourseMaterial(String course, int length, String instructor) {
		this.course = course;
		this.length = length;
		this.instructor = instructor;
	}

	@Override
	public String toString() {
		return "DotNetCourseMaterial [course=" + course + ", length=" + length + ", instructor=" + instructor + "]";
	}
	
}
