package com.sbeans;

public class JavaCourseMaterial implements CourseMaterial {
           private String course;
           private int length;
           private String instructor;

		public JavaCourseMaterial(String course, int length, String instructor) {
			this.course = course;
			this.length = length;
			this.instructor = instructor;
		}

		@Override
		public String toString() {
			return "JavaCourseMaterial [course=" + course + ", length=" + length + ", instructor=" + instructor + "]";
		}
  
}
