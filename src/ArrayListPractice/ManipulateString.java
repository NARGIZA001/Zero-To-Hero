package ArrayListPractice;

import java.util.ArrayList;

public class ManipulateString {

   public  String mainString;

   public ManipulateString(){

   }

   public ManipulateString(String mainString){

       this.mainString=mainString;
   }




   /**Method 1:
    Create method called sumNumber()
    take no parameter and it will get the sum of number found in String
    if there no number present in String it will return 0*/



   public int sumNumber() {
       int sum=0;
      //  String ch=""+'a'; one way to convert character to string ;

        for (int i=0; i<mainString.length(); i++){
            if (Character.isDigit(mainString.charAt(i))){

                // out string "M4T98KL1"
                String ch= String.valueOf(mainString.charAt(i)); // converting from String to Char
                int num=Integer.parseInt(ch);
                sum+=num;
            }
        }

        return sum;
   }



/**Method 2:
 Create method called getLetterList()
 Take no paramter and it will return the list of character present in String
 Store letters to the arraylist and return the arraylist(Note do not store the numbers which present in string)*/



  public ArrayList<Character> getLetterList(){

      // out string "M4T98KL1"  //Integer phone= Integer.valueOf("12");


       ArrayList <Character> letterList =new ArrayList<>();

      String letters="";

       for (int i=0; i<mainString.length(); i++){

           if (Character.isAlphabetic(mainString.charAt(i))){

               letterList.add(mainString.charAt(i));
           }
       }

       return letterList;
   }


}


