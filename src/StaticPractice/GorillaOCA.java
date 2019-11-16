package StaticPractice;

public class GorillaOCA {



    //**** STATIC VS INSTANCE ****//


    public static  int count; // static variable

    public static void addGorilla () {


        count++; } // static method  // will compile because both static and instance methods can refer to static variable

    public static void babyGarilla () {   count++;}  // static method // will compile because both static and instance methods can refer to static variable




    public void announceBabiesToEveryone (){   // instance method

        addGorilla();                         // these are fine because instance method can call a static method

        babyGarilla();                       // these are fine because instance method can call a static method
    }



    /**public static void announceBabiesToEveryone (){

        addGorilla();       // doesn't compile because static method can't call instance method //////
        babyGarilla();
    }

    public int total;

    public static double average=total /count; // doesn't compile because static method can't call instance variable  //////
    **/



    private static int counts ;

    public GorillaOCA () { counts++; }

    public static void main(String[] args) {

        GorillaOCA c1=new GorillaOCA();
        GorillaOCA c2=new GorillaOCA();
        GorillaOCA c3=new GorillaOCA();

        System.out.println(counts);     // Usually we write System.out.println(c1.counts) || (c2.counts) || (c3.counts) it will still print the #3
                                        // because of the 3 objects
                                        // if you put 5 more objects , static ( and instance variable ) will automatically initialize the default value for that type
    }

}
