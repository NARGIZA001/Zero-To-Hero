package ConstructorChaining;

public class SoccerPlayer {
    String name;
    String nationality;
    String teamName;
    int age;
    double height;
    double weight;

    public SoccerPlayer(){

    }

    public void run(){

        System.out.println( "The soccer player is runing  ");
    }
    public SoccerPlayer ( String aname,String anationality,String ateamName,int aage,double aheight,double aweight){
        name=aname;
        nationality=anationality;
        teamName=ateamName;
        age=aage;
        height=aheight;
        weight=aweight;
    }

    public void run(String name) {

        System.out.println(name+" is running");

    }

    public void shoot (){

        System.out.println("The soccer player is kicking the ball");

    }
    public void shoot (int speed ){
            shoot();
        System.out.println( "The speed of the shoot is " + speed);
    }

    public void shoot (int distance,int speed){

        shoot(speed);

        if (speed>50 && distance<25){

            System.out.println("it is goal");
        } else {
            System.out.println("it is not goal");
        }
    }


}
