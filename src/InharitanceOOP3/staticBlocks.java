package InharitanceOOP3;

public class staticBlocks {

    // final key word in the class will nno one can extend this class


    String name;

    public static final String LEGALSTATUS; // initialize the final value because you don't want to change it later on , this variable is becoming constant.
    // you can also intialize it in static block but your variable must be static  and variables always with UPPERCASE....


    static{

        LEGALSTATUS="Citizen";

        System.out.println("I;m static block from StaticBlock class ");

    }

    // if this variable is not static you need to initialize it in instatnce block


    {

       // LEGALSTATUS="Citizen"; we are not going to initialize here becase we initialise the LEGALSTATUS="Citizen" in static block

        System.out.println("I'm instance block is the StaticBlock class");

    }
    /*
     public staticBlock (){
        System.out.println(" I'm constructor of this static class ");
    }*/


}
