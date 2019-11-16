package IfStatement;

import java.util.Scanner;

public class PhonePrice {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        // How do you handle the stress?
        // priority to work
        // I can divide the my job to the part
        // all of them part by part.

        // phone price 1000
        // user entered 800
        // please enter restAmount=1000-700;

        double phonePrice=1000;
        System.out.println("Please make the payment "+phonePrice);
        double paymentAmount=input.nextDouble(); // 700 == 1000-700


        if(paymentAmount>=phonePrice){

            System.out.println("You can buy the phone");

        }else if(paymentAmount<phonePrice){
            double restAmount=phonePrice-paymentAmount;
            System.out.println("Please enter rest of the money "+restAmount);// 300

            double restPayment=input.nextDouble();// 300

            if(restPayment>=restAmount){

                System.out.println("you can buy the phone");
            }else {
                System.out.println("you can not buy the phone");
            }

        }




    }



}
