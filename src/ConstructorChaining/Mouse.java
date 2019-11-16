
package ConstructorChaining;



public class Mouse {

    public String stringTimes(String str, int  n) {

        String result = " ";
        for (int i=0; i<n; i++) {
            result = result + str +" ";  // could use += here
        }
        return result;
    }

    public String frontTimes(String str, int n) {
        int frontLen= 3;
        if (frontLen>str.length()){
            frontLen=str.length();
        }
        String front =str.substring(0,frontLen);
        String result=" ";
        for (int i=0; i<n; i++){
            result+=front + " ";
        }
        return result;

        }

        int countXX(String str) {

        int count =0; // begin with 0;

        for (int i=0; i>str.length()-1; i++){ // count the index that's why we put i>str.length()-1


            if (str.substring(i,i+2).equals("xx")) count ++ ; }

        return count;
        }

         boolean doubleX(String str) {
             int i = str.indexOf("x");
             if (i == -1) return false; // no "x" at all

             // Is char at i+1 also an "x"?
             if (i+1 >= str.length()) return false; // check i+1 in bounds?
             return str.substring(i+1, i+2).equals("x");

             // Another approach -- .startsWith() simplifies the logic
             // String x = str.substring(i);
             // return x.startsWith("xx");
         }

    public String stringBits(String str) {

        String result=" ";

        for (int i=0; i<str.length(); i+=2) {

            result=result + str.substring (i, i+1);
        }
        return result;
    }
    public String stringSplosion(String str) {
        String result =" ";
        for (int i=0; i<str.length(); i++){
            result =result + str.substring(0,i);
        }
        return result;

    }

    //_____________________7?
    //public int last2(String str) {
    //
    //}
    /*Given an array of ints, return the number of 9's in the array.


    arrayCount9([1, 2, 9]) → 1
    arrayCount9([1, 9, 9]) → 2
    arrayCount9([1, 9, 9, 3, 9]) → 3*/


    public int arrayCount9(int[] nums) {

        int count =0;

        for (int i=0; i<nums.length; i++){
            if (nums[i]==9){
                count++;
            }
        }
        return count;
    }


    public boolean noTriples(int[] nums) {
        for (int i=0; i<nums.length-2; i++){
            int first=nums[i];
         if (nums [i+1]==first && nums [i+2]==first)
             return false ;
        }
        return true;
    }

    public boolean array123(int[] nums) {

        for(int i=0; i< nums.length-2; i++){
            if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3);

        }
        return false;
    }

    public String stringX(String str) {
        String result =" ";

        for (int i=0; i<str.length(); i++){

       //print out the char if its not "x"case

     if (!(i>0 && i<(str.length()-1) && str.substring (i, i+1).equals("x"))) {

        result= result+str.substring(i,i+1);
         }
       }
    return result;
    }

   /* public String altPairs(String str) {


    }*/



     public static void main(String[] args) {


        //1
        Mouse ab=new Mouse();
        int n=3;
        String str= "Baby";
        System.out.println(ab.stringTimes("Baby",n ));


        //2
        Mouse strfront=new Mouse();
        System.out.println(strfront.frontTimes("lob",5));

        //3
        Mouse xx=new Mouse();
        System.out.println(xx.countXX("xxxx"));

        //4
         Mouse dx=new Mouse();
         System.out.println(dx.doubleX("youme"));

         //5
         Mouse bits=new Mouse();
         System.out.println(bits.stringBits("Crarmerwoan"));

         //6
         Mouse Splosion=new Mouse();
         System.out.println(Splosion.stringSplosion("MelonMelon"));

         // 7
         // -------?


         //8
         Mouse Count9= new Mouse();

        // int [] arr={10,11,12,4,26,};

        // System.out.println(Count9.arrayCount9(); //putting here any number which will count of all the nines ? => 9009900990


         //9
         Mouse triples=new Mouse();
        // System.out.println(triples.noTriples([1, 1, 2, 2, 1]));

         //10
         Mouse nums=new Mouse();
         System.out.println(nums);

         //11
         Mouse x=new Mouse();
         System.out.println(x.stringX("xabxxxcdx"));









    }




}
