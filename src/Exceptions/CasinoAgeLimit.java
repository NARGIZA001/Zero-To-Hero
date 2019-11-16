package Exceptions;

public class CasinoAgeLimit {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CasinoAgeLimit(String name, int age) {
        this.name = name;
        this.age=age;
    }

    public static void casinoAccess (CasinoAgeLimit ageLimit) throws Exception{
        if (ageLimit.getAge()<21){
            throw new Exception(" Age restriction, NO PLaying Casino  ");

        }

        System.out.println(ageLimit.getName()+ " welcome to casino ");
    }

    public static void main(String[] args) throws Exception {
        CasinoAgeLimit girl=new CasinoAgeLimit("boll", 26);
        girl.casinoAccess(girl);

        CasinoAgeLimit casinoAgeLimit=new CasinoAgeLimit("John", 20);
        casinoAgeLimit.casinoAccess(casinoAgeLimit);

        CasinoAgeLimit boy=new CasinoAgeLimit("lol", 15);
        boy.casinoAccess(boy);


    }


}
