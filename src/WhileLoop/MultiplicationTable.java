package WhileLoop;

import java.util.Scanner;

public class MultiplicationTable {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the number");
        int number=input.nextInt(); // 15

        int count=1;

        while (count<=10){

            System.out.println(number+"*"+count+" = "+number*count);
            count++;
        }






    }






}
