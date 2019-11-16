package ForLoop;

import java.util.Scanner;

public class FactorialNumber {


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the number");
        int number=input.nextInt(); // 6
        int factorial=1;

        for(int i=number;i>=1;i--){

            factorial=factorial*i; // 14*13*12*11*10*9....1

        }

        System.out.println(factorial);
            // 4*3*2*1



    }
}
