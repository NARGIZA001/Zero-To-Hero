package WrapperClasses;

public class getIntValue {

    public Integer getIntValue (String strNum){

        String result ="";

        for  (int i=0; i<strNum.length(); i++){

            if (Character.isDigit(strNum.charAt(i))) {

                result= result+(strNum.charAt(i));
            }

        }

        Integer myNum=Integer.valueOf(result); // returning an Object
        return myNum;
    }

    public static void main(String[] args) {

        getIntValue digits=new getIntValue();

        String database= "abc-321-def-456";

        System.out.println(digits.getIntValue(database));


    }
}
