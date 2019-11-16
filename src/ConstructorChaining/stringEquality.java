package ConstructorChaining;


public class stringEquality {
    public static void main(String[] args) {
        String student ="David";
        String student1="David";
        String student3="David";


        System.out.println(student==student1);

        String student2=new String("David");

        System.out.println(student==student2);

        student=student2;

        System.out.println(student==student2);

        student1=student1+""; // "" will make it different String therefore it won't go to the same memory location.

        System.out.println(student1==student3);

        System.out.println(student3== "Da"+"vid");




    }
}
