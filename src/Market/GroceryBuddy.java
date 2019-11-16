package Market;

import java.util.Arrays;

public class GroceryBuddy extends Checkout {

    static String [] fruits = { "Apple", "Orange", "Watermelon", "Banana", "Pineapple", "Grape","Mango", "Strawberry", "Peach", "Cherry"};

    static String [] vegetables= {"Carrots", "Broccoli", "Onion", "Potato", "Tomato", "Cucumber","Corn", "Bean", "Spinach", "Pepper"};

    static String [] products={ "Milk", "Bread", "Beef", "Eggs", "Chicken", "Sugar" ,  "Salt" ,"Coffee", "Rice", "Pasta"};

    static double  [] fruitsPrice = {2.99, 1.99,3.99,2.49,0.99,1.69,2.49,4.99,3.39,1.79};

    static  double [] vegetablesPrice= {2.99, 1.99,3.99,2.49,0.99,1.69,2.49,4.99,3.39,1.79};

    static double [] productsPrice={2.99, 1.99,3.99,2.49,0.99,1.69,2.49,4.99,3.39,1.79};

    int [] fruitStock ={10,10,10,10,10,10,10,10,10,10};

    int [] veggiStock ={10,10,10,10,10,10,10,10,10,10};

    int [] productStock ={10,10,10,10,10,10,10,10,10,10};


     public static void fruitNames (){

            System.out.println("fruit names");

            for (String fruit: fruits){
                System.out.println(fruit +" ");
            }
    }

    public static void veggiNames (){

        System.out.println("Veggi names");

        for (String veggi: vegetables){
            System.out.println(veggi +" ");
        }
    }

    public static void productNames (){

        System.out.println("product names");

        for (String prNames: products){
            System.out.println(prNames +" ");
        }
    }

    static double itemPrice (String itemName){
         for (int i=0; i< products.length; i++) {

             if (products[i].equalsIgnoreCase(itemName))
                 return productsPrice[i];
         }

        for (int i=0; i< fruits.length; i++) {

            if (fruits[i].equalsIgnoreCase(itemName))
                return fruitsPrice[i];
        }
        for (int i=0; i< vegetables.length; i++) {

            if (vegetables[i].equalsIgnoreCase(itemName))
                return vegetablesPrice[i];
        }

         return -1;

    }



}
