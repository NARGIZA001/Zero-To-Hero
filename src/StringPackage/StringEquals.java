package StringPackage;

public class StringEquals {

    public static void main(String[] args) {

        String company="TransUnioN";

        System.out.println(company.equals("transUnion")); //false

        // for primitive data types we are using logical operator
        // ==, >=, <=, !=
        // String to be able compare values we are using
        // startWith, endsWith, equals, contains

        System.out.println(company.equalsIgnoreCase("transunion")); // true

        String box="spam";

        System.out.println(box.equalsIgnoreCase("spam"));


    }


}
