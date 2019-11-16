package ZIQ;

import java.util.Scanner;

public class printingStars   {

    public static void main(String args[]) {

        for(int i=0; i<5; i++) {

            for( int j=0; j<=i; j++) {


                System.out.print("* ");

            }
            System.out.println();
        }

//************** PYRAMID STAR METHOD*****************


        int i, space, rows, k=0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number of Rows : ");

        rows = scan.nextInt();

        for(i=1; i<=rows; i++) {
            for(space=1; space<=(rows-i); space++) {
                System.out.print("  ");
            }
            while(k != (2*i-1)) {

                System.out.print("* ");

                k++;
            }

            k = 0;
            System.out.println();
        }
    }
}
