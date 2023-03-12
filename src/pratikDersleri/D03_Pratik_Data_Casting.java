package pratikDersleri;

import java.util.Scanner;

public class D03_Pratik_Data_Casting {
    public static void main(String[] args) {

        /* 1-Int olarak verilen 3 sayının toplamını double olarak yazdırın
            ipucu: double>float>long>int>short>byte
        */
        /*
        2- Kullanıcdan bir harf girmesini isteyiniz. O harften sonra gelen harfleri
        Girdiğiniz harf :
        Girdiğiniz harften sonraki  3 harf :
        şeklinde yazdrın.
        ipucu: char
         */

        //2

        Scanner scan= new Scanner(System.in);
        /*
        System.out.println("Lutfen bir harf giriniz: ");
        char harf= scan.next().charAt(0);
        System.out.println("Girdiginiz harf : " + harf);
        System.out.println("Girdiginiz harften sonraki 3 harf : " +(char)(harf+1) +","+ (char)(harf+2)+","+ (char)(harf+3));
        */

        /*
         3- Kullanıcıdan iki double sayı alın ve
         ilk sayıyı ikinci sayıa bölün ve
            sonucu tam sayı yazdırın
            ipucu: sorumluluk bende
         */

        System.out.println("Lutfen 2 double sayı yaziniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        int toplam= (int)(sayi1/sayi2);
        System.out.println(toplam);


    }
}
