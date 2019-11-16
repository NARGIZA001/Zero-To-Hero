package Exceptions;

public class MultiCatchExceptions {

    public static void main(String[] args) {

        String id= "a2345a";

        int idNum=0;


        try {

            idNum = Integer.parseInt(id); //1 will be executed

            System.out.println(idNum); // it is skipping this line of code ...
            id ="111";  // it is skipping this line of code ....
            idNum=Integer.parseInt(id);  // it is skipping this line of code ...

        }catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }finally {
            System.out.println("I'm finally block"); //2 will be executed

        }
        System.out.println(" I'm out of try catch block"); //3 will be executed
        System.out.println(id);

    }
}
