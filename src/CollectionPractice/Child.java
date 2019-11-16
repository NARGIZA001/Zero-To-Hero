package CollectionPractice;

public class Child {
    private String name, city;
    private int age;
    private  char gender;


    public  Child (String name, String city, int age, char gender){
        this.age=age;
        this.city=city;
        this.gender=gender;
        this.name=name;

    }

    public boolean canGoToSchool(){

        if (age>=6){
            System.out.println("can go to school");
            return true;
        }
        System.out.println("can not go to school");
        return false;
    }

    public boolean namePalindrom(String name){

            int k=name.length();

            for (int i=0; i<k/2;i++){

                if (name.charAt(i)!=name.charAt(name.length()-i-1)){

                }
            }return false;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


}
