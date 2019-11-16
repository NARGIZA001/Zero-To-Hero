package StaticPractice;



import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import ArrayListPractice.ArrayListFirstClass;

import static StaticPractice.StaticReview.test;

import static StaticPractice.StaticReview.*;

import static java.lang.Math.*;

public class StaticTest {

    public static void main(String[] args) {

        StaticReview rev=new StaticReview();
        StaticReview rev1=new StaticReview();

        StaticReview.test();

        rev.test1();

        test();

        Math.addExact(10,5);

        System.out.println(addExact(-10,-5));

        System.out.println(multiplyExact(5,7));


        List<Integer> num=new ArrayList<>();


        num.add(1);
        num.add(4);
        num.add(3);

        System.out.println(num);

        Collections.sort(num); // to sort arrayList

        System.out.println(num);

    }
}
