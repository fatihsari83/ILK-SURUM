package P01_pratikDers01;

import java.util.Scanner;

public class P4_Scanner {
    public static void main(String[] args) {
        // kullanicidan as/soyad/yaş/mail adresi/şifre bilgilerini
        // sisteme kaydedildiğini aşağıdaki formatta yazdır.
        /*
        **********       KAYIT BAŞARILI      *********
        *
        * Adınız: Fatih
          Soyadınız: Sari
          Yaşınız: 40
          Mail adresi: fsari1408@gmail.com
          şifre: 123456
         */
        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen adinizi giriniz:");
        String name= scan.next();
        System.out.println("Lutfen soyadinizi giriniz: ");
        String surname=scan.next();
        System.out.println("Lutfen yasizi giriniz: ");
        int yas= scan.nextInt();
        System.out.println("Lutfen mail adresiniz giriniz= ");
        String mail= scan.next();
        System.out.println("Lutfen sifrenizi giriniz= ");
        String pass= scan.next();

        System.out.println("**********       KAYIT BAŞARILI      *********\n");
    }
}
