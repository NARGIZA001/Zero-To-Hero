package ConstructorChaining;

    public class Employee {
        private String name;
        private int employmentYear;
        private int age;
        private int workHour;
        private String location;

    public Employee(){

    }

    public Employee(String name, int employmentYear){
        this.name=name;
        this.employmentYear=employmentYear;

    }
    public Employee(String name, int employmentYear, int age, int workHour, String location){
        this.name=name;
        this.employmentYear=employmentYear;
        this.age=age;
        this.workHour=workHour;
        this.location=location;

        if (age < 0);

    }

    public int calculateSalary(){

        int calculatedSalary;

        int twoWeekSalary=2;

        return calculatedSalary = (workHour*55*twoWeekSalary); // 2 weeks salary
    }


    public double yearlySalary(){

       double yearSalary;


    return yearSalary= workHour*55;
    }


    public int totalEmploymentYear (){

        return employmentYear;
        }

     public double calculateBonus (int totalEmploymentYear, int totalWorkday){

        double calculatedBonus;

        if ( totalEmploymentYear >5 && totalWorkday>240){

            return calculatedBonus= yearlySalary()*15/100;

            }

        if (totalEmploymentYear <5 && totalWorkday>240){

            }

         return calculatedBonus= yearlySalary()*10/100;
     }
        public String getName (){
            return name;
        }

        public void setName(String name ) {
            this.name=name;
        }

        public int getEmploymentYear() {
            return employmentYear;
        }

        public void setEmploymentYear(int employmentYear) {
            this.employmentYear = employmentYear;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getWorkHour(){
            return workHour;
        }

        public void setWorkHour(int workHour){
            this.workHour=workHour;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }
    }
