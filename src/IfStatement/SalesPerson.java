package IfStatement;

import java.util.Scanner;

public class SalesPerson {


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter sales value for Monday");

        double monday=input.nextDouble();

        System.out.println("Please enter sales value for Tuesday");

        double tuesday=input.nextDouble();

        System.out.println("Please enter sales value for Wednesday");

        double wednesday=input.nextDouble();

        System.out.println("Please enter sales value for Thursday");

        double thursday=input.nextDouble();

        System.out.println("Please enter sales value for Friday");

        double friday=input.nextDouble();

        double totalPrice=monday+tuesday+wednesday+thursday+friday;

        double baseSalary=400;

        double weeklyPayment;

        if(totalPrice>=800){

            weeklyPayment=baseSalary+totalPrice*5/100;

            System.out.println("Total weekly payment is "+weeklyPayment);
        }else{

            System.out.println("Total weekly payment is "+baseSalary);
        }

        // 1922*5/100= 101.1

        // 400+101.1= 501.1

        // if total sale is more than = 800 and less 1000 commission 5
        // total sale is more than or equals to 1000 less than 1200 commission 7
        //  total sale is more than or equals to 1200 less than 1400 commission 9
        //  total sale is more than 1400 commission 11
    }
}
