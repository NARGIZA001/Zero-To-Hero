package StaticPractice;

public class StaticVariableInitializationOCA {

    private static final int NUM_SECONDS_PER_HOUR;

    static {
        int numSecondsPerMinute= 60;
        int numMinutesPerHour=60;

        NUM_SECONDS_PER_HOUR = numSecondsPerMinute*numMinutesPerHour;

        //NOTE; the static initializer runs when the class first used the statement in it run and assign any static variables as needed .
        // before  it ws said that we couldn't reassign the final variable but you actually can because the static initializer is the first assignment.
        // and since it occurs upfront it is okay .

    }

    private static int one;

    private static final int two;

    private static final int three=3;

    private static final int four;



    static {
        one=1; // it declares that is static so we can assign as many times as we want;
        two=2; // declares final without initializing it, this means we can initialize  ONLY one time in static block

        //three=3;  //second attempt to reassign doesn't  compile (this means we can initialize  ONLY one time in static block )



        four=4; // in book it says it doesn't compile because you allow to reassign only one time what ever the finals won't be reassigned again so
                //no more change but in case of four =4; it's working why ?

        /**
         *
         *  it is better use constructor approach code because it make your code more readable. When you need to use static initializer put all
         *
         *  the static initialization int the same block .That way the order is obvious.*/


    }

    public static void main(String[] args) {


        StaticVariableInitializationOCA test =new StaticVariableInitializationOCA();

    }
}
