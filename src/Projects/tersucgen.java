package Projects;
import java.util.Scanner;
public class tersucgen {
    public static void main(String[] args) {
        int h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Satır sayısını girin");
        h = sc.nextInt();
        for (int i = h; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
