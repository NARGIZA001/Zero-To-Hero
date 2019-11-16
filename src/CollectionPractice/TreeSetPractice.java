package CollectionPractice;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPractice {


    public static void main(String[] args) {

        TreeSet<String > evenAttendanceList=new TreeSet<>();

        evenAttendanceList.add("Mike");
        evenAttendanceList.add("Cake");
        evenAttendanceList.add("Sake");
        evenAttendanceList.add("Lake");

        //evenAttendanceList.add(null); --> linkedHashSet doesn't allow null value


        System.out.println(evenAttendanceList);

        evenAttendanceList.pollFirst();

        System.out.println(evenAttendanceList);

        Iterator<String > i=evenAttendanceList.descendingIterator();

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
