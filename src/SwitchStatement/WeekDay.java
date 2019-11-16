package SwitchStatement;

import java.util.Scanner;

public class WeekDay {


    public static void main(String[] args) {


        // 1 - 5  -- Weekdays
        // 6 - 7  -- Weekends

      int number=6;

      switch (number){
          case 1: case 2: case 3: case 4: case 5:
              System.out.println("Weekdays");
              break;
          case 6: case 7:
              System.out.println("Weekends");
              break;
      }





    }




}
