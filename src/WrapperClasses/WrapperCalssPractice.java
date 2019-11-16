package WrapperClasses;

public class WrapperCalssPractice {
    public static void main(String[] args) {

        //1 way to create the wrapper class

        Byte by = new Byte((byte)12); // we need to cast inorder to get byte

        Short sh= new Short((short)20); // we must cast

        Integer in =new Integer(50);

        Long ln= new Long (4500);

        Double db= new Double(50.9);

        Float fl=new Float(43.89f);

        Boolean bl=new Boolean (true);

        Character ch=new Character('P');


        //2 way to create the wrapper class

        Byte by1=new Byte ("12");

        Short sh1= new Short("44");


        //3 way to create the wrapper class

        Integer num=198;

        Short num1=54; // if you don't give the new keyword . you dont need to cast.

        // byte i;
        // i=50; --> initialization of the primitive data type.

        // Boolean bl= new Boolean (false ); --> Instatiating the object.

        System.out.println(by1);
        System.out.println(sh1);

        int number =55; // no nul for primitive;

        Integer computer= null;

        //number= computer; // no compile time error but it will give run time error;

        System.out.println(number);

        // Converting from String to Primitive data types.
        String values="455"; //127*-128

        int valueInt=Integer.parseInt(values);

        System.out.println(valueInt);

        String convertBl="true";

        boolean convert=Boolean.parseBoolean(convertBl);

        System.out.println(convert);

        // if you are converting String value of boolean to the primitive ,
        // all values other than true or false , it will assign as false .

        String intVAlue="900";
        int vl=Integer.parseInt(intVAlue);

        System.out.println(vl==900);

        String table ="TRUE";

        Boolean tb= Boolean.valueOf(table);

        System.out.println(tb);

        String chair= "C";


        Character ch2=new Character('C');

        Integer phone= Integer.valueOf("12");

        System.out.println(phone);

                // Converting String values to primitive data types we need to use method parseInt., parseBoolean ., parseShort., parseByte
                // Converting String values to wrapper object we need to use method called valueOf ()

        // == or .equal()  In wrapper classes equality is working same as String

        Integer apple =10;

        Integer apple2=10;

        System.out.println(apple=apple2); // true pointing to the same location

        //Example 2:

        Integer apple1=new Integer("10");

        Integer apple3=10;
        System.out.println(apple1==apple3);
        System.out.println(apple1.equals(apple3));
    }
}
