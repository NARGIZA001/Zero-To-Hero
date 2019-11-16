package StringPackage;

import java.util.Scanner;

public class StringHomework {



    public static void main(String[] args) {

         // Real Estate
        // Affiliate Marketing
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter two business names");
        // if you have a space between the world we need to use the nextLine()
        String real=sc.nextLine();
        String marketing=sc.nextLine();

        boolean equals=real.equalsIgnoreCase(marketing);

        System.out.println(equals);

        //""+marketing.charAt(0);
        // "Tech"+1;
        boolean firstLetter=real.startsWith(""+marketing.charAt(0));

        System.out.println(firstLetter);

        boolean length=real.length()==marketing.length();

        System.out.println(length);

        // All primitive data types we need to use logical operators
        // ==,>=, <=, < , > , !=
        // String to compare the values we can not use the logical operator

        //2019
        real="2019 "+real;
        marketing="2019 "+marketing;

        System.out.println(real);
        System.out.println(marketing);

        //2019-Real-Estate
        real=real.replace(" ", "-");
        marketing=marketing.replace(" ", "-");

        System.out.println(real);
        System.out.println(marketing);

        System.out.println(real.substring(4,8).trim().toUpperCase());
        System.out.println(marketing.substring(4,8).trim().toUpperCase());


    }
}
