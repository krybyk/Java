package Projects;
import java.util.Scanner;
public class ucgen {
    public static void main(String[] args) {
        int a,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen yıldızınızın uzunluğunu giriniz");
        n = sc.nextInt();
        a = n;
        for (int i = 1; i <=n*2; i+=2){
            for (int j = 1; j <=a; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++){
                System.out.print("*");
            }
            a--;
            System.out.print("\n");
        }
    }
}
