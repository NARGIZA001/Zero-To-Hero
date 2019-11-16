package StringPackage;


public class CatClass {
    //instance variables
    //name, age, color boolean isRunning; kind , speed
    String name;
    String color;
    String kind;
    int age;
    boolean isRuning;
    int speed;
    // What's the instance of the class means object of the class

    public boolean start(){
        isRuning=true;
        return isRuning;

    }

    public boolean stop(){
        isRuning=false;
        return isRuning;
    }
    public void run(String direction){
        System.out.println(" cat is runing "+ direction);
    }

    public void catInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(color);
        System.out.println(kind);
        System.out.println(speed);
        System.out.println(isRuning);
    }
    // current speed is 0; target speed is 6
    public void accelerate ( int targetSpeed){
        int currentSpeed =speed;
        for ( int i=0; i<targetSpeed; i++){
            currentSpeed=i;
            System.out.print(currentSpeed); // 0 1 2 3 4 5 6
        }
    }
    //current speed 6--- targetSpeed 3
    public void slowDown ( int targetSpeed){

        }

    public static void main( String [] args){
        CatClass kitty=new CatClass();
        kitty.name="kitty";
        kitty.age=1;
        kitty.color="pink";
        kitty.kind="english";
        kitty.catInfo();
        kitty.start();
        kitty.catInfo();
        kitty.stop();
        kitty.catInfo();
        kitty.start();
        kitty.accelerate(10);
        System.out.println();
        kitty.slowDown(5);
        kitty.catInfo();

    }
}