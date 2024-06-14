package Projects;
import java.util.Scanner;
public class palindrom {
    static boolean isPalindrome(int x) {
        int tersi=0,a;
        a = x;
        while(x>0) {
            tersi=tersi*10+x%10;
            x=x/10;
            System.out.println(tersi);
        }
        boolean b = tersi==a;
        return b;
    }
    public static void main(String[] args) {
        int n=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(isPalindrome(n)) System.out.println("Sayınız palindromdur.");
        else System.out.println("Sayınız palindrom değildir.");
        }

    }

