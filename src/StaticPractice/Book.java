package StaticPractice;

public class Book {
    String name;
    // I wanna only store the business books
    String kind;
    // it will be always same author (Jihm Rohn)
    String author;
    int  pages;

    int count;

    //Instance initialization block
    //We are using this block to initialize our instance variables.
    {
        kind="Business Book";
        author="Jihm Rohn";

        System.out.println("this is instance initialization block");
        count++;
        //this will run before object.
        //this is a Instance block

    }

    static {

        // we are using static block to initialize our instance variables.
        System.out.println("This is static block. I'm running only one time.");
    }

    public Book (String name, int pages){
        this.name=name;
        this.pages=pages;
    }

}
