package StringPackage;

import java.util.Arrays;

public class StringSplitMethod {
    public static void main(String[] args) {
        String schoolName= "Tchtorial Academy 2019 September Apple ";
        String [] words=schoolName.split(" ");
        System.out.println(Arrays.toString(words));
        // first side is name of the string
        // second side is name of your array
        for (String word: words){
            if ( word .startsWith("A")){
                System.out.println(word);
            }
        }
       //split the string and print only year

        String date= "09/16/2019";
        String [] dates=date.split("/");
        System.out.println(Arrays.toString(dates));

        System.out.println(dates[0]);
        System.out.println(dates[1]);
        System.out.println(dates[2]);

        String startDate= "09.16.2019";
        String [] startDates=startDate.split("\\.");
        System.out.println(Arrays.toString(startDates));
        System.out.println(startDates[0]);
        System.out.println(startDate.replace("1", ""));

    }
}
