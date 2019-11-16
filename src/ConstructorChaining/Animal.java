package ConstructorChaining;

import java.sql.SQLOutput;

public class Animal {
    public String name;
    public int age;
    public String color;
    protected int weight; // can be accessed under the same package, it also can be accessed in other package but with subclasses.
    int height; // default access modifier is package protected  . Only accessible under same package.



    public void eat(){

        System.out.println(" Animal ia eating");
    }

    private void sleep(){

        System.out.println(" Animal is sleeping ");
    }

    public static void main(String[] args) {
        Animal animal1=new Animal();
        animal1.sleep();
        animal1.color="Pink";
        System.out.println(animal1.color);
        animal1.weight=20;
        System.out.println(animal1.weight);

    }
}
