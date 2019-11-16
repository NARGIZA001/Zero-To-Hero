package InharitanceOOP2;

public class vehicle {

    String  make;
    int year;

   /* public vehicle(){
        super (); // it is calling the super classes constructor
        System.out.println(" constructor 1");
    }*/

    public vehicle(String make){
        //this(); // this key word will call the above constructor it called constructor chaining.
        this.make=make;
        System.out.println(" constructor 2");

    }

    public vehicle(String make, int year){
        this(make);
        this.year=year;
        System.out.println(" constructor 3");

    }

    public static void main(String[] args) {

        vehicle v=new vehicle ("t", 2017);
        vehicle v2=new vehicle("Toyota",2018);
    }
}
