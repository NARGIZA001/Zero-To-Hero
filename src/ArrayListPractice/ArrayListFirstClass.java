package ArrayListPractice;

import java.util.ArrayList;

import java.util.List;

public class ArrayListFirstClass {

    //StringBuilder builder =new StringBuilder (8); -- # 8 is the capacity  of the StringBuilder.
    // This 8 is capacity of StringBuilder.
    // sout(builder.length()); --> 0 length because there is no value.
    // Capacity is changable . If you store more value it will automatically adjust the size of the capacity

    // builder.append("Key");

    // sout (builder.length());-->3
    // builder.append ("is for class");
    // builder.length(); --> length is

    public static void main(String[] args) {

        ArrayList list=new ArrayList(); // you may to store all kinds of objects (Character, Integer, Short .....)

        ArrayList list1=new ArrayList(10); // size is 0--> capacity 10;

        ArrayList list2=new ArrayList(list1);

        ArrayList <Integer> list3=new ArrayList<>(); // you can scpecificaly store only Integer objects

        ArrayList <String> list4=new ArrayList<String>();

        List list5=new ArrayList();







    }


}
