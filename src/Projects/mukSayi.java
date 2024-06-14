package Projects;
import java.util.Scanner;
public class mukSayi {
    public static void main(String[] args) {
        int a,sonuc=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen sayınızı giriniz");
        a = sc.nextInt();
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sonuc += i;
            }
        }
        if(sonuc==a) System.out.println("Sayınız mükemmel sayıdır.");
        else System.out.println("Sayınız mükemmel sayı değildir.");
    }
}
