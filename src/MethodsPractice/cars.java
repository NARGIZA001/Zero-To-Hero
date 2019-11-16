package MethodsPractice;

public class cars {
    public static void main(String[] args) {
        Car car1=new Car();// created an object
        car1.make="Toyata";
        car1.model="Camry";
        car1.year=2019;
        car1.price=20000;

        Car car2=new Car(); // create an object
        car2.make="Porsche";
        car2.model="Cayenne";
        car2.year=2015;
        car2.price=50000;

        car1.drive();
        car1.stop();
        System.out.println(car1.getPrice());
        System.out.println(car1.year);
        System.out.println(car1.model);
        System.out.println(car1.make);

        car2.drive();
        car2.stop();
        System.out.println(car2.getPrice());
        System.out.println(car2.year);
        System.out.println(car2.model);
        System.out.println(car2.make);


    }
}
