package Projects;
import java.util.Scanner;
public class Amstrogns {
    public static void main(String[] args) {
        int sayi,a,b=11,top = 0,carp = 1;
        Scanner input = new Scanner(System.in);
        sayi = input.nextInt();
        for ( int i = 1000000000; i != 1; i = i/10){
            b-=1;
            if(sayi % i != sayi){
                for(int c =1 ; c<=b;c++){
                    System.out.println(b);
                    carp = (sayi % i)*carp;
                    System.out.println(carp);
                }
                top = carp + top;
                carp = 1;
            }
        }
        System.out.println(top);
    }
}