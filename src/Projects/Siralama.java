package Projects;

import java.util.Scanner;
public class Siralama {
    public static void main(String[] args) {
        int a,b,c,kucuk;
        Scanner input = new Scanner(System.in);
        System.out.print("3 adet sayı giriniz. ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if(a<b && a<c) System.out.println("En küçük sayı: "+ a);
        else if (b<a && b<c) System.out.println("En küçük sayı: "+b);
        else if(c<a && c<b) System.out.println("En küçük sayı: "+c);
    }
}
