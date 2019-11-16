package MethodsPractice;

public class TestCalculator {
    public static void main(String[] args) {

        Calculator c =new Calculator(); //Calculator came from the previous class

        System.out.println( c.sum(20,11));

        // Calculator class has lie this in
        //int sum = num1 + num2;
        //return sum;

        System.out.println(c.substract(20,5));

        // int substract(int num1, int num2) {
        //int substract = num1 - num2;
        //return substract;

        System.out.println(c.multiply(2,2));

        // int multiply (int num1, int num2 )
        // int multiply = num1* num2;
        // return multiply;

        System.out.println(c.division(10,5));

        // int division (int num1, int num2 )
        // int division= num1/num2;
        //return division;


        System.out.println(c.remainder(8,4)); // true becaue 8/4 is 2 no remainder

        //int remainder (int num1, int num2)
        // return num1 % num2; this is the short version it still will give the same result

        System.out.println(c.remainder(25,2)); // false beacue 25 can't be divided by 2;



    }

}
