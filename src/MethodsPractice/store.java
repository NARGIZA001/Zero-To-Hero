package MethodsPractice;

import java.util.Scanner;

public class store {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println(" Please enter the quantity ");
        int quantity = input.nextInt();
        System.out.println("please enter the price");
        int price= input.nextInt();

        ProfitCalculator pc= new ProfitCalculator();

        if (quantity<20){

            System.out.println(pc.sell(price,quantity));
            System.out.println("there is no discount unless you buy more than 20 items ");
            // inside of if put another if condition
        }else if (quantity>=20 && quantity<40){

            System.out.println(pc.sell10dis(price,quantity));
            System.out.println("Your price includes 10% discount");

        }else if(quantity>=40){

            System.out.println(pc.sell20dis(price,quantity));
            System.out.println("Your price includes 20% discount");
        }else{
            System.out.println(" invalid");
        }
        // small 2
        // medium 4
        // large 4.5

    }
}
