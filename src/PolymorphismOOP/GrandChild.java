package PolymorphismOOP;

public class GrandChild extends Child {

    @Override

    public void childMethod(){
        System.out.println(" I am child method in GrandChild class");
    }
    public static void staticMethod(){
        System.out.println(" I am static method in GrandChild class");
    }

}
