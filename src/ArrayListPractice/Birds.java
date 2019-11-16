package ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Birds {
    public static void main(String[] args) {
        List<String > birdList= new ArrayList<String>();

        birdList.add("Owl");
        birdList.add("Parrot");
        birdList.add("Penguin");

        Object [] listOfBird=birdList.toArray();

        //toArray Method will return the array. The array type is Object

        List <Integer> number =new ArrayList<>();

        number.add(10);
        number.add(11);
        number.add(12);

        Object [] numList=number.toArray();

        // if you are conveting from ArrayList to Array using array method you can only store as a object of the array
        // toArray() method will return the Object.

        String [] city = {"Chicago", "New York", "San Francisco "};

        System.out.println(city.length);

        List <String> cityNames=Arrays.asList(city);

        System.out.println(cityNames.size());

        //cityNames.add("Los Angles");

        //System.out.println(cityNames.size());

        //ArrayList is not fixed size.
        //However if you convert from Array to ArrayList it will not adjust the size.

        List<String> cityName1=new ArrayList<>(cityNames);

        cityName1.add("Los Angles");

        System.out.println(cityName1);

        for (int i=0; i<cityName1.size(); i++){

            cityName1.set(i,cityName1.get(i).toUpperCase());
        }

        System.out.println(cityName1);





    }
}
