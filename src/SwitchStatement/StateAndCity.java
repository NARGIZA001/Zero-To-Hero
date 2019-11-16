package SwitchStatement;

import java.util.Scanner;

public class StateAndCity {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the state Name (Florida or Illinois)");
        String stateName=input.nextLine();


        switch (stateName){

            default:
                System.out.println("selected state is not available");
                break;
            case "Illinois":
                System.out.println("Please enter the city Name (Chicago, Elgin or Des Plaines)");
                String cityName=input.nextLine();

                switch (cityName){

                    case "Chicago":
                        System.out.println("Selected state name "+stateName+" city name "+cityName);
                        break;
                    case "Elgin":
                        System.out.println("Selected state name "+stateName+" city name "+cityName);
                        break;
                    case "Des Plaines":
                        System.out.println("Selected state name "+stateName+" city name "+cityName);
                        break;
                    default:
                        System.out.println("selected city is not available");
                }

                break;

            case "Florida":
                System.out.println("Please enter the city name (Tampa, Miami or JacksonVille");
                String cityName2=input.nextLine();

                switch (cityName2){

                    case "Miami":
                        System.out.println("Selected state name "+stateName+" city name "+cityName2);
                        break;

                    case "Tampa":
                        System.out.println("Selected state name "+stateName+" city name "+cityName2);
                        break;
                    case "JacksonVille":
                        System.out.println("Selected state name "+stateName+" city name "+cityName2);
                        break;
                        default:
                            System.out.println("selected city is not available");

                }

        }




    }
}
