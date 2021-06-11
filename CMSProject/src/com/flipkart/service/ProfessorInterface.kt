/**
 *
 */
package com.flipkart.service;

import java.util.List;


import com.flipkart.bean.*;
/**
 * @author archit
 *
 */
public interface ProfessorInterface {

    public boolean addGrade(String studentID, String courseID, String grade) throws GradeNotAllotedException;

    public List<Course> viewCourses(String profID);

    /**
     * Method to get the professor name with ID
     * @param profId
     * @return Professor name
     */
    String getProfessorById(String profId);

    /**
     * Method to view all the enrolled students
     * @param profId: professor id
     * @return List of enrolled students
     */
    public List<EnrolledStudent> viewEnrolledStudents(String profId);

