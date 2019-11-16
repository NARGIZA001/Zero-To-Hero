package Market;

import java.util.HashMap;
import java.util.Map;

public class ConvertingArrayListinMap {

    public static void main(String[] args) {

        String [] fruits = { "Apple", "Orange", "Watermelon", "Banana", "Pineapple", "Grape","Mango", "Strawberry", "Peach", "Cherry"};

        String [] vegetables= {"Carrots", "Broccoli", "Onion", "Potato", "Tomato", "Cucumber","Corn", "Bean", "Spinach", "Pepper"};

        String [] products={ "Milk", "Bread", "Beef", "Eggs", "Chicken", "Sugar" ,  "Salt" ,"Coffee", "Rice", "Pasta"};

        double  [] fruitsPrice = {2.99, 1.99,3.99,2.49,0.99,1.69,2.49,4.99,3.39,1.79};

        double [] vegetablesPrice= {2.99, 1.99,3.99,2.49,0.99,1.69,2.49,4.99,3.39,1.79};

        double [] productsPrice={2.99, 1.99,3.99,2.49,0.99,1.69,2.49,4.99,3.39,1.79};

        Map <String , Double > allProducts= new HashMap<>();

        for (int i =0; i< fruits.length; i++) {
            allProducts.put(fruits[i], fruitsPrice[i]);

        }

        for (int i =0; i< vegetables.length; i++) {
            allProducts.put(vegetables[i], vegetablesPrice[i]);

        }

        for (int i =0; i< products.length; i++) {
            allProducts.put(vegetables[i], productsPrice[i]);

        }

        System.out.println(allProducts);


    }
}
