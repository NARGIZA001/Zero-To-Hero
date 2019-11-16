package ForLoop;

public class NumberTree {


    public static void main(String[] args) {
//        1
//        12
//        123
//        1234
//        12345

        // \t --> tab
        // \n --> new line
       for(int row=1;row<=5;row++){
           System.out.println();
            for(int column=1;column<=row;column++){
                System.out.print(column);
            }
       }


       ////////////////////////

        for(int row=1;row<=5;row++){
            System.out.println();
            for(int column=1;column<=row;column++){
                System.out.print(row);
            }
        }
        System.out.println();

        for(int hour=2;hour<=4;hour++){

            System.out.println(hour);
            for(int minute=1;minute<60;minute++){
                System.out.print(minute);
            }
            System.out.println();
        }


    }
}
