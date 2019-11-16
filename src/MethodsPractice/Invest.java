package MethodsPractice;

import java.util.Scanner;

public class Invest {
    public static void main(String[] args) {
        Investment investment=new Investment();
        Scanner input= new Scanner(System.in);

        System.out.println(" enter the amount ");
        investment.amount=input.nextInt();


        System.out.println(" year number ");
        investment.years=input.nextDouble();

        System.out.println(" enter the rate ");
        investment.rate=input.nextDouble();

        System.out.println(" your total will be "+ investment.totalAmount() + " in "+ investment.years + " years!");

    }
}
