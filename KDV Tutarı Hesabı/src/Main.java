import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        taxCalculator();

    }

    static public void taxCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter amount : ");
        int price = scanner.nextInt();

        boolean tax1 = (price > 0 && price < 1000);
        double tax1Price = (0.18 * price);
        double tax2Price = (0.8 * price);
        System.out.println(tax1 ? tax1Price:tax2Price);

    }
}
