package StringBuilderPractice;


public class HomeWorkPractice {
    public static void main(String[] args) {
        StringBuilder brand1=new StringBuilder("Louis Vouton");
        StringBuilder brand2=new StringBuilder("Hermes");
        StringBuilder brand3=new StringBuilder("Tory Burch");
        StringBuilder brand4=new StringBuilder("Lackloch");
        StringBuilder brand5=new StringBuilder("Valentino");

        StringBuilder [] brands={brand1,brand2,brand3,brand4,brand5};

        int [] estYear={1800,1900,1950,1920,1970};

        //StringBuilder established=new StringBuilder();


        for (int i=0;i<brands.length; i++){

              //  established = brands[i].append(" -since ").append(estYear[i]);

                System.out.println( brands[i].append(" -since ").append(estYear[i]));

            }

        }

    }

