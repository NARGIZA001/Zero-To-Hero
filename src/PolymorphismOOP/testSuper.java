package PolymorphismOOP;

public class testSuper {


    public static void main(String[] args) {

        // Reference side  has to be super class
        // object side has to be Child class
        Super child = new GrandChild();// when polymorphysm give us only method or object reference side always we put parent class name reference
        child.myMethod();
        child.staticMethod();



        System.out.println("---------------");
        Child child1 = new GrandChild();
        child1.childMethod();
        child1.myMethod();
        child1.staticMethod();



        System.out.println("--------------");
        Super child2=new GrandChild();
        ((Child) child2).childMethod();     // we are going to cast one class down to get  it's methods
        ((Child) child2).staticMethod();
        ((GrandChild) child2).staticMethod();

    }
}


