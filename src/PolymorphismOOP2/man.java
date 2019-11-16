package PolymorphismOOP2;

public class man extends human implements Dad {

    @Override
    public void eat (){
        System.out.println("man ia eating ");
    }

    @Override
    public void walk (){
        System.out.println("man is walking ");
    }

    @Override
    public void shave (){
        System.out.println("man is shaving ");
    }

    public void playSport(){
        System.out.println("man is playing soccer");
    }

    @Override
    public void feed() {
        System.out.println("Dad feeds the family ");
    }
}
