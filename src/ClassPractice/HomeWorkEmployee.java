package ClassPractice;

public class HomeWorkEmployee {

    int employmentYear; // startDate 2015
    int workHour;
    // 52/2=26
    public double biweeklySalary(){
        return workHour*55;
        // 10*55=550
    }
    public double yearlySalary(){
        return biweeklySalary()*26;
    }
    public int totalEmploymentYear(){
        return 2019-employmentYear; // 4
    }
    public double bonusCalculater(int employmentYear, int workDay ){// 6  // 200
        employmentYear=totalEmploymentYear(); // 4
        if(employmentYear>5 && workDay>240){
            return yearlySalary()*0.15;
        }else if(employmentYear<5 && workDay>240){

            return yearlySalary()*0.10;
        }

        return 0.0;
    }


}
