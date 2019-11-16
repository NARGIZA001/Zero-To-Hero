package Market;

import java.util.Scanner;

public class testMarket {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String userInput = "";
        System.out.println("Please enter any option between 0-9: ");
        System.out.println(" 0 - To Print Grocery Menu. ");
        System.out.println("1 - To print choice options. ");
        System.out.println("2 - To print the list of grocery items. ");
        System.out.println("3 - To add an item to the list. ");
        System.out.println("4 - To modify an item in the list. ");
        System.out.println("5 - To remove an item from the list. ");
        System.out.println("6 - To search for an item in the list. ");
        System.out.println("7 - To check out the cart");
        System.out.println("8 - To Payment");
        System.out.println("9 - To quit the application.");


        while (!userInput.equals("9")) {
            userInput = input.nextLine();
            switch (userInput) {
                case "0":
                    System.out.println("Grocery Menu we have : ");
                    System.out.println("Fruits, Vegetables, Other Products");
                    break;
                case "1":
                    System.out.println("List of Fruits: ");
                    GroceryBuddy.fruitNames();
                    System.out.println("list of Vegetables: ");
                    GroceryBuddy.veggiNames();
                    System.out.println("List of Other Products: ");
                    GroceryBuddy.productNames();

                case "2":


                case "3":

                case "4":

                case "5":

                case "6":

                case "7":

                case "8":

                case "9":
            }

        }

    }

}
