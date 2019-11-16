package StringPackage;

import java.util.Scanner;

public class StringReplace {

    public static void main(String[] args) {

        String success="dotentimesmore";

        success=success.replace('d','D');

        System.out.println(success);

        success=success.replace("ten","eleven");

        System.out.println(success);

        success=success.replace('m', 'M');

        System.out.println(success);

        success=success.replace('X', 'M');

        System.out.println(success);
        // it will search the string to find oldchar or oldString
        // if it is not able find it will not change the value.

        String achievement="      do ten times more     ";

        achievement=achievement.trim();

        System.out.println(achievement);

        // Using scanner give the following value
        // "   Zero To Hero    "
        // trim the spaces
        // print only "Hero"
        // replace Zero with "One"
        // print all of them upper case
        // return true if it is equal ignore case to "zero to hero"


        Scanner input=new Scanner(System.in);

        System.out.println("Please provide the String value");

        String name=input.nextLine();

        name=name.trim();

        String subs=name.substring(name.indexOf("H"));

        System.out.println(subs); // Hero

        name=name.replace("Zero", "One");

        // One To Hero
        System.out.println(name);

        System.out.println(name.toUpperCase());

        // One To Hero iquals ignore case zero to hero== false
        boolean result=name.equalsIgnoreCase("one to hero");

        System.out.println(result);

    }

}
