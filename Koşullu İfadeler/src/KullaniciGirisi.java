import java.util.Scanner;

public class KullaniciGirisi {

    public void kullniciGirisi(){
        Scanner sc = new Scanner(System.in);
        String username,password,answer,newPass;

        System.out.println("Kullanıcı adınız :");
        username = sc.next();
        System.out.println("Şifreniz :");
        password = sc.next();

        if(username.equals("patika") && password.equals("java123"))
        {
            System.out.println("Giriş Yaptınız!");
        }
        else
            {
                System.out.println("Şifreniz yanlış !");
                System.out.println("Şifrenizi yenilemek ister misiniz? Cevap için : evet ");
                answer = sc.next();
                if(answer.equals("evet"))
                {
                    System.out.println("Yeni şifreyi giriniz:");
                    newPass =sc.next();
                    if(!newPass.equals("java123") && !newPass.equals(password)){
                        System.out.println("Şifre oluşturuldu!");

                    }
                    else{
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }


                }
                else{
                    System.out.println("Kapatıldı..");
                }

            }

    }






}
