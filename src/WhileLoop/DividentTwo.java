package WhileLoop;

import java.util.Scanner;

public class DividentTwo {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the number");
        int number=input.nextInt();  //18
        int count=0;

        while(number>0){

            number=number/2;  // 4 // 2 // 1
            count=count+number; // 0+9 // 9+4= 13// 13+2=15// 15+1 =16

        }

        System.out.println(count);




    }




}
