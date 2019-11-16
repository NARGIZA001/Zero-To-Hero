package SwitchStatement;

import java.util.Scanner;

public class Fruit {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the value");

        String productName=input.nextLine();

        switch (productName){

            case "Strawberry":
                System.out.println("Matching values is "+productName);
                break;
            case "CranBerry":
                System.out.println("Matching values is "+productName);
                break;
            case "Chocolate":
                System.out.println("Matching values is "+productName);
                break;
            case "Banana":
                System.out.println("Matching values is "+productName);
                break;
                default:
                    System.out.println("Product Name is not matching");
                    break;

        }



    }
}
