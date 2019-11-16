package DoWhileLoop;

import java.util.Scanner;

public class PrintTree {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int number=5;
        String star="*";


        // run time error. InputMismatchException

        do{
            System.out.println(star);
            star=star+"*";
            number--;
        }while (number>0);



    }

}
