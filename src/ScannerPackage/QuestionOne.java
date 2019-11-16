package ScannerPackage;

import java.util.Scanner;

public class QuestionOne {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please provide the two number");

        int number1=input.nextInt();
        int number2=input.nextInt();

        int sumNum=number1+number2;

        System.out.println("The sum of this two number is "+sumNum);




    }
}
