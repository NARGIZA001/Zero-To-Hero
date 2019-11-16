package ArrayListPractice;

public class Animal {
    String name ;
    int age ;
    String area;
    int dailyMeal;

    public Animal (){

    }
    public Animal (String name, int age, String area, int dailyMeal){

        this.name=name;
        this.age=age;
        this.area=area;
        this.dailyMeal=dailyMeal;


    }

    public int IncreaseDailyMeal (int value){

        this.dailyMeal+=value;
     return dailyMeal;
    }


}
