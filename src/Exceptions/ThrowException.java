package Exceptions;

import java.io.IOException;

public class ThrowException {
    public static void main(String[] args)  {
        try {
            System.err.println(" I am about to throw an exception "); // to make it red color you may put instead of OUT ...ERR
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("I'm finally here ");
        }
    }
}
