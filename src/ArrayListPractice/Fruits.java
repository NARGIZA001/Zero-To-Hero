package ArrayListPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {

        ArrayList<String> fruitList=new ArrayList<>();

        Scanner sc=new  Scanner (System.in);

        int count =5;

        for (int i=0; i<5; i++){
            System.out.println(" Please enter the fruit name ?");

            String fruitName=sc.nextLine();
            fruitList.add(fruitName);


            count--;

            System.out.println(count +  "time you may enter the fruit name");
        }

        System.out.println("Your list" + fruitList);


        for (int i=0; i<fruitList.size(); i++){

           fruitList.set(i,fruitList.get(i).toUpperCase()); // get i (fruit at each index and print out Upper Case Words  )

        }
        System.out.println(fruitList);


        for (int i=0; i<fruitList.size(); i++){

            if (fruitList.get(i).startsWith("B")){

                System.out.println(fruitList.get(i)); // will print out only that element that has  the upperCase " B " ; in this cae "B"

            }
        }



    }
}
