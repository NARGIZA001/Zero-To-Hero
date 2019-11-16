package CodingBat;

public class CodingBatPractice {

    public int diff21(int n) {
        n=20; // you can out any number here

        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2; // 25-21 = 4*2 = 8
        }
    }
    public boolean makes10(int a, int b)  {
        int makes10 = a + b;
        return (makes10 == 10 || a == 10 || b == 10);
    }
    public boolean nearHundred(int n) {

        int a = 100-n;
        int b = 200-n;
        return (Math.abs(a) <= 10 || Math.abs(b) <=10); // print out withing
    }
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {


        return (aSmile==bSmile);// if both monkeys are smiling we are in trouble , that means == symbol says either way we are are in trouble.
    }
    public int sumDouble(int a, int b) {
        int sum= a+b;
        if (a==b){

            sum=sum*2;

        }
        return sum;
    }
    public String endUp(String str) {

        if (str.length()<=3); return str.toUpperCase();

        //int  cut = str.length()-3;

       // String begin= str.substring(0,cut);
        //String finish= str.substring(cut);

        //return begin + finish.toUpperCase();

    }




    public static void main (String [] args){
        CodingBatPractice n=new CodingBatPractice();
        n.diff21(20);
        n.makes10(5,5);
        System.out.println(n.diff21(20));
        System.out.println(n.makes10(5,5));
      //  System.out.println(Math.abs();

    }
}
