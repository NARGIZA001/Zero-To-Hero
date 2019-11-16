package Market;

import java.util.ArrayList;

public class GroceryList extends GroceryBuddy {

    ArrayList <String> cart= new ArrayList<>();


    void addItemToCart (String itemName ){

        cart.add(itemName);


        //add code to reduce stock inventory

    }

    void printCartItem (){

        System.out.println("items inside of the cart ");
        for(String  item: cart){
            System.out.println( item + " ");
        }
    }


     double totalPrice () {

        double sum=0;

        for (int i=0; i<cart.size(); i++) {

            sum = sum + itemPrice(cart.get(i));
        }
        if (sum >=100 ){
            sum = sum*0.85;
        }else if (sum >=50 && sum<100){
            sum = sum *0.9;
        }

    return sum;

    }

    void modifyCart (String newItem, int position){

        // you code goes here please complete the method
    }

    void reoveItem (String itemName ){

        // you code goes here please complete the method

    }

    int findItem (String itemName ){

        // you code goes here please complete the method

        return 0;
    }

    void printAllItems (){

        System.out.println("fruit names");

        for (int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i] + " - " );
        }

        System.out.println("Veggi names");

        for (String veggi: vegetables){
            System.out.println(veggi +" ");
        }

        System.out.println("product names");

        for (String prNames: products){
            System.out.println(prNames +" ");
        }
    }





}
