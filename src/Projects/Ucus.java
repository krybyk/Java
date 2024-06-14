package Projects;

import java.util.Scanner;
public class Ucus {
    public static void main(String[] args) {
        int mesafe, yas, tip;
        double fiyat;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafe yazınız: ");
        mesafe = input.nextInt();
        System.out.println("Sadece gidiş ise 1'i, gidiş-dönüş ise 2'yi tuşlayın");
        tip =input.nextInt();
        System.out.println("Yaşınızı giriniz.");
        yas = input.nextInt();
        switch (tip) {
            case 1:
                fiyat = mesafe * 0.1;
                if(yas<12) fiyat = fiyat * 0.5;
                else if(yas>12 && yas<24) fiyat = fiyat * 0.9;
                else if(yas>65) fiyat = fiyat * 0.7;
                System.out.println("Yolculuk ücreti: "+fiyat);
                break;
            case 2:
                fiyat = mesafe * 0.1;
                if(yas < 12) fiyat = fiyat * 0.5;
                else if(yas>12 && yas<24) fiyat = fiyat * 0.1;
                else if(yas>65) fiyat = fiyat * 0.3;
                fiyat *= 2;
                System.out.println("Yolculuk ücreti: "+fiyat);
                break;

        }
    }
}
