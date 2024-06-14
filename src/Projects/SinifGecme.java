package Projects;

import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {
        int mat, kimya, fizik, turkce, tarih, ortalama;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.println("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();
        System.out.println("Turkce notunuzu giriniz: ");
        turkce = input.nextInt();
        ortalama = (mat+kimya+fizik+tarih+turkce)/5;
        if(ortalama >=55) System.out.println("Ortalamanız:"+ortalama+"\nTebrikler! Geçtiniz.");
        else System.out.println("Ortalamanız:"+ortalama+"\nMaalesef kaldınız.");
    }
}
