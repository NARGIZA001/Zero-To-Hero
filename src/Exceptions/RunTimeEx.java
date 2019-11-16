package Exceptions;


import java.util.Scanner;

public class RunTimeEx {

    public static void main(String[] args) {

        // Exceptions

        int[] numbers = {5, 3, 4};

        System.out.println(numbers[2]);

        try {
            System.out.println(numbers[3]);
        } catch (Exception e) {

            System.out.println(numbers[1]);

        }

        // Arithmetic Exception

        Scanner input=new Scanner (System.in);

        System.out.println("hey honey enter two digits: ");

        int num1= input.nextInt();

        int num2= input.nextInt();

        try {
            System.out.println(num1 / num2);

        }catch (ArithmeticException e){
            System.out.println("Number can't be divided by ZERO");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            e.printStackTrace();
        }



        // NullPointer Exception

        System.out.println("Your code is finished ");

        String name =null;

        try {
            name.toUpperCase();
        } catch (NullPointerException e){
            System.out.println("It is an Exception ");
        }



    }

}
