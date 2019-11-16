package ForLoop;

import java.util.Scanner;

public class ForLoopExample {


    public static void main(String[] args) {


        // It is important,

        for(int i=0;i<10;i++){ // i=1, 2 3 4.. 9, 10

            System.out.println(i);

        }

        //
        int k=0;

        while(k<10){

            System.out.println(k);
            k++;
        }


        //

        for(int i=1;i<=5;i++){
            System.out.println("Muammer");
        }


        for(int i=9;i>=0;i--){
            System.out.println(i);
        }

        // enter the number (5times)
            // i, k , l
        Scanner input=new Scanner(System.in);
        int number;
        int sum=0;

//        for(int i=0;i<5;i++){
//
//            System.out.println("Please enter the number");
//            number=input.nextInt();
//            sum=sum+number;
//
//        }

        System.out.println(sum);

        //cube of the number
        // 5-9
        // 5*5*5==25*5=125
        // 6*6*6


        for(int i=5;i<=9;i++){// 6,7, 8, 9 , 10
            System.out.println(i*i*i);//5*5*5, 6*6*6 , 7 , 8, 9
        }


        // using scanner please enter the number 28
        // 1, 2, 4, 7, 14, 28
        // using for loop print entered number dividers
        // 28%2=0
        // 28%4=0
        // 28%5=3

        for(int i=1;i<=100;i++){// 2, 3 , 4

            if(100%i==0){
                System.out.println(i);// 1, 2 , 4
            }
        }







    }






}
