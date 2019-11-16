package ScannerPackage;

import java.util.Scanner;

public class ScannerDayTwo {

    public static void main(String[] args) {

        // Provide two number and find the remainder of this two number and print

        Scanner input=new Scanner(System.in);

        System.out.println("Please provide two number");
        int number1=input.nextInt();
        int number2=input.nextInt();

        int remainder=number1%number2;

        System.out.println("The remainder of this two number is "+remainder);




    }
}
