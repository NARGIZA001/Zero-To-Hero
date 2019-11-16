package ZIQ;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class sortObjects {
    private static Arrays Arrrays;

    ////////// SORTING ARRAY

    public static void main(String[] args) {


        String[] fruits = new String[]{"Pineapple", "Apple", "Orange", "Banana"};



        Arrrays.sort(fruits);

        int i = 0;
        for (String temp : fruits) {
            System.out.println("fruits " + (++i) + " : " + temp);
        }
    }
    ////////// SORTING LIST

    /*List<String> fruits = new ArrayList<String>();

	fruits.add("Pineapple");
	fruits.add("Apple");
	fruits.add("Orange");
	fruits.add("Banana");

	Collections.sort(fruits);

    int i=0;

	for (String temp: fruits){
        System.out.println("fruits " + ++i + " : " + temp);
    }*/


    ///////////////// SORTING COMPARABLE
    public class Fruit implements Comparable<Fruit> {

        private String fruitName;
        private String fruitDesc;
        private int quantity;

        public Fruit(String fruitName, String fruitDesc, int quantity) {
            super();
            this.fruitName = fruitName;
            this.fruitDesc = fruitDesc;
            this.quantity = quantity;
        }

        public String getFruitName() {
            return fruitName;
        }

        public void setFruitName(String fruitName) {
            this.fruitName = fruitName;
        }

        public String getFruitDesc() {
            return fruitDesc;
        }

        public void setFruitDesc(String fruitDesc) {
            this.fruitDesc = fruitDesc;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public int compareTo(Fruit compareFruit) {

            int compareQuantity = ((Fruit) compareFruit).getQuantity();

            //ascending order
            return this.quantity - compareQuantity;

            //descending order
            //return compareQuantity - this.quantity;

        }
    }


}
