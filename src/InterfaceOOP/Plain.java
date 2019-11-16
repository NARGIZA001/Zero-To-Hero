package InterfaceOOP;

public class Plain implements Flyable,Sound {

    @Override
    public void fly() {
        System.out.println("Plain is flying ");
    }

    @Override
    public void makeNoise() {

        System.out.println("Bzhhhhhhhhh");
    }
}
