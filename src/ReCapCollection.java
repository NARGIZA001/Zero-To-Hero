import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class ReCapCollection {
    public static void main(String[] args) {


        ArrayList<Integer> ar1=new ArrayList<>();
        ArrayList<Integer> ar2=new ArrayList<Integer>();
        List<String>st1=new ArrayList<>();


        // Creating Arraylist with size



        ArrayList<Integer> ar3=new ArrayList<>(10);
        ArrayList<Integer> ar4=new ArrayList<>(ar3);
        ar3.add(100);



        //adding Array to Arraylist


        Integer [] num={3,5,7,9}; //

       //  List<Integer>ar5= Arrays.asList(num);

        // when you do asList collection  you may need to add one by one each elemenet because array is a fixed size .
        // but if you for each loop it will adjust the size

        List <Integer> ar5=new ArrayList<>();
        for (Integer a: num ){
            ar5.add (a);
        }

        ar5.addAll(ar3);

        System.out.println(ar5.size()+" size");

        System.out.println(ar5);

        List <String> cities = Arrays.asList(new String [] {"moskow", "Paris "});

        List<String>cities2= new ArrayList<>(cities);

        /////// add values

        cities2.add("Istanbul");

        cities2.add(1,"London"); // element you weher you want to place hte value

        System.out.println(cities2);

        cities2.addAll(cities2);
        System.out.println(cities2);
        cities2.addAll(cities);
        System.out.println(cities);
        cities2.addAll(3,cities); // you can insert one collection at the position of the collection colll+ (index 3, coll1)+coll3
        System.out.println(cities2);


        ////// indexOf

        System.out.println(cities2.indexOf("London")); //finding the first element
        System.out.println(cities2.lastIndexOf("london")); // finding the last element -> but if you want the middle element you need to use for loop

        ///// set element
        cities2.set(1,"Miami");



        //////// remove value

        cities2.remove("London"); // remove by value it will remove only first matching London
        System.out.println(cities2);
        cities2.remove(6); // removing by index will remove that specific element.
        System.out.println(cities2);
        cities2.removeAll(cities); // will remove the whole collection from the cities2
        System.out.println(cities2);
        cities2.clear(); // will bring the empty collection []
        System.out.println(cities2+ " after clear");



        ////check is list is empty

        System.out.println(cities2.isEmpty()); // boolean will return the true if it is empty , false if it is not empty

        System.out.println(cities2.size()==0); // if you do not do ==0 it will return just zero if you want true nad false you may use ==0










    }
}
