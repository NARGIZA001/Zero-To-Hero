package Variables;

public class CharPractice {

    public static void main(String [] args){

        char letter;

        letter='A';

        // java first converts letter to decimal number
        // then decimal numbers to binary system

        char number='1';

        int decimalNumber=letter; // java first converts letter to decimal number

        System.out.println(decimalNumber);

        int letterB=2345;

        char ch=(char)letterB;  // java converts decimal numbers to char

        System.out.println(ch);
    }

}
