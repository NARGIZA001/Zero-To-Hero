package Exceptions;

public class CheckedException2 {
    public static void main(String[] args) throws Exception{


        System.out.println("I'm going to sleep ...");
        Thread.sleep(5000);
        System.out.println(" I woke up!");

        try {
            System.out.println(5 / 0);
        }catch (Exception e){

            System.out.println(e.getMessage());
        }

        System.out.println("I finished my code ");

    }
}
