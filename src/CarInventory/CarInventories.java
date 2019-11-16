package CarInventory;

import ArrayListPractice.CarC;

import java.util.ArrayList;

public class CarInventories {

    private String  dealerName;

    public CarInventories(String dealerName){

        this.dealerName=dealerName;
    }

    public void getCarName(ArrayList <Car> carList){
        for (Car c: carList){
            System.out.println(c.getName());
        }
    }

    public void getPrice(ArrayList <Car> carList){
        for (Car c: carList){
            System.out.println(c.getPrice());
        }
    }

    public void getVinNumber(ArrayList <Car> carList){
        for (Car c: carList){
            System.out.println(c.getVinNumber());
        }
    }


    public void getYear(ArrayList <Car> carList){
        for (Car c: carList){
            System.out.println(c.getYear());
        }
    }
    public void setModelYear(ArrayList <Car> carList, String vinNumber, int year){  //loop through the arraylist to find the elements
        for (int i=0; i<carList.size(); i++){
            if (carList.get(i).getVinNumber().equalsIgnoreCase(vinNumber)){ // finding the VinNumber to match the VinNumber
                carList.get(i).setYear(year); // getting vinNumber element and from that finding the year and setting the year.
            }

        }
    }

    public void changePrice(ArrayList <Car> carList, String vinNumber, int price){  //loop through the arraylist to find the elements
        for (int i=0; i<carList.size(); i++){
            if (carList.get(i).getVinNumber().equalsIgnoreCase(vinNumber)){ // finding the VinNumber to match the VinNumber
                carList.get(i).setPrice(price); // getting vinNumber element and from that finding the price and setting the price.
            }

        }
    }
                                                                    // it will add the car to our ArrayList  if car is not available.
    public void addNewCar(ArrayList <Car> carList, Car newCar){  //loop through each array to find the elements with with vinNumber
        boolean hasCar=false;
        for (Car c: carList){
           if ( c.getVinNumber().equalsIgnoreCase(newCar.getVinNumber())){
               System.out.println("This car is already in stock");
               hasCar=true;
           }
        }
        if (!hasCar){
            carList.add(newCar);
            System.out.println("Your new car has been added");
            System.out.println(newCar.getName());
        }
    }

    public void removeCar( ArrayList <Car>  carList, String vinNumber){

        for (int i=0; i<carList.size(); i++ ) {
            if ( carList.get(i).getVinNumber().equalsIgnoreCase(vinNumber)) {
                carList.remove(i);
            }
    }   }




    public static void main(String [] args){

        Car car1=new Car("Toyota","Prius",25000,2001,"VIN1234K45");
        Car car2=new Car("Mercedes","Corolla",30000,2002,"VIN125K");
        Car car3=new Car("Bugatti","Veiron",31000,2003,"VIN1234");
        Car car4=new Car("Ford","Camry",32000,2004,"VIN1234K");
        Car car5=new Car("BMW","Highlander",33000,2005,"VIN1234K"); // will this change the actual year
        Car car6=new Car("Porche","Sienna",34000,2006,"VIN1234");
        Car car7=new Car("Toyota","Versa",35000,2007,"VIN123S");
        Car car8=new Car("Toyota","4Runner",36000,2008,"VIN1KLM");
        Car car9=new Car("Toyota","Yaris",37000,2009,"VIN67HJ4");
        Car car10=new Car("Honda","Accord",38000,2010,"VI67HDN");

        CarInventories dealer=new CarInventories("AutoNation");

        ArrayList <Car> carList=new ArrayList<Car>();


        carList.add(car5);
        carList.add(car1);
        carList.add(car6);



        dealer.getCarName(carList);

        dealer.getVinNumber(carList);

        dealer.getPrice(carList);


        dealer.setModelYear(carList,"VIN125K", 2015);

        dealer.getYear(carList);

        dealer.getPrice(carList);

        dealer.changePrice(carList,"VIN1234K",45000);

        dealer.getPrice(carList);

        dealer.addNewCar(carList, car1);

        dealer.addNewCar(carList, car1);

        dealer.addNewCar(carList,car6);


        dealer.getCarName(carList);

        dealer.removeCar(carList,"VIN1234");

        dealer.getCarName(carList);

    }
}
