/**
 * 
 */
package com.flipkart.bean;

/**
 * @author mehul
 *
 */
public class Course {
	private String courseCode;
	private String courseName;
	private String instructorId;
	private int seats=10;
	
	public Course() {}  //this is a default constructor
	
	public Course(String courseCode, String courseName, String instructorId, int seats)
	{
		super();
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.setInstructorId(instructorId);
		this.seats = seats;
	}
    //all getter and setter methods as per the data members.
	
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

	public String getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(String instructorId) {
		this.instructorId = instructorId;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
}
