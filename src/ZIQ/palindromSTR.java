package ZIQ;

public class palindromSTR {

    public static boolean isPalindrom (String str){

        int k=str.length();

        for (int i=0; i<k/2;i++){

            if (str.charAt(i)!=str.charAt(k-i-1)){
                return false;

            }
        }
        return true;
    }

    public boolean namePalindrom(String name){

        String reverse="";

        for (int i=name.length()-1; i>=0; i--){

            reverse += name.charAt(i);
        }
        System.out.println(reverse);

        if(name.equalsIgnoreCase(reverse)){

            return true;

        }else{

            System.out.println("it is not palindrome");
        }
        return false;
    }

    public String longestPalindrom(String name ){

        for (int i=0; i<=name.length()/2; i++){
            if (name.charAt(i)!=name.charAt(name.length()-1-i));
            System.out.println("not polindrom");
        }

        return " it is polidrom ";
    }

    public static void main(String[] args) {

        isPalindrom("father");

        System.out.println(isPalindrom("mom"));

        System.out.println();

    }


}
