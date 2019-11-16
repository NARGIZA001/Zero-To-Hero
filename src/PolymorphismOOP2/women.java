package PolymorphismOOP2;

public class women extends human implements Mother {

    @Override

    public void eat (){
        System.out.println("woman is  eating ");
    }

    @Override
    public void walk (){
        System.out.println("woman is walking ");
    }

    public void makeUP(){
        System.out.println("woman is putting make up ");
    }

    @Override
    public void takeCare() {
        System.out.println("Mother is taking care of family ");
    }


}
