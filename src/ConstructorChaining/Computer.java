package ConstructorChaining;

public class Computer {

    // privet variables can be accesed only in the same class

        private String name;
        private String operatingSystem;
        private String brand;
        private String model;
        private int year;
        private int memory; //if you don't give any access modifier , it is default access.
        private int inch;





    public Computer (){

    }

    public Computer( String name, String operatingSystem, String brand, String model){
        this.name=name;
        this.operatingSystem=operatingSystem;
        this.brand=brand;
        this.model=model;


    }
    public Computer (int sYear, int sMemory, int sInch){
       year=sYear;
       memory=sMemory;
       inch=sInch;

    }

    // to be able to call the constructor inside of another constructor
    // it should in the first statement  the SOUT line.

    public Computer (String name, String operatingSystem, String brand, String model,int year, int memory, int inch){
        this(name, operatingSystem,brand,model);
        this.year=year;
        this.memory=memory;
        this.inch=inch;

    }


    public String getName  (){
        return name;
    }
    public void setName(String name){
        this.name=name;

    }
    public String getBrand  (){
        return brand;
    }
    public void setBrand(String brand){
        this.name=brand;

    }
    public String getModel  (){
        return model;
    }
    public void setModel(String model){
        this.model=model;

    }
    public String getOperatingSystem  (){
        return operatingSystem;
    }
    public void setOperatingSystem(String operatingSystem){
        this.operatingSystem=operatingSystem;

    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory=memory;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
