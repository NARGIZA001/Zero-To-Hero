package ConstructorChaining;

public class ComputerTest {
    public static void main(String[] args) {
        Computer c=new Computer();// I called no argument

        Computer c1=new Computer("Apple", "OS","MacBook", "Pro");

        /*
        immutable class
        my instance variables should be private
        i need to create only getters
        we need to set the value using the constructor .
        */

        Computer c2=new Computer(2015,8,13);

        System.out.println(c.getName());// null
        System.out.println(c.getYear());// 0

        c.setName("HP");

        System.out.println(c.getName());

        c.setName("Asus");

        System.out.println(c1.getName());

        c1.setName("Acer");

        System.out.println(c1.getName()); //Acer

        System.out.println(c2.getMemory());

        System.out.println(c.getMemory());


       Computer [] computer={new Computer(), new Computer(), c1,c2};

        System.out.println(computer[2].getName());
        System.out.println(computer[3].getMemory());

        Computer [] comlist={c,c1,c2}; // loop is good if there is more computers .

        //for (computer cc:comlist) {
           // System.out.println(cc.memory);
        }






    }

