package ForLoop;

public class PrintStringReverse {

    public static void main(String[] args) {

        String name="Muammer";

        for(int i=name.length()-1;i>=0;i--){

            System.out.println(name.charAt(i));// 6 5 4 3. 0
        }




       // int num=1;

      // num<10?"Time" : "true";

        int count=1;

        do{

            System.out.println(++count);
        }while(count<=5);


        //int num=1;

        for(long count1=3, num=1;count1<5 && num<3;count1++, num++){

            System.out.println(num);// 1 2
        }


        int count2=1;

        do{

            count2++; //2
        }while (++count2<1); //3

        System.out.println("Count 2 is "+count2);

    }
}
