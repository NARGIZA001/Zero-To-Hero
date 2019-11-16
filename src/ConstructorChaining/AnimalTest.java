package ConstructorChaining;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.eat();
        //animal.sleep();
        //animal.color="Pink";
        animal.weight=10;
        System.out.println(animal.weight);
    }
}
