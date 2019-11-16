package InheritanceOOP;

public class DomesticAnimal extends animal {
    @Override
    public void eat(){

        System.out.println("Domestic  animal is eating bread");

    }

    @Override
    public void sleep(){

        System.out.println("Domestic animal is sleeps on the cauch ");

    }

    @Override

    public void run(){

        System.out.println("Domestic  animal  runs very slow ");

    }

}
