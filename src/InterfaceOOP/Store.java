package InterfaceOOP;

public interface Store {

    //ALL VARIABALES OF INTERFACE ARE PUBLIC STATIC AND FINAL

    int CAPACITY=20;

    // it is abstract and it is public by default ();

    void sellItem ();

    int countEmployees();

    default void displayItem(){
        System.out.println("Display item in Store Interface ");
    }

}
