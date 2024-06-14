package Projects;
import java.util.Scanner;
public class Harmonik {
    public static void main(String[] args) {
        int n;
        double sonuc = 0.0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (double i = 1; i <= n; i++){
            sonuc += (1/i);
        }
        System.out.println(sonuc);
    }
}
