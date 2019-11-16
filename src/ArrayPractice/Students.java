package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;


public class Students {
    public static void main (String [] args ){

        String [] studentNames= {"Erkin", "Adilet", "Gulnara", " Nazire", "Aimira", "Kira", "Kira", "Sema", "Rumeisa"};
        Arrays.sort(studentNames);
        Scanner input=new Scanner(System.in);
        String name=input.next();

        for (int i=0; i< studentNames.length; i++){
            if ( name.equalsIgnoreCase(studentNames[i])){
                System.out.println(i);
                break;
            }else if (i==studentNames.length-1){
                System.out.println(-1);
                break;

            }else if (name.equalsIgnoreCase("Muammer")){
                System.out.println("Muamer is not coming back!");

            }
        }


    }
}
