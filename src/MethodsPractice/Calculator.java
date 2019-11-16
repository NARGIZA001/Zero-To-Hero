package MethodsPractice;

public class Calculator {
    // write a method that will accept two int parameters
    // and will return sum of their two integers as a int

    public int sum(int num1, int num2) {

        int sum = num1 + num2;

        return sum;

    }

    public int substract(int num1, int num2) {

        int substract = num1 - num2;

        return substract;

    }

    public int multiply(int num1, int num2) {

        return num1 * num2;
    }

    public int division(int num1, int num2) {

        return num1 / num2;

    }

    public int remainderNumber(int num1, int num2){
        return num1 % num2;


    }

    public boolean remainder(int num1, int num2) {

        if (num1 % num2 == 0) {
            return true;
        } else if (num1 % num2 != 0) {
            return false;
        }
        return false;

    }

    //write a method that will accept 3 parameters,
    //two of them will be int numbers and one string operator
    //and will return the result for these two number based
    //on their operator.
    public int calculator(int num1, int num2, String operator) {

        if (operator.equals("+")) {
            return sum(num1, num2);

        } else if (operator.equals("-")) {
            return substract(num1,num2);

        } else if (operator.equals("*")) {
            return multiply(num1,num2);

        } else if (operator.equals("/")) {
            return division(num1, num2);

        } else {
            System.out.println(" Your opeartor is invalid ");
            return -1;
        }
    }
}
