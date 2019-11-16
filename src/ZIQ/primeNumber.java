package ZIQ;

public class primeNumber {
    /** A prime number is a whole number greater than 1 whose only factors are 1 and itself.
     *  A factor is a whole numbers that can be divided evenly into another number.
     * The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29.
     * Numbers that have more than two factors are called composite numbers.*/

    public static boolean checkPrime (int n ){

        if (n <=1){
            return false;

        }
        for (int i=2; i<Math.sqrt(n); i++){
            if (n % i ==0){
                return false ;
            }
        }
        return true ;
    }

    public static boolean isPrimeNumber(int number) {
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }



        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(checkPrime(90));

        System.out.println(isPrimeNumber(29));


    }
}
