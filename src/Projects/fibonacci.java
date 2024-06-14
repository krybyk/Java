package Projects;

public class fibonacci {
    public static void main(String[] args) {
        int a=0,b=1,sonuc=0;
        System.out.println(0+"\n"+1);
        for(int i=1;i<=15;i++){
            sonuc=a+b;
            a=b;
            b=sonuc;
            System.out.println(sonuc);
        }
    }
}
