package AbstractionOOP;

public  class campusStudent extends Student {


    @Override
    public void study(){
        System.out.println("Campus students are studying ");
    }
    @Override
    public  void attendClass (){
        System.out.println("Students attend class in campus ");
    }
    @Override
    public void homeWork(){
        System.out.println("Campus students are doing their home works ");

    }
}
