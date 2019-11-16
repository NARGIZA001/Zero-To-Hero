package InterfaceOOP;

public class testClasses {

    public static void main(String[] args) {



        Bird b=new Bird ();
        b.fly();
        b.makeNoise();

        Plain p=new Plain();
        p.fly();
        p.makeNoise();

        Macys macy=new Macys();
        System.out.println(macy.countEmployees());
       // System.out.println(macy.displayItem());
    }
}
