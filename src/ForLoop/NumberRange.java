package ForLoop;

import java.util.Scanner;

public class NumberRange {
    public static String makeOutWord (String out, String word) {

        String a= out.substring(0,2);
        String b=out.substring(2,4);
        String c=a+word+b;

        return c;

    }

    public static void main(String[] args) {

        System.out.println(makeOutWord("bubu","lala"));





//        Using the scanner enter the number
//        if this number is between 10 - 40
//        Print it is in the range
//        If the number is not in the range
//        print it is not in the range
//                Example
//        20 it is in the range
//        5 it is not in the range

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the number");
        int number=input.nextInt();

        if(number>18 && number<=40){

            System.out.println(number + " is in the range");

            for(int i=number;i<=40;i++){

                System.out.println(i);

            }

        }else{

            System.out.println(number + " is not in the range");
        }


        //1- The number is in the range (give the number between 19 to 40)
        //2- The number is not in the range ( give the number out of 19 - 40)
        //3- Upper limit 40, Lower limit 19




    }
}
