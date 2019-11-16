package ZIQ;

import java.util.Scanner;

public class perfectNumber  {
    /** Perfect number, a positive integer that is equal to the sum of its proper divisors.
     *  The smallest perfect number is 6, which is the sum of 1, 2, and 3. Other perfect numbers are 28, 496, and 8,128.
     */

    public static int perfectNum(int number ){
        int Sum=0;
        for (int i=1; i<number; i++){
            if (number% i== 0){
                Sum=Sum+i;
            }
        }
        if (Sum ==number){
            System.out.println("It's a perfect number ::"+ number);
        }else {
            System.out.println("It's  NOT a perfect number ::"+ number);
        }
        return number;
    }

    public static void main(String[] args) {
//        int i, Number, Sum = 0 ;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("\n Please Enter any Number: ");
//        Number = sc.nextInt();
//
//        for(i = 1 ; i < Number ; i++) {
//            if(Number % i == 0)  {
//                Sum = Sum + i;
//            }
//        }
//        if (Sum == Number) {
//            System.out.format("\n% d is a Perfect Number", Number);
//
//        } else {
//
//            System.out.format("\n% d is NOT a Perfect Number", Number);
//        }

        perfectNum(6);
    }


}
