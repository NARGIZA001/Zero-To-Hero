package IfStatement;

public class EvenOddNumber {

//    TASK:
//    write the if statement to find the number is even or odd.
//
//    number remainder is 0 --> even number
//    number remainder is 1 --> odd number
//
//    int num=15
//
//    print: this is odd number
//
//    int num=14
//
//    print:this is even number


    public static void main(String[] args) {


        int number=10;
        // % == 2 + 2 ....2 14+1
        // number%2==0-- evennumber
        // number%2==1-- oddNumber


        if(number%2==0){

            System.out.println(number+" is even number");
        }else{

            System.out.println(number+" is odd number");
        }


        // 10 -- 15
        // 10 , 11, 12, 13, 14, 15

        // loop inside the loop I will print only even numbers.

        int num1=10;
        int num2=15;

        // odd num%2==1
        while(num1<=num2){

            if(num1%2==1) {
                System.out.println(num1);
            }
            num1++;
        }

            // print only odd number



        int num3=10; // 11, 12, 13, 14, 15 ,,... 99, 100  15%15==0 45%15==0, 60%15==0
        // 45/15==3
        int num4=100;


        while(num3<=num4){

            if(num3%15==0) {
                System.out.println(num3);
            }
            num3++;
        }

    }

}
