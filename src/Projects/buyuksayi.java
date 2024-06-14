package Projects;
import java.util.Scanner;
public class buyuksayi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç sayı gireceğinizi yazınız");
        int n = sc.nextInt(),k=10000000,b=0,a;
        for(int i= 1; i<=n; i++) {
            a = sc.nextInt();
            if(a>b){
                b=a;
            }
            if(i==1) k=a;
            if(a<k)k=a;

        }
        System.out.println("En büyük sayı: "+b+"\nEn küçük sayı: "+k);
    }
}
