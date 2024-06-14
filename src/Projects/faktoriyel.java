package Projects;
import java.util.Scanner;
public class faktoriyel {
    public static void main(String[] args) {
        int a,b=1;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            b = b*i;
        }
        System.out.println(b);
    }
}
