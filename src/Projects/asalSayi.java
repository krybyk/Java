package Projects;
public class asalSayi {
    public static void main(String[] args) {
        int a=0;
        for (int i = 2; i <100;i++) {
            for (int j = 2; j <i;j++) {
                if(i % j ==0){
                    a++;
                }
            }
            if(a==0) System.out.println(i);
            a=0;
        }

    }
}
