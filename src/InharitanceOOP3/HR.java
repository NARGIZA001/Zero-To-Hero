package InharitanceOOP3;

public class HR extends Company {
    public HR(){
        super("Google");
    }
    @Override
    public Integer employees(){
        return 20;
    }
    @Override
    public int buildings(){
        return 1;
    }

    @Override

    Boolean hire () {
        return  true;

    }


}
