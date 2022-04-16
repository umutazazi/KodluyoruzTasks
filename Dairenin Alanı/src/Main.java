import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r,a,p;
        System.out.println("Lütfen yarı çap giriniz: ");
        r = sc.nextDouble();
        System.out.println("Lütfen merkez açısı ölçüsünü giriniz: ");
        a = sc.nextDouble();
        p = Math.PI;
        double daireAlanı = (p*(r*r)*a)/(360);
        System.out.println("Alan : "+daireAlanı);
    }
}
