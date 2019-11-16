package Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException    {

    public static void main(String[] args) {


        String filePath="src/Exceptions/myFile.txt";

        // FileReader -> throwing  FileNotFoundException

        //  ReadLine ()-> throwing IOException

        // THrowable -> Exception -> IOException -> FileNotFoundException

        try {

            FileReader reader = new FileReader(filePath);
            BufferedReader reader1= new BufferedReader(reader);


            String line =reader1.readLine();
            String line2 =reader1.readLine();
            System.out.println(line);
            System.out.println(line2);

            String line3 =reader1.readLine();
            System.out.println(line3);





        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            System.out.println("there is an Exception");
        }catch (IOException e){
            System.out.println("there is IOException");
        }finally {
            System.out.println("I'm finally block ");
        }
    }
}
