package Projects;

import java.util.Scanner;
public class Burc {
    public static void main(String[] args) {
        int ay, gün, top;
        String sonucS;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen önce doğum ayınızı, sonra gününüzü girin");
        ay = sc.nextInt();
        gün = sc.nextInt();
        sonucS = String.valueOf(ay)+ String.valueOf(gün);
        top = Integer.parseInt(sonucS);
        if(top<=121) System.out.println("Oğlak burcusunuz.");
        else if(top>121 && top<219) System.out.println("Burcunuz Kova");
        else if(top>219 && top<319) System.out.println("Burcunuz Balık");
        else if(top>320 && top<420) System.out.println("Burcunuz Koç");
        else if(top>420 && top<522) System.out.println("Burcunuz Boğa");
        else if(top > 521 && top < 623) System.out.println("Burcunuz Yengeç");
    }
}
