package Projects;
import java.util.Scanner;
public class uslusayi {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = a;
        for ( int i = 1; i < b; i++) {
            c = c * a;
        }
        System.out.println(c);
    }

}
