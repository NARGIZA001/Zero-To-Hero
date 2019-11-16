package StaticPractice;

public class StaticReview {



    static String name;
    {
        System.out.println("this is instance block");
    }

    static {

        System.out.println("this is static block");

    }

    static public void test (){ // can change the modifier location with static and fnal it will still function

        //static int num =10;

        // inside of any method you can not create static variable.
        // Static Variables CAN be created inside of class but  outside of block , or  outside of method.

        System.out.println(name);


        System.out.println("this is a static method");
    }

     public void test1(){
        test();
         System.out.println(name);
     }

     public static int addNum(int a, int b){
        int sum =a+b;

       return sum;
     }

     public static int substractNum(int a, int b){

        if (a>b){

            return a - b;

        }else if (b>a) {

            return b - a;
        }
        return 0;
     }

    public static int divideNum(int a, int b) {
        int result = a / b;

        return result;
    }

    public static int multiply(int a, int b){

        int result= a*b ;

        return result;
    }


}
