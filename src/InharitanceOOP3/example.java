package InharitanceOOP3;

public class example extends staticBlocks {

    static {
        System.out.println("i'm example static block of example class");
    }
    {
        System.out.println("i'm example instance  block of example class");
    }
    public example (){

        System.out.println("I'm a constructor of example class ");
    }

}
