package Polymorphism;

public class VertualDemo {

    public static void main (String [] args ){
        Salary s=new Salary ("Diana ", "NY NY ", 5,2500.00 );

        Employee e= new Salary("Johny", "Boston MA", 4, 2200.00); // polymorphism virtual method invocation

        // AN overriden method is invoked at run time , not matter what data type the reference is that was used  in the source code at compile time .

        System.out.println("Call mailCheck using Salary reference --- ");

        s.mailCheck();

        System.out.println("\nCall mailCheck using Employee reference ---");

        e.mailCheck();
    }
}
