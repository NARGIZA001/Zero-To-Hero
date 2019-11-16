package MethodsPractice;

public class Student {

    int age;
    public void study(){
        System.out.println("Student is studying!");
    }

    public void study(int hours){

        System.out.println("Student is studying " + hours+ " hours");


    }


    public void study(String name){

        System.out.println(name + " is always studying ");
    }


}
