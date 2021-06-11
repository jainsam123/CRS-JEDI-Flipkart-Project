package com.flipkart.application;

import java.util.Scanner;
import java.util.*;


import com.flipkart.service.UserOperation;
import com.flipkart.bean.User;
import com.flipkart.service.DummyDB;
import com.flipkart.service.UserInterface;

public class CRSApplication {


    static boolean loggedin = false;

    //TODO: Create the login menu
    //TODO: validate credentials call
    //TODO: role student default
    //Register
    //TODO: add courses



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DummyDB.init();

        UserInterface username = new UserOperation();
        int uid = 0;
        String password;

        while(true)
        {
            if(!loggedin)
            {
                System.out.println("Hello!");
                do
                {

                    System.out.println("-------Welcome to Course Registration System--------");
                    System.out.println("Enter Username:");
                    uid = sc.nextInt();
                    System.out.println("Enter Password:");
                    password = sc.next();

                }while(username.verifyCredentials(uid, password) == false);

                loggedin = true;
            }

            System.out.println("Login Successful");

            User user = DummyDB.studentList.get(uid);

            if(user.getRole().equals("Student"))
            {
                StudentMenu studentMenu = new StudentMenu();
                studentMenu.create_menu(uid);
            }
            else
            {

            }


        }

    }


}