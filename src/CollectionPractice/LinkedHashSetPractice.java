package CollectionPractice;

import java.util.Iterator;

import java.util.LinkedHashSet;

import java.util.TreeSet;

public class LinkedHashSetPractice {

    public static void main(String[] args) {

        LinkedHashSet number =new LinkedHashSet();  // creatting the LinkedHashSet

                                                    // Set name=new LinkedHashSet (); also possible.

                                                    // all the methods in HashSet we may use in LinkedHashSet.

        number.add(10);
        number.add(30);
        number.add(20);

        System.out.println(number);


        TreeSet<String >evenAttendanceList=new TreeSet<>();

        evenAttendanceList.add("Mike");
        evenAttendanceList.add("Cake");
        evenAttendanceList.add("Sake");
        evenAttendanceList.add("Lake");

        //evenAttendanceList.add(null); --> linkedHashSet doesn't allow null value


        System.out.println(evenAttendanceList);

        evenAttendanceList.pollFirst();

        System.out.println(evenAttendanceList);

      Iterator <String > i=evenAttendanceList.descendingIterator();

      while (i.hasNext()) {

            System.out.println(i.next()+ " ");
        }

        System.out.println(evenAttendanceList);

        evenAttendanceList.pollFirst();

        System.out.println(evenAttendanceList);

        evenAttendanceList.pollLast();

        System.out.println(evenAttendanceList);


    }
}
