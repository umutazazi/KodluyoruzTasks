
import java.util.Scanner;

public class HesapMakinesi {

    public void hesapMakinesi(){
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        String select;
        System.out.println("Lütfen ilk sayıyı giriniz : ");
        n1 = sc.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz : ");
        n2 = sc.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz :");
        select = sc.next();

        switch (select){
            case "1":
                System.out.println(n1+n2);
                break;
            case "2":
                System.out.println(n1-n2);
                break;
            case "3":{
                System.out.println(n1*n2);
                break;
            }
            case "4":
            {
                System.out.println(n1/n2);
                break;
            }

        }



    }
}
