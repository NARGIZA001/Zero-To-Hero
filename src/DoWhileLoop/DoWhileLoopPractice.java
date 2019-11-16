package DoWhileLoop;

public class DoWhileLoopPractice {


    public static void main(String[] args) {


        int totalNumber=4;

        do{
            System.out.println("Muammer");
            totalNumber--; // 3 2 1 0
        }while(totalNumber>0);











        int totalNumber1=4;

        do{
            System.out.println("Muammer");
            totalNumber1--; //3
        }while(totalNumber1<0); // false

        // only one time "Muammer" will be printed







        int totalNumber2=4;

        while(totalNumber2<0) {
            System.out.println("Muammer");
            totalNumber2--; //3
        }

        // There will not be any output

    }

}
