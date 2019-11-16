package ZIQ;

import javax.lang.model.element.Name;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {


   public static Set<String> duplicatesNames (String [] names){

       Set<String> duplicates = new HashSet <> ();

       for (String d: names){

           if (duplicates.add(d)==false){

               System.out.println(" duplicates :" + d);
           }
       }

       return duplicates;
   }

    public static Set<String> uniquesNames (String [] names){

        Set<String> unique = new HashSet <> ();

        for (String u: names){

            if (unique.add(u)==true){

                System.out.println(" uniques :" + u);
            }
        }

        return unique;
    }



    public static void main(String[] args) {
        String [] Names = {"lola", "mama", "lola", "cindy","baby", "1","2", "1","2"};

        duplicatesNames(Names);

        uniquesNames(Names);

        for (int i=0; i<Names.length; i++){
            for (int j=i+1; j<Names.length; j++){
                if (Names [i].equalsIgnoreCase(Names[j])) {

                    System.out.println(" duplicates:: " + Names[i]);
                }
            }
        }

        String name ="Merve";

        System.out.println(name.charAt(2));

    }

}
