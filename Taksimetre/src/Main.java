import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double perKm = 2.20;
        double startPrice = 10;
        double total;
        int km;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your trip by km :");
        km = sc.nextInt();
        total = (perKm*km);
        total +=startPrice;

        total = (total< 20) ? 20 : total;

        System.out.println("Total price is : "+total);







    }
}
