package StringPackage;

public class StringMethods {

    public static void main(String[] args) {

              String sName="techtorial";
        int num=1;

        num++;

        System.out.println(num);

        System.out.println(sName.toUpperCase()); // TECHTORIAL

        // String is immutable.
        System.out.println(sName); // techtorial

        sName=sName.toUpperCase();  // String is assigned again

        System.out.println(sName);  // TECHTORIAL

        // Difference between primitive data type and String
        // 1- String is immutable
        // 2- Primitive data types are mutable.
        // 3- String should be reassigned to be able to change

        String student="ARSLAN";

        System.out.println(student.toLowerCase()); // arslan

        System.out.println(student); // ARSLAN

        student=student.toLowerCase();

        // arslan
        student+=" Kabul";

        // = it means assignment in java.
        // == it means is equals to (comparison operators)
        System.out.println(student); // lower case arslan

        String animal="ANimal";
        System.out.println("Animal".length());

    }


}
