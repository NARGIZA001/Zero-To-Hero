package StringPackage;

public class StringSubs {

    public static void main(String[] args) {

        String patientInfo="45 - Walnut - Jessica";

        System.out.println(patientInfo.substring(5));

        System.out.println(patientInfo.substring(5,11));

        // 5, 11 ---> 5,6,7,8,9,10
        // 3, 7  ---> 3,4,5,6

        // patientInfo.substring(5,5)--> it will empty string

        System.out.println(patientInfo.substring(5,5)); // ""

        // patientInfo.substring(5,4)
        // --> java will throw the exception.(runtime error).

        System.out.println(patientInfo.length());

        // length is 21
        // last index number is 20

        // patientInfo.substring(5,21)  --> it will throw an exception

        System.out.println(patientInfo.substring(5,21));


    }
}
