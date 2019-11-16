package ConstructorChaining;

public class NumberPractice {

    public int multiply (int num ){
       return num *10;
    }
    public double remainder (int value){
        return value % 4;
    }

    public static void main(String[] args) {

        int appleNumber =10;

        NumberPractice apple=new NumberPractice();

        apple.multiply(appleNumber); // apple number will not change it will only provide the copy of the original.

        System.out.println(appleNumber); //remains 10




        appleNumber=apple.multiply(appleNumber); // using the multiply method




        System.out.println(appleNumber); //after reassigning the appleNumber it will be 100.

        System.out.println(apple.remainder(appleNumber)); //remainder of 100 % 4=0

        System.out.println(appleNumber); // remains the same it called pass by value

        // if appleNumber won't be reassigned it will not change the value



    }
}
