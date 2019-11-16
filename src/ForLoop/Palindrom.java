package ForLoop;


public class Palindrom {

    public boolean isPalindrom(int original) {
        int temp = original;
        int reversed = 0;

        while (temp > 0) {

            int remainderOriginal = temp % 10;//1--2--3
            reversed = reversed * 10 + remainderOriginal; //120+3=123
            temp = temp / 10; //32/10=3/10=0
        }
        if (original==reversed) {

            return true;
        }

        return false;
    }

        public static void main (String [] args) {


            Palindrom mypalinNUM = new Palindrom();

            boolean result = mypalinNUM.isPalindrom(1221);

            System.out.println(result);


        }

}

/*    }







        for (int i = num; i >= 0; i--) {

            rem= num% 10;

            reverse=(num*10)+rem;
        }
        System.out.println(reverse);

        if (reverse==a) {

            System.out.println("it is palindrome");
        } else {

            System.out.println("it is not palindrome");
        }*/