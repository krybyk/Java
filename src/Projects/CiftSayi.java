package Projects;
import java.util.Scanner;
public class CiftSayi {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        for(int i=2;i<=a;i+=2){
            System.out.println(i);
        }
    }
}
