package InterfaceOOP;

public class Bird implements Flyable,Sound {

    @Override
    public void fly() {
        System.out.println("Bird is flying");

    }

    @Override
    public void makeNoise() {

        System.out.println(" Chik Chik ");

    }
}
