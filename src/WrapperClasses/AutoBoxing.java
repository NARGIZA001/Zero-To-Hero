package WrapperClasses;

import ForLoop.IntegerNumber;

public class AutoBoxing {
    public static void main(String[] args) {
        int mouse =6;

        Integer mouse1=mouse;

        // mouse primitive is automatically converts primitives to wrapper calss if you assign the primitive to wrapper class

        char c='k';
        Character cr=c; // it is autoboxing

        boolean b =true;

        Boolean bn=b; //it is autoboxing

        // UnBoxing

        Float ft=15.10f;

        float ft1=ft; // java comverts from objects to the primitive ==> its called UnBoxing

        Double money =10000.99;

        double money1=money; // unboxing can apply to all primitive data types


        Character paper = 'C';

        boolean bln=paper.isDigit(paper);

        System.out.println(bln);



        String str="naefei02121fjscn333";

        paper.isDigit(paper);

        paper.isAlphabetic(paper);

        // create to one method it will take the string as a parameter  and it will return the wrapper integer


        String number="455abc678defg"; //127*-128

        for  (int i=0; i>number.length(); i++){

            int numberInt= Integer.parseInt(number);

        }

    }
}
