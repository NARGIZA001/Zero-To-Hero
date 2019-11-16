package InharitanceOOP3;

public class OverloadingMethods {
    public static Number getNumber (Number num ){
        System.out.println("My parameter is Number  ");
        return 1;
    }


    protected static Integer getNumber (Integer num ){
        System.out.println("My parameter is Integer  ");
        return 2;
    }

    static Double getNumber (Double num ){
        System.out.println("My parameter is double ");
        return 3.1;

    }

    public static void main(String[] args) {


        getNumber(3); // static methods can CALL STATIC METHODS without the instance .

        getNumber(3.5); // Double will be provided because 3.5 is a double

        getNumber(3.12f); // it will provide the NUmber because there is no float .... so it will Number

    }
}
