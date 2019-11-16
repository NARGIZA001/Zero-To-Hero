package InharitanceOOP3;

public class Company extends Object{

    String name;

    public Company (String name ) {
        this.name = name;
    }

    public Number employees(){
            return 250;
        }

        public Object progress(){
            return "In the middle of the project";
        }


        protected int buildings(){
            return 3;
        }



        Boolean hire () {
        return  true;

        }

}
