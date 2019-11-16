package ArrayPractice;

import java.util.Arrays;

import java.util.Scanner;

public class MultiDimalArrays {
    public static void main (String [] args ){

        String [][] groupedNames={{"Adilet", "Aimira", "Arslan", "Aiturgan"},{"Nazire", "Yasemin", "Vitalii","Nargiza","Sasha"}};

        Scanner input =new Scanner (System.in);

        String name = input.next();

        for (int i=0; i< groupedNames.length; i++){

            for (int a=0; a< groupedNames.length; a++){

                Arrays.sort(groupedNames[i]);

                if (groupedNames[i] [a].equalsIgnoreCase(name)){

                    System.out.println(Arrays.deepToString(groupedNames));  // deepToString means to bring details in the array

                    System.out.println("in array" + i+ " in order "+ a);
                }
            }
        }



    }
}
