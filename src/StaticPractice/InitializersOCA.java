package StaticPractice;

import java.util.ArrayList;

public class InitializersOCA {

    //**** STATIC VARIABLES ****//

    // NOTE ; some static variables can change when program runs. Counters are common example it can increase over the time ,
    // just like instance variables you can initialize the static variable on the line it is declared .


    private static int count=0; // initialization

    // NOTE; but other static variables never meant to change they known as a CONSTANT it uses FINAL modifier to make sure variable never changes.
    // all upper case letters with underscore between the "words"

    private static final int NUM_BUCKETS=45;

    private static final ArrayList<String> values =new ArrayList<>();

    public static void main(String[] args) {

       //     NUM_BUCKETS=5;  => doesn't compile because it's final and constant (instance????) variable .


          values.add("chnaged"); // it will compile because values is a reference variable. we can call methods on reference variables BUT CAN NOT reassign
                                  // the final  values to point to different objects.

    }




}
