package Exceptions;

import java.io.IOException;

public class Example {

    public static void main(String[] args) throws Exception, Throwable, InterruptedException, IOException {
        WebBrowser webBrowser=new WebBrowser();
        webBrowser.sleep(2);
        webBrowser.readFile("src/Exceptions/myFile.txt");

        try {
            throw new Exception();
        }catch (Exception e){
            System.out.println("There is an Exception");
        }

        System.out.println("-------------------------");

        testNumber(1);
        System.out.println("I'm done with main method ");

    }

    public static void testNumber (int num ) throws Exception {
        if (num < 0 ){
            throw new Exception("Negative number ");

        }

        System.out.println("this is  a positive number ");
    }

    public static void error ()throws Throwable{

        throw new java.lang.Error();
    }
}
