package com.flipkart.service;
/**
 * @author archit
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.flipkart.bean.Course;
import com.flipkart.bean.Student;

public class DummyDB {

    public static Map<Integer,Student> studentList;
    public static List<Course> courseList;
    public static Map<Integer,List<String>> registeredCourses;


    public static void init() {

        studentList = new HashMap<Integer,Student>();
        courseList = new ArrayList<Course>();
        registeredCourses = new HashMap<Integer, List<String>>();

        studentList.put(1,new Student(1,"Archit","Student","1234","CS","101",2022,true));
        studentList.put(2,new Student(2,"Mehul","Student","1235","CS","102",2022,true));
        studentList.put(3,new Student(3,"Pranay","Student","1236","CS","003",2022,true));
        studentList.put(4,new Student(4,"Sathvik","Student","1237","EEE","004",2022,true));
        studentList.put(5,new Student(5,"Sameer","Student","1238","ENI","005",2022,true));



        courseList.add(new Course(String.valueOf(1),"Physics","Salman Khan" ,10,true));
        courseList.add(new Course(String.valueOf(2),"Math","Shakuntala Devi" ,10,true));
        courseList.add(new Course(String.valueOf(3),"Machine Learning","Andrew NG" ,10,true));
        courseList.add(new Course(String.valueOf(4),"Java","Amit Balyan" ,10,true));
        courseList.add(new Course(String.valueOf(5),"Python","Guido Van Rossum" ,10,true));
        courseList.add(new Course(String.valueOf(6),"C++","Bjarne Stroustrap" ,10,true));
        courseList.add(new Course(String.valueOf(7),"Chemistry","Marie Curie" ,10,true));
        courseList.add(new Course(String.valueOf(8),"Art and Craft","Some unknown person" ,10,true));
        courseList.add(new Course(String.valueOf(9),"English","Shashi Tharoor" ,10,true));

    }

    public static void main(String[] args)
    {
        init();
    }

}