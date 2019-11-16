package MethodsPractice;

public class arrayMethods {

    String studentName;
    String [] students=new String [5];
    int count; // by difault count is zero;

    public void addStudent () {

        students[count]=studentName;
        count++; //this will increament the students everytime it itaretes

    }

    public void printNames (){
        for (String name: students){
            System.out.println(name);
        }
    }
}
