package IfStatement;

import java.util.Scanner;

public class FalcaoCame {

    public static void main(String[] args) {

        // first Galatasaray should pay 3mil to the Club
        // Gal should pay 5 mil to Falcao

        Scanner input=new Scanner(System.in);

//        System.out.println("Please enter the Galatasaray Budget");
//
//        int galBudget=input.nextInt();
//
//        System.out.println("Please enter Player Salary");
//
//        int playerSal=input.nextInt();
//
//        if(galBudget==3000000 && playerSal==5000000){
//
//            System.out.println("Falcao can come to the Galatasaray");
//
//        }else{
//
//            System.out.println("Still did not come:(");
//        }




        // Microphone from amazon ( TONOR Dynamic Karaoke )
        // using scanner you need input the star, review number, price mic
        // equals 4start or more than 4 star, more 100 review, price should be less 20$
        // if your condition is true print I can buy the TONOR mic
        // else print I can not buy the TONOR.


        System.out.println("Please enter product Star rating");
        double starRate=input.nextDouble();

        System.out.println("Please enter product review Number");

        int review=input.nextInt();

        System.out.println("Please enter product product price");

        double price=input.nextDouble();

        if(starRate>=4 && review>100 && price<=20 ){

            System.out.println(" I can buy the product ");
            System.out.println(" The price for product price is "+price);

        }else {

            System.out.println(" I can not buy the product ");
        }


    }

}
