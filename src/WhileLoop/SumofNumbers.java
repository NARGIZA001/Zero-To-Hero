package WhileLoop;

import java.util.Scanner;

public class SumofNumbers {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter two number");
        int firstNumber=input.nextInt();

        int secondNumber=input.nextInt();

        // 10 - 15
        // 10 + 11 + 12 + 13 + 14 + 15 ;

        int sum=0;

        while (firstNumber<=secondNumber){

            sum=sum+firstNumber;
            // sum = 0+10; sum=10 , sum=10+11; sum=21; sum = 21+12+13+14+15=75
            firstNumber++;

        }

        System.out.println(sum);

        // Debugging. It is very very important.

    }





}
