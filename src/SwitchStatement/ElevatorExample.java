package SwitchStatement;

import java.util.Scanner;

public class ElevatorExample {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the floor number");

        String floorNumber=input.nextLine();

        switch (floorNumber){

            case "30":
                System.out.println("Please enter the company name");
                String companyName=input.nextLine();


                switch (companyName){

                    case "Walgreens":
                        System.out.println("Elevator Number is one");
                    break;
                    case "CVS":
                        System.out.println("Elevator Number is two");
                        break;
                    case "Discover Corp":
                        System.out.println("Elevator Number is three");
                        break;
                    default:
                        System.out.println("Company is not in this floor");
                }
                break;
            case "31":
                System.out.println("Please enter the company name");
                String companyName2=input.next();

                switch (companyName2){

                    case "Techtorial":
                        System.out.println("Elevator number is four");
                        break;
                    case "BlueCross":
                        System.out.println("Elevator number is five");
                        break;
                        default:
                            System.out.println("Company is not in this floor");
                }
                break;

                default:
                    System.out.println("Floor Number is not available");


        }




    }

}
