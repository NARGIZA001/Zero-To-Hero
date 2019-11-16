package TernaryOperators;

public class TernaryPractice {

    public static void main(String[] args) {

        int x=10;
        int y=5;
        int z=0;
        int k=2;
        // Ternary Operator
        // booleanExpression ? value1 : value2

        System.out.println(x>y?8:9);

        System.out.println(y>x?8:9);

        System.out.println(x==y?(z=7):(z=3));

        System.out.println(x>y? k++ : ++k); // 2
        // increased to the 3
        System.out.println(k);// 3

        // NOTE: the values doesn't have to be same data type
        System.out.println(x>y ? 40:"Hello World");

        z=3;
        System.out.println(x>y ? ++z+z++ : z++ + ++z);

        // ++z + z++ =  z = 5
        // 4 + 4 = 8

        System.out.println(z);


       // int s=x>y ? 40 :10; // compile time error

        System.out.println(x>y ? 40 :"Hello");
        System.out.println(10);
        System.out.println("Hello");

        // NOTE: if you are assigning the value from the ternary operators
        // both side should be same data type.
        // However if you not assigning the value from ternary operator
        // just printing it is not required to be same data type


        byte bt=10;
        short st=30;
        long ln=1000L;

        int number= bt>st ? bt : st;
        //--> byte and short --> always automatically casting to the int

        double db=10.5;
        float fl=5.5f;

        double number1=db>fl ? db : fl;

    }

}
