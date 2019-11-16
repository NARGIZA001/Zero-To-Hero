package ScannerPackage;

import java.util.Scanner;

public class QuestionTwo {


    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        System.out.println("Please provide the length");

        double length=input.nextDouble();

        System.out.println("Please provide the width");

        double width=input.nextDouble();

        int area=(int)(length*width);

        System.out.println("Area of the rectangle is "+area);

    }
}
