package Projects;
import java.util.Scanner;
public class sayitop {
    public static void main(String[] args) {
        int a,i, b=0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a>=0) {
            for (i = 1; i <= a; i += 2) {
                b = b + i;
                System.out.println(i);
            }
        }
        System.out.println(b);
    }
}
