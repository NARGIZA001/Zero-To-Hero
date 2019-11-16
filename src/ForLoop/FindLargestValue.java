package ForLoop;

import java.util.Scanner;

public class FindLargestValue {

    public static void main(String[] args) {
        // TASK
//
//        Using Scanner I will ask user to
//        6
//        6 times enter the number
//        Please enter number
//        5  --
//        10 -- First
//        8 --
//        4 --
//        23  -- first
//        20  -- Second
//
//
//        Find the largest number and print it.


        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the total Number which you want to enter");

        int totalNumber=input.nextInt();// 6

        System.out.println("Please enter number "+totalNumber+" times");

        int firstNumber=input.nextInt();

        for(int i=0;i<totalNumber-1;i++){
            // this loop needs to run 5 times
            int secondNumber=input.nextInt();

            if(secondNumber>firstNumber){

                firstNumber=secondNumber;
            }


        }

        System.out.println(firstNumber);


    }

    // Find the smallest number and print it.


}
