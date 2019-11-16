package InheritanceOOP;

public class WildAnimal extends animal {

    @Override

    public void eat(){

        System.out.println("Wild animal is eating meat");

    }

    @Override
    public void sleep(){

        System.out.println("Wild animal is sleeping ");

    }


    public void fight(){

        System.out.println("Wild animal is fighting");

    }


}
