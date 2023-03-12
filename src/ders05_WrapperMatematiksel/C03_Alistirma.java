package ders05_WrapperMatematiksel;

import java.util.Scanner;

public class C03_Alistirma {
    public static void main(String[] args) {

        // kullanicidan alinan 4 basamakli pozitif bir tamsayinin rakamlari toplamini bulun

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();

        ///  12345
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        birlerBasamagi=sayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        sayi=sayi/10;

        birlerBasamagi=sayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        sayi=sayi/10;

        birlerBasamagi=sayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        sayi=sayi/10;

        birlerBasamagi=sayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        sayi=sayi/10;

        birlerBasamagi=sayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        sayi=sayi/10;


        System.out.println("Rakamlar Toplami :" + rakamlarToplami);




    }
}
