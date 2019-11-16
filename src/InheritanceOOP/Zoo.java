package InheritanceOOP;

public class Zoo {

    public static void main(String[] args) {

        WildAnimal wildAnimal=new WildAnimal();
        wildAnimal.eat();
        wildAnimal.run(); // since we have created from wild class it will print out all the methods from wild class


        System.out.println("++++++++++++++++++");


        animal an=new animal();
        an.eat();
        an.sleep(); // since we have created an object from parent class it inheritates the methods from animal class



        System.out.println("++++++++++++++++++");



        DomesticAnimal domesticAnimal=new DomesticAnimal();
        domesticAnimal.run();
        domesticAnimal.eat();

        System.out.println("++++++++++++++++++");

        Lion l=new Lion();
        l.eat();
        l.roar();
        l.fight();
        l.run();

        System.out.println("++++++++++++++++++");

        Dog d=new Dog();
        d.eat();
        d.sleep();
        d.run();



    }
}
