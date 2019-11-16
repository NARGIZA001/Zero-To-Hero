package StaticPractice;

public class Cat {

    static int meoMix=10;
    int kitKab=8;
    // create one method which will take int number
    // this method is called eatMix
    // once I call the method it will reduce number of
    // meowMix, return type is boolean


    public static  boolean  eatMix( int amount) { // we put static because meoMIx is static.
        if (amount<=meoMix){
            meoMix-=amount;

            System.out.println(meoMix + " is left");

            return true; // if i'm able to eat return true
        }


        return false; // otherwise false
    }

    // create one method, it will take one int number
    // this method is called eatKit
    // once I call the method it will reduce number of kitKab
    // return type is boolean



    public boolean eatKit(int amount){

       // inside of the nonstatic method you can call

        if (amount<=amount){
            kitKab-=amount;

            System.out.println(kitKab + " is left from dodo");
            return true;
        }

        return false;
    }

}
