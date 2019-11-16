package Variables;

public class ApplePriceCalculater {


    public static void main(String[] args) {

        // apple price in Fresh Market is 1$
        int appleFreshMarket=20;

        //apple price in Whole Food is 3$
        int appleWholeFood=13;

        //int totalAppleNumber=12+7;
        int totalAppleNumber=appleFreshMarket+appleWholeFood;

        System.out.println("My total apple number is "+totalAppleNumber);

        int freshMarketPayment=appleFreshMarket*1;

        int wholeFoodPayment=appleWholeFood*3;

        System.out.println("Total payment for fresh Market is $"+freshMarketPayment);
        System.out.println("Total payment for whole foods is $"+wholeFoodPayment);

        int totalPayment=freshMarketPayment+wholeFoodPayment;

        System.out.println("Total payment is $"+totalPayment);

        System.out.println(freshMarketPayment+wholeFoodPayment);

        System.out.println("20 "+"39");

        System.out.println("20"+wholeFoodPayment);

        //decimal number for 'A' is 65
        // in int we can not store the character that's why it will automatically convert
        // character to decimal
        int A='A';

        System.out.println(A);
        //20 39

        //max and min number

        //declaring the variables where we are giving data type(int)
        // and giving the name for variables
        int studentNumber;

        //initialize the variables is giving value for variables
        studentNumber=25;


        //you can start the variables with underscore(_) and $ or letter
        int dateYear=1998;

        //You can end variable names with number
        //You can not use same name two times
        int date1Ye35a6r=2000;

        int _public=2001;

        int maxNumber=Integer.MAX_VALUE;

        System.out.println("Max number for integer is "+maxNumber);

            // 2147483647


        int number=2147483647;

        int minNumber=Integer.MIN_VALUE;

        System.out.println("Min number for integer is " +minNumber);

        //-2147483648

        //32 bit equals 4 byte
        int mNumber=-2147483648;

    }



}
