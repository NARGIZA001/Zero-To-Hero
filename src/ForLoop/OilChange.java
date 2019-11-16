package ForLoop;

public class OilChange {


    public static void main(String[] args) {

        // imagine I am change my oil after 2000 miles
        // 1 change one time
        // Every 500 miles I need full the my tank
        // 4 times full the tank then change oil
        // My tank is empty I am getting tank is empty message
        // after 2000 miles I am getting change the oil message

        // I get the message for oil change, then change the oil

        int count=1;
        int coun1=1;

        for(int oil=0;oil<4;oil++){

            System.out.println(count++ +"- Please change the oil");

            for(int gas=0;gas<4;gas++){

                System.out.println(coun1++ +"- Please full the tank");
            }


        }
    }
}
