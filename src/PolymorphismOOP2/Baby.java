package PolymorphismOOP2;

public class Baby extends Boy {

    @Override

    public void eat(){
        System.out.println(" Baby can eat ");
    }

    @Override
    public void cry(){
        System.out.println(" Baby is crying ");
    }

    public void crawl(){
        System.out.println(" Baby is crawLing ");
    }
}
