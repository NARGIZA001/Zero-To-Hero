package ArrayListPractice;

import java.util.ArrayList;

public class ManippulatingStringTest {

    public static void main(String[] args) {


        ManipulateString str= new ManipulateString("M4T98KL1");

        int sumNumber=str.sumNumber();

        System.out.println(sumNumber);


        ArrayList<Character>letterList=str.getLetterList();
        System.out.println(letterList);


    }
}
