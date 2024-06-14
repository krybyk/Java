package Projects;
import java.util.Scanner;
public class kullanicigiris {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen kullanıcı adınızı ve şifrenizi giriniz.");
        String kullaniciAdi = sc.next();
        int kullanicisifre = sc.nextInt(),sec,sec2,havale,yenisifre;
        switch (kullaniciAdi) {
            case "Koray":
                if (kullanicisifre == 1204) for( int i = 1; i <= 4; i++ ) {
                    System.out.println("Hesap bilgileriniz için:1\nHavale yapmek için:2\nŞifre değiştirmek için:3");
                    sec = sc.nextInt();
                    if (sec == 1) {
                        System.out.println("Hesabınızda 1 milyon tl bulunmaktadır");
                        System.out.println("Başka bir işlem yapmak istemiyorsanız 2'yi tıklayın");
                        sec2 = sc.nextInt();
                        if (sec2 == 2) break;
                    }
                    else if(sec == 2) {
                            System.out.println("Havale yapmak istediğiniz miktarı yazınız");
                            havale = sc.nextInt();
                            System.out.println(havale + " miktarı diğer hesabınıza aktarılmıştır");
                            System.out.println("Başka bir işlem yapmak istemiyorsanız 2'yi tıklayın");
                            sec2 = sc.nextInt();
                            if (sec2 == 2) break;
                        }
                    else if(sec == 3) {
                            System.out.println("Lütfen yeni şifrenizi yazınız");
                            yenisifre = sc.nextInt();
                            System.out.println("Şifreniz başarıyla güncellenmiştir");
                            System.out.println("Başka bir işlem yapmak istemiyorsanız 2'yi tıklayın");
                            sec2 = sc.nextInt();
                            if (sec2 == 2) break;
                        }
                    break;


                            }


                    }
                }
        }




