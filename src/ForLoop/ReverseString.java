package ForLoop;

public class ReverseString {

    public static void main(String[] args) {

        // Palindrome:
        // civic,
        String name="MOM";
        String reverse="";

        // for loop

        for(int i=name.length()-1;i>=0;i--){

            reverse+=name.charAt(i);
        }
        System.out.println(reverse);

        if(name.equals(reverse)){

            System.out.println("it is palindrome");
        }else{

            System.out.println("it is not palindrome");
        }





        String school="8tech4to3ri8al9";// length 10 ,, 9

        for(int i=0;i<=school.length()-1;i++){

            for(char ch='0';ch<='9';ch++){ // 0 1 2 3 4 5 6 7 8 9

                if(school.charAt(i)==ch){

                    System.out.println(school.charAt(i));
                }
            }

        }












    }

}
