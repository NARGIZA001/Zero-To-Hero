package WhileLoop;

import java.util.Scanner;

public class PrintNumberReverseOrder {

//    TASK:
//    int firstNumber=30;
//    int secondNumber=20;
//
//    print number 30 to 20 like following:
//            30
//            29
//            28
//            27
//            26
    //        ..
    //        20

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter two number");
        int firstNumber=input.nextInt();
        int secondNumber=input.nextInt();

        while(firstNumber>=secondNumber){

            System.out.println(firstNumber);
            firstNumber--;

        }


    }



}
