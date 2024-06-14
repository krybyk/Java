public class denemeOzyineleme {
    static int basamaklarToplami(int sayi) {
        System.out.println(sayi);
        if (sayi == 0) {
            return 0;
        } else
            return sayi % 10 + basamaklarToplami(sayi / 10);
    }
    public static void main(String[] args) {
        System.out.println(basamaklarToplami(1245));
        System.out.println(1/10);

    }
}
