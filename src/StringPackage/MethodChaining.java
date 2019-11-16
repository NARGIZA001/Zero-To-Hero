package StringPackage;

public class MethodChaining {

    public static void main(String[] args) {

        String city="Des Plaines   ";

        System.out.println(city.substring(4).toUpperCase().replace("P","T").trim());

        System.out.println(city.indexOf("P"));

        // After following method we can do method chaining
        // substring, toUpperCase, toLowerCase, Replace, Trim
        // After following methods we can NOT do method chaining
            // length, charAt, indexOf, contains, equals, equalsIgnoreCase, startWith, endwith
        //      number, char, number,  true/false, true/false, true/false, t/f , t/f


    }


}
