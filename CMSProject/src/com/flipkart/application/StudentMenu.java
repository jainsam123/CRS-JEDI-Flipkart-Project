/**
 *
 */
package com.flipkart.application;


import java.util.*;
import java.util.Scanner;


import com.flipkart.service.DummyDB;
import com.flipkart.service.RegistrationInterface;
import com.flipkart.service.RegistrationOperation;
//import com.sun.tools.javac.util.List;
import java.util.*;

public class StudentMenu {
    /*TODO: Student menu create
    1. Register
    2. Add course
    3. Drop course
    4. View course
    5. view grade card
    //calculate fee*/

    RegistrationInterface registrationInterface =new RegistrationOperation();


    //TODO: Course Register-- View Cpurses, business class
    //TODO: display courses
    //TODO: input the courses



    public void create_menu(int sid)
    {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("\n1. Course Registration\n2. Add course\n3. Drop course\n4. View courses\n5. View Registered Courses \n6. View grade card\n7. Logout");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:{

                    List<String> clist=new ArrayList<>();
                    registrationInterface.viewCourses(sid);
                    for(int i=0;i<6;i++)
                    {
                        System.out.println("Enter courseCode : ");
                        clist.add(sc.next());

                    }
                    registrationInterface.registerCourses(sid,clist);
                    System.out.println("Registration Successful :)");
                    break;
                }
                case 2:{

                    if(DummyDB.registeredCourses.get(sid).size()>=6)
                    {
                        System.out.println("You have aleady added 6 courses ");
                    }
                    else {


                        registrationInterface.viewCourses(sid);
                        System.out.println("Enter add CourseCode");
                        registrationInterface.addCourse(sc.next(), sid);

                    }
                    break;
                }
                case 3:{
                    registrationInterface.viewRegisteredCourses(sid);

                    System.out.println("Enter dropCourseCode");

                    registrationInterface.dropCourse(sc.next(), sid);
                    break;
                }
                case 4:
                    registrationInterface.viewCourses(sid);
                    break;
                case 5:
                    registrationInterface.viewRegisteredCourses(sid);
                    break;
                case 6:
                    System.out.println("Your SPI is : "+registrationInterface.generateReportCard(1,sid));
                    break;
                case 7:
                {
                    CRSApplication.loggedin  = false;
                    return;
                }
                default:
                    System.out.println("***** Wrong Choice *****");

            }
        }




    }

}