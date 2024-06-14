package Projects;
import java.util.Scanner;
public class ebob_ekok {
    public static void main(String[] args) {
        int a,b,ebob=0,ekok;
        Scanner sc = new Scanner(System.in);
        System.out.println("İlk sayıyı girin");
        a = sc.nextInt();
        System.out.println("İkinci sayıyı girin");
        b = sc.nextInt();
        for(int i=2;i<=10;i++){
            if(a % i==0 && b % i==0){
                ebob = i;
            }
        }
        ekok = a*b/ebob;
        System.out.println("Ebob "+ebob+" ekok "+ekok);


    }
}
