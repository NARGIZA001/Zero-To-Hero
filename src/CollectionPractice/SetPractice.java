package CollectionPractice;

import java.util.HashSet;

import java.util.Iterator;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {

        Set<Integer> numbers=new HashSet<Integer>(); // Since set is interface , you can not instantiate the set.
                                                        // HashSet , LinkedSet, TreeSetPractice


        numbers.add(1);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);


        System.out.println(numbers);

        // hashSet is not allowing to store duplicate elements
        // add method --> first checking the element is store to the Set  or not
        // if the value is not stored before it will store the value
        // is the value is already present int the set it will not store

        Set<Integer> values=new HashSet<>();

        values.addAll(numbers);

        System.out.println(values);

        Iterator<Integer> iterator=values.iterator();

        while(iterator.next()==20){
            System.out.println(iterator.next());

        }

        for (Integer num: values){
            if (num==20){
                System.out.println("this is from for each loop "+num);
            }
        }


        System.out.println(values.contains(30));

        values.clear();

        System.out.println("this is after clear method ");

        System.out.println(values);

        System.out.println(values.isEmpty());

        System.out.println(numbers);

        numbers.remove(40);
        System.out.println(" this is after removing the numbers " + numbers); // removed the object you provide only objects

        Set <String> names=new HashSet<>();

        names.add("Adam");
        names.add("Ben");
        names.add("Mila");
        names.add("Sasha");
        names.add("Alex");


        Set <String> personNmaes= new HashSet<>();

        personNmaes.addAll(names); // all name from name collection  package will be added
        personNmaes.add("Arnold");
        personNmaes.removeAll(names); // all the name from maes package will be removed but Arnold will stay in the set .

        // NOTE clear() method will remove completly everything and remove all will delete everything in one collection in this case




    }
}
