package DoWhileLoop;

import java.util.Scanner;

public class PrintBetweenTwoNumber {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter two number");
        int number1=input.nextInt();  // 10

        int number2=input.nextInt(); //- 16

        do{

            System.out.println(number1); // 10 11 12 13 14 15 16
            number1++; //19

        }while(number1<=number2);





    }
}
