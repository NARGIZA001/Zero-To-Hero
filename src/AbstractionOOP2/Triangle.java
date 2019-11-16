package AbstractionOOP2;

public class Triangle extends Shape{


    int height ;
    int width;




    public Triangle(String name){ /// implementing the construct with one parameter method in super class (Shape)
        super(name);
    }


    @Override
    public double calculateArea() {
        return height*width/2;
    }



    @Override
    protected void draw() {

        System.out.println("I'm drawing a triangle");

    }
}
