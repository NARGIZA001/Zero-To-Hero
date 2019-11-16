package ZIQ;

import java.util.Scanner;

public class factorialNumber {

    public static void main(String[] args) {



        Scanner Input = new Scanner(System.in);

        System.out.println("Please enter the number");

        int number1 = Input.nextInt();//6

        int factorial = 1;

        for (int i = number1; i >= 1; i--) {

            factorial=factorial*i;             //14*13*12*11*10*9........1

        }
        System.out.println(factorial);
    }

}