/**
 * 
 */
package com.flipkart.bean;

/**
 * @author mehul
 *
 */
public class EnrolledStudent {
	private String courseCode;
	private String courseName;
	private int studentId;
	
	public EnrolledStudent(String courseCode, String courseName, int studentId)
	{
		super();
		this.courseCode=courseCode;
		this.courseName=courseName;
		this.studentId=studentId;
	}
	
	// all getter and setter methods

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
}
