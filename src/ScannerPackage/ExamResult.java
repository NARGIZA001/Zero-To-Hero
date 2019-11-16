package ScannerPackage;

import java.util.Scanner;

public class ExamResult {

    // You need to enter 3 different exam result  70, 45, 90
    // If average is equals to 70 or more than 70
    // Stutruedent should attend all the classes , false
    // Student should complete at least 6 assignment --> 5
    // Student is able to go to next semester or not.


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please provide exam results");
        int exam1=input.nextInt();
        int exam2=input.nextInt();
        int exam3=input.nextInt();

        int averageScore=(exam1+exam2+exam3)/3;

        System.out.println("Average Score is "+averageScore);
        System.out.println("Student attended all the classes");

        boolean attended=input.nextBoolean();

        System.out.println("Completed Assignment");

        int completedAssignment=input.nextInt();

        boolean result=averageScore>=70&&attended==true&&completedAssignment>=6;

        System.out.println("Can student take classes from next semester?"+result);


    }






}
