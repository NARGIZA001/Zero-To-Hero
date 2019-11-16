package ZIQ;

public class fibonacciNumber {

    /**
     The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
     The next number is found by adding up the two numbers before it.
     The 2 is found by adding the two numbers before it (1+1)
     */

    public static int findFibonacci(int enterNUM){

        int sum =0, num1 =0,  num2=1;

        for (int i=2; i<enterNUM; i++){

            sum=num1+num2;
            num1=num2;
            num2=sum;

            System.out.println(sum);
        }

        return sum;

    }

    public static void main(String[] args) {

        int num=0;
        int num1=1;
        int sum =0;


        for (int i=2; i<8; i++){

            sum=num+num1;
            num=num1;
            num1=sum;

            System.out.println(sum);
        }

         findFibonacci(8);
    }



}
