import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        avgCalculator();

    }
    public static void avgCalculator(){
        Scanner scanner = new Scanner(System.in);
        int math,phy, chem,  tur,  his, music;

        System.out.println("Please Enter Math Grade: ");
        math= scanner.nextInt();
        System.out.println("Please Enter Physics Grade: ");
        phy= scanner.nextInt();
        System.out.println("Please Enter Chemistry Grade: ");
        chem= scanner.nextInt();
        System.out.println("Please Enter Turkish Grade: ");
        tur= scanner.nextInt();
        System.out.println("Please Enter History Grade: ");
        his= scanner.nextInt();
        System.out.println("Please Enter Music Grade: ");
        music= scanner.nextInt();

        int avg = ((math+phy+chem+tur+his+music)/6);

        boolean pass = avg > 60;

        System.out.println((pass) ? "Passed": "Failed");




    }
}
