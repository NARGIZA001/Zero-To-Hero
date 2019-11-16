package InterfaceOOP;

public class Macys implements Store{


    @Override
    public void sellItem() {
        System.out.println("Macy's is selling shoes ");
    }

    @Override
    public int countEmployees() {

        return 250;
    }
}
