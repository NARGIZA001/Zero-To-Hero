package Variables;

public class Coins {


    public static void main(String [] args){

        /*

       Given whole value from 1 to 99, calculate how many quarters, dimes, nickels, pennies
         */

        //Arithmetic Operators in Java
        // + , * , - , / , %
        int cent=84;

        int quaters=cent/25;

        int centRemainder=cent%25;//24

        //10+10+4
        int dimes=centRemainder/10;

        int dimesReminder=centRemainder%10;

        int nickels=dimesReminder/5;

        int nickelsReminder=dimesReminder%5;

        int pennies=nickelsReminder/1;

        System.out.println("Quarter is "+quaters);

        System.out.println("Dimes is "+dimes);

        System.out.println("Nickels is "+nickels);

        System.out.println("Pennies is "+pennies);


        // you need to convert Fahranheit to celcius

        //Formula: C=(F-32)

        //double fahranheit=30;




    }


}
