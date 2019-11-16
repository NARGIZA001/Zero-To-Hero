package Exceptions;

public class MyExeptions extends RuntimeException {

    public MyExeptions(){
        super();
    }

    public MyExeptions(String message ){

        super(message);

    }

    @Override
    public  String getMessage (){
       return "this is my exception message ";
    }

    public static void main(String[] args) {
        throw new MyExeptions("I'm throwing my exception ");

    }



}
