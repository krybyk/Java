package Projects;
import java.util.Scanner;
public class Amstrong {
    public static void main(String[] args) {
        int sayi,a,b=11,top = 0,carp = 1, sayac=1,yedek;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        sayi = input.nextInt();
        yedek = sayi;
        for ( int i = 1000000000; i >= 1; i = i/10){
            if(sayi % i == sayi && sayac ==1){
                b-=1;
            }
            else if(sayi % i != sayi){
                sayac = 0;
                for(int c =1 ; c<b;c++){
                    carp = carp * (sayi/i);
                }
                sayi = sayi % i;
                top = carp + top;
                carp = 1;
            }
        }
        if(top == yedek) System.out.println("Sayınız Armstrong sayısı:" + top);
        else System.out.println("Sayınız Armstrong sayısı değil:" + top);
    }
}
