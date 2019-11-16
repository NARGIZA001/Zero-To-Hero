package ArrayListPractice;
import java.util.ArrayList;
import java.util.List;
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList();
        //Ones I create the namelist,
        // I am saying only I can store the String,
        //Other than String I can not store any value
        nameList.add("John");
        nameList.add("Steve");
        System.out.println(nameList);
        nameList.add(1, "David");
        //nameList.add(1,"david")
        //If you try to add the value to your arrayList but
        //your arraylist size is less than index number
        //it will throw indexOutOfBonusExpection
        System.out.println(nameList);
        // nameList.add(Boolean).true);
        List items = new ArrayList();
        items.add("Banana");
        items.add(1, "Orange");
        System.out.println(items.get(0));//return
        System.out.println(items.get(1));
        System.out.println(items);
        // System.out.println(items.get(6));//indexoutexpection
        //It will throw an expection since 6th element is not available
        System.out.println(nameList);
        nameList.remove("John");
        //If the given value is not match with Arraylist element
        //It will not remove anything.Also,It will not throw the expection.
        System.out.println(nameList);
        nameList.remove(1);
        System.out.println(nameList);//adam and steve
        //nameList.remove(5);
        //If given index number is longer than the size of arraylist
        //it will throw an expection
        ArrayList<Integer> prices = new ArrayList<>();
        prices.add(1);
        prices.add(2);
        prices.add(3);
        //int values is Automatically converted to the integer object.it is called autoboxing
        prices.remove(1);
        //since it is index number.it will remove the 2 from our Arraylist.Output will be [1,3]
        System.out.println(prices);
        prices.set(1, 5);//==>repleace element from my elementlist
        System.out.println(prices);
        System.out.println(prices.isEmpty());
        //Since prices ArrayList is not empty.isEmpty method will return false
        System.out.println(prices.size());

    }
}
