package Projects;

import java.util.Scanner;
public class Project{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        String c;
        System.out.print("Lütfen a ve b sayılarını girin: ");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Lütfen yapmak istediğiniz işlemi yazın.");
        c = input.next();
        switch (c) {
            case "toplama":
                System.out.println(a + b);
                break;
            case "çıkartma":
                System.out.println(a - b);
                break;
            case "bölme":
                if(b==0) {
                    System.out.println("Bir sayı 0'a bölünemez");
                    break;
                }
                System.out.println(a / b);
                break;
            case "çarpma":
                System.out.println(a * b);
                break;
            default:
                System.out.println("Yanlış yazdınız.");
        }

    }
}

