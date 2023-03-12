package ders05_WrapperMatematiksel;

import java.util.Scanner;

public class C02_RakamlarToplami {
    public static void main(String[] args) {
        // kullanicidan alinan 3 basamakli bir pozitif
        // bir tamsayinin rakamlar toplamini bulun
        System.out.println(123 % 10); //3
        System.out.println( 123 / 10 ); // 12.3
        // once int toplam oluştur
        // sonra int birler Bas bul
        // 123%10= 3  // 123/10= 12
        // 12%10= 2   // 12/10= 1
        // 1%10= 1

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();

        int birlerBas=0;
        int rakamlarToplami=0;


        // 3 basamak icin ayni ıslemi 3 kere yapmamız gerekir
        // girilen sayinin birler basamgı 3 ıcın
        birlerBas=sayi%10; //3
        rakamlarToplami=rakamlarToplami+birlerBas; // 3
        sayi=sayi/10; // 12

        // girilen sayinin onlar basamgı 2 ıcın
        birlerBas=sayi%10; // 12 %10:2
        rakamlarToplami=rakamlarToplami+birlerBas; // 3+2:5
        sayi=sayi/10; // 12/10:1.2:1

        // girilen sayinin yuzler basamgı 1 ıcın
        birlerBas=sayi%10; // 1 %10=1
        rakamlarToplami=rakamlarToplami+birlerBas; // 5+1=6
        sayi=sayi/10; // 1/10=0.1=0

        System.out.println("Sayinin rakamlar toplami : " + rakamlarToplami);

    }
}
