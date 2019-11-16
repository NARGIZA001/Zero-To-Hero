package StringPackage;

public class StringAdvance {

    public static void main(String[] args) {

        // initialize the name
        String name="Muammer";
        // re-assigning the name
        name="Arslan";

        String sName=name+" Ali";

        System.out.println(name); // Arslan

        System.out.println(sName);// Arslan Ali

        String computerName="Mac Pro";

        System.out.println(computerName+" 2019"); //Mac Pro 2019

        computerName=computerName+" 2019";

        System.out.println(computerName); // Mac Pro 2019


        String schoolName="Techtorial";

        // length() will return number of the char in String.
        // result will be int
        System.out.println("String length is "+schoolName.length());

        String fullName=schoolName+" Academy";

        System.out.println("Fullname length is "+fullName.length());

        String userName="techtorialaaaaaaammfjrmrmfjlkjfds;lkjf;alsf;lasdjf;lasdjf'askljdf mamdfmfq";

        int l=userName.length();
        System.out.println("username lenght is "+l);
        System.out.println(userName.charAt(l-1));
        // In java counting start from the 1
        // In java indexing start from 0

        System.out.println(userName.charAt(0)); // t
        System.out.println(userName.charAt(3)); // h
        System.out.println(userName.charAt(7));// i
        System.out.println(userName.charAt(9)); // l
        //System.out.println(userName.charAt(-6));
        // if you wanna find out last char from the string
        // we need first find out the length of the String
        System.out.println(userName.charAt(userName.length()-1));

        // if in the index there is not char, java will throw an exception
        // StringIndexOutOfBoundException

        int userNameLength=userName.length();

       // System.out.println(userNameLength);


        // middle char

        // a b c d e f g ==> 7  d = 3
        // charAt((length-1)/2)
        // charAt(length-1)



        String success="hustlingst";

        System.out.println(success.indexOf("s",3)); // 8
        //indexOf will return first matching values' index
        System.out.println(success.indexOf("t")); //3
        System.out.println(success.indexOf("k")); //-1

        // charAt will return the char from giving index. Will throw an exception length 10 --> 15th
        // indexOf will return index from giving String. If there is not matching it will give the -1.




        // print find the last char from the String
        // print the middle char from the string
        // print the first char from the string
        // find the second matching index of 'n' from the string
        // print the length of String
        // print index of 'k'
        // print the 20th char

        String animal="Dragon Animal";

        System.out.println(animal.charAt(animal.length()-1));
        // (length-1)/2
        System.out.println(animal.charAt((animal.length()-1)/2));

        System.out.println(animal.charAt(0));

        System.out.println(animal.indexOf("n",animal.indexOf("n")+1));

        System.out.println(animal.length());

        System.out.println(animal.indexOf("k"));

        System.out.println(animal.charAt(20));// throw the exception
    }

}
