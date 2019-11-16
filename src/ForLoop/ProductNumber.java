package ForLoop;

public class ProductNumber {

    public static void main(String[] args) {

        int number=980793245;
        int product=1;
        int sum=0;

         while(number>0){

             System.out.println(number%10);
             product*=number%10; // 6*1, 6*5=30, 30*4= 120
             sum+=number%10;
                number=number/10;

        }

        System.out.println(product-sum);


         // go over the string
        // print only letter if is matching with p

        // for, if(letter==p)

        String name="Muammer 1345346765moiqwenrp";

        // if you are doing multiple same you need to use the
        // if you using if in ur statement use the if

     for(int i=0;i<name.length();i++){

         if(name.charAt(i)=='p'){

             System.out.println(name.charAt(i));
         }
     }
    }
}
