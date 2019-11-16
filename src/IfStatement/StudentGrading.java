package IfStatement;

import java.util.Scanner;

public class StudentGrading {


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the Average Score");

        int score=input.nextInt();

        if(score>=80 && score<=100){

            System.out.println("Grade A");
        }else if(score>=60 && score<80){

            System.out.println("Grade B");
        }else if(score>=40 && score<60){

            System.out.println("G-");
        }else if(score>=20 && score<40){

            System.out.println("Grade D");
        }else if(score>=0 && score<20){

            System.out.println("Grade F");
        }else{

            System.out.println("Score is not defined");
        }




    }



}
