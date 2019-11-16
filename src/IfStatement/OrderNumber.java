package IfStatement;

import java.util.Scanner;

public class OrderNumber {



//    int one=12 - 4
//    int two=4
//    int three=7
//    int four=3
//
//
//   1-  one > two
//   2-  one > three
//   3-  one > four
//   4-  two > three
//   5-  two > four
//   6-  three > four

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter four number");
        int one=input.nextInt();
        int two=input.nextInt();
        int three=input.nextInt();
        int four=input.nextInt();


        if(one>two){

            int temp=one; //temp=12
            one=two; //one=4
            two=temp; // two=12
        }

        if(one>three){
            int temp=one;
            one=three;
            three=temp;
        }

        if(one>four){
            int temp=one; // tem=4;
            one=four; // one=3;
            four=temp; // four=4;

        }

        if(two> three){   //two=12 , three=7
            int temp=two; //temp=12
            two=three;    //two=7;
            three=temp;   //three=12
        }

        if(two>four){ // two=7 , four= 4

            int temp=two; // temp=7
            two=four; // two = 4
            four=temp; // four= 7
        }


        if(three> four){ // three=12 , four= 7
            int temp=three; // temp = 12;
            three=four; // three=7
            four=temp; //  four=12
        }

        // one= 3  , two=4   , three=  7 , four= 12


        System.out.println(""+one+"\n"+two +"\n"+ three +"\n"+four);
        System.out.println(""+four+"\n"+three +"\n"+ two +"\n"+one);
    }





}
