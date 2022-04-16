import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double armut,elma,domates,muz,patlıcan,a,e,d,m,p;
        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patlıcan = 5.00;
        System.out.println("Armut kaç kilo ?");
        a = sc.nextDouble();
        System.out.println("Elma kaç kilo ?");
        e = sc.nextDouble();
        System.out.println("Domates kaç kilo ?");
        d = sc.nextDouble();
        System.out.println("Muz kaç kilo ?");
        m = sc.nextDouble();
        System.out.println("Patlıcan kaç kilo ?");
        p = sc.nextDouble();

        double toplam = ((a*armut)+(e*elma)+(d*domates)+(m*muz)+(p*patlıcan));
        System.out.println("Toplam Tutar :"+toplam);


    }
}
