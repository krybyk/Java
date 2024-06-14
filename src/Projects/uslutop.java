package Projects;
import java.util.Scanner;
public class uslutop {
    public static void main(String[] args) {
        int a,b=1;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        for(int i = 1; i < a; i++) {
            b = b*2;
            System.out.println(b);
        }

    }
}
