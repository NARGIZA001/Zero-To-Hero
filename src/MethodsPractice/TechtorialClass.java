package MethodsPractice;

import java.util.Scanner;

public class TechtorialClass {
    public static void main(String[] args) {

        Scanner input= new Scanner (System.in);


        arrayMethods arraM=new arrayMethods(); // creating the object
        for (int i=0; i<arraM.students.length; i++) {

            System.out.println("What is your name");

            arraM.studentName = input.next();
            arraM.addStudent();
        }
        arraM.printNames();

    }
}
