package PolymorphismOOP2;

public class Boy extends man {
    @Override
    public void eat (){
        System.out.println("man ia eating ");
    }


    public void run (){
        System.out.println("boy is running ");
    }


    public void cry (){
        System.out.println("boy is crying ");
    }
}
