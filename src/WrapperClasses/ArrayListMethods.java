package WrapperClasses;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

    public static void main(String[] args) {
        ArrayList <String> nameList=new ArrayList<>();

        nameList.add("Adam");

        System.out.println(nameList);

        nameList.add("John");

        nameList.add("Steve");

        System.out.println(nameList);

        nameList.add(1,"Diana");

        System.out.println(nameList);

        // if you try to add the value to your arrayList but ArrayList size is less than index number it will throw IndexOutOfBoundExeption

        List items=new ArrayList(); // list and arrayList List can not be initiantiated like " List items=new List() NONO NO;

        items.add ("Banana");

        items.add(1, "Banana");

        items.add(1,"Orange");

        System.out.println(items);

        nameList.add(3,"Banana");

        System.out.println(nameList);

        //Get method

        System.out.println(items.get(1));

        System.out.println(nameList.get(2));

        // if you have a lot of items you need to use loop to get the elements that you need


        // Remove Method will remove the onject from the ArrayList

        nameList.remove("John");

        System.out.println(nameList);

        nameList.remove(1); // if given index number is more than ArrayList it will throw an Exeption

        System.out.println(nameList);

        nameList.remove("trump"); // it is not in the ArrayList so the output will be the same as before.

        ArrayList <Integer> prices=new ArrayList<>();

        prices.add(1);
        prices.add(2);
        prices.add(3);

        // int vlaues is automatically converted to the integer object. It is called autoboxing.
        prices.remove(1);

        // since it's a index number it will remove that element with that index number  from the ArrayList
        System.out.println(prices);

        prices.set(1,5);

        System.out.println(prices);

        System.out.println(prices.isEmpty());   // since price ArrayList is not empty it will return false.

        System.out.println(prices.size());

        //contains () method;

        System.out.println(prices.contains(5+ "contains"));




    }
}
