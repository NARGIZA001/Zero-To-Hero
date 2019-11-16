package ForLoop;

public class PrintTheLetter {


    public static void main(String[] args) {


        String name="Techtorial Academy";
        // index will return the number
        // charAt will return the char
        // index number y is 17
        // what is the length 18

       // System.out.println(name.charAt(17));
        //it will give the stringIndexOutOfBoundException
        // runtime error

        ///System.out.println(name.indexOf('k'));
        // -1

        // System.out.println(name.replace('k', 'a'));
        // Since there is no k inside my String, it will remain same
        // System.out.println(name.length());

        for(int i=0;i<=name.length()-1;i++){

           // System.out.print(name.charAt(i)+",");

            if(name.charAt(i)=='a' || name.charAt(i)=='A'){

                System.out.println(name.charAt(i));
            }

        }



    }
}
