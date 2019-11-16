package InterfaceOOP2;

public interface flashCard extends faceRecognition {

    // by default it is public static final
    int SIZE=128;


    // public abstract void location();
    void location ();


    // regular method
    default void regularMethod (){
        System.out.println(" Regular method from flashcard interface ");
    }

    // static method can be in interface
    static void staticMethod (){
        System.out.println("Static method from flashcard interface ");
    }
}
