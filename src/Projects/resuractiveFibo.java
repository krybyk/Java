package Projects;
import java.util.Scanner;

public class resuractiveFibo {
    static int fibo(int x,int y){
        int b =x;
        int a=y;
        int c=a+b;
        System.out.println(c);
        if(c>150){
            return 0;
        }
        return fibo(a,c);
    }
    public static void main(String[] args) {
        fibo(0,1);

    }
}
