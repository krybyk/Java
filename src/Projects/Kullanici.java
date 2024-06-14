package Projects;

import java.util.Scanner;
public class Kullanici {
    public static void main(String[] args) {
        int kullaniciS,secim,yeniSifre, sifre = 120499;
        String kullanici, isim = "Koray";
        Scanner input = new Scanner(System.in);
        kullanici = input.nextLine();
        kullaniciS = input.nextInt();
        if(kullanici.equals(isim) && kullaniciS == sifre) {
            System.out.println("Giriş başarılı.");
        }
        else{
            System.out.println("Yanlış giriş yaptınız.");
            System.out.println("Şifrenizi değiştirmek isterseniz 1'e basın.");
            secim = input.nextInt();
            switch (secim){
                case 1:
                    yeniSifre = input.nextInt();
                    if(yeniSifre == sifre) System.out.println("Şifreniz eski şifrenizle aynı olamaz.");
                    System.out.println("Giriş başarılı.");
                    break;
                default:
                    System.out.println("Daha sonra tekrar deneyiniz.");
            }

        }

    }
}
