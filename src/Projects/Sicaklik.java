package Projects;

import java.util.Scanner;
public class Sicaklik {
    public static void main(String[] args) {
        int sicaklik;
        String a="Kayak",b="Sinema",c="Piknik",d="Yüzme";
        Scanner input = new Scanner(System.in);
        sicaklik=input.nextInt();
        if(sicaklik<5) System.out.println(a+" etkiniliğini öneririz.");
        else if(5 < sicaklik && sicaklik < 15) System.out.println(b+" etkinliğini öneririz.");
        else if(15 < sicaklik && sicaklik < 25) System.out.println(c+" etkinliğini öneririz.");
        else System.out.println(d+" etkinliğini öneririz.");
    }
}
