package IfStatement;

import java.util.Scanner;

public class DriverLicense {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please provide the age");

        int age=input.nextInt();

        System.out.println("Please provide exam Score");

        int examScore=input.nextInt();

        System.out.println("Do you have state id?");

        String stateId=input.next();

        boolean idCondition;

        if(stateId.equalsIgnoreCase("yes")){
            idCondition=true;
        }else{
            idCondition=false;
        }

        System.out.println("Did you pass the driver license practice?");

        String driPractice=input.next();

        boolean drivingCon;

        if(driPractice.equalsIgnoreCase("Yes")){

            drivingCon=true;
        }else{

            drivingCon=false;
        }


        if(age>=16 && examScore>=70 && idCondition==true && drivingCon==true){

            System.out.println("I can get the driver license");
        }else{

            System.out.println("I can not get the driver license");
        }




    }





}
