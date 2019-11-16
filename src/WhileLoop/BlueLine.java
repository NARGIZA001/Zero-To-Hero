package WhileLoop;

import java.util.Scanner;

public class BlueLine {


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter you balance");
        int balance=input.nextInt(); // 30-2 = 28

        int count=1;

        while(balance>=2){

            balance=balance-2;
            System.out.println(count+" times Card used");
            count++;
        }




    }

}
