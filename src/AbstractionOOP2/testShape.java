package AbstractionOOP2;

public class testShape {

    public static void main(String [] args){
        Triangle triangle=new Triangle("Triangle");

        triangle.height=5;
        triangle.width=6;
        System.out.println(triangle.calculateArea());
        triangle.draw();
        triangle.superDraw();


        System.out.println("----------------------------------------------");


        Circle circle =new Circle("Circle");
        circle.radius=10;
        System.out.println(circle.calculateArea());
        circle.draw();
        circle.superDraw();
    }
}
