package InheritanceOOP;

public class Lion extends WildAnimal {
    @Override

    public void eat (){
        System.out.println("Lion is eating meat");
    }

    public void roar (){ // can't be overriden because it's a brand new method
        System.out.println("Lion roars");
    }
}
