import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        hesapla();
    }

    static public void hesapla() {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci Kenar:");
        a = scanner.nextInt();
        System.out.println("İkinci Kenar:");
        b = scanner.nextInt();
        System.out.println("Üçüncü Kenar:");
        c = scanner.nextInt();
        int u = (a+b+c)/2;
        int alan = (int) Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println(alan);


    }


}
