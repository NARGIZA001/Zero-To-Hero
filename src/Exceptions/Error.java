package Exceptions;

public class Error {

    public static void myMethod (){

        // StackOverFlow means out of stack memory.

        // we can handle it but we must not handle it because it is not right better to rewrite the new code


        System.out.println("I'm inside of my method ");


        myMethod();


    }

    public static void main(String[] args) {
        try{

            myMethod();
        }catch (Throwable e){
            System.out.println("Out of memory");
            System.out.println(e.getMessage());
        }

    }
}
