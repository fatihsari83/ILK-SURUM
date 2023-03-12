package pratikDersleri;

import java.util.Scanner;

public class D10_If_Else {
    public static void main(String[] args) {
        /* 1-   km basina 0.80 TL
           2-   7 yasına kadar %30 indirim
           3-   7-18 yasina kadar %20 indirim
           4-   65 yas uzeri ise %60 indirim
           5-   Gidis-Donus bilet ise %10 indirim
           bu kosullara gore bilet fiyatini hesapla
         */

        Scanner scan= new Scanner(System.in);
        int km, yas, tip;
        System.out.println("Lutfen yol mesafesini 'KM' cinsinden giriniz :");
        km= scan.nextInt();
        System.out.println("Lutfen yasinizi giriniz :");
        yas= scan.nextInt();
        System.out.println("Lutfen yolculuk tipini seciniz (Tek gidis=1 , Gidis/Donus=2) :");
        tip= scan.nextInt();

        double yasindirim, normalFiyat, tipindirimi;

        if (km >0 && yas>0 && (tip==1 || tip==2)){
            normalFiyat= km * 0.80;
            if (yas <=7){
                yasindirim= normalFiyat * 0.30;
                normalFiyat=normalFiyat - yasindirim;
                
            } else if (yas>=8 && yas <=18) {
                yasindirim= normalFiyat * 0.20;
                normalFiyat=normalFiyat - yasindirim;
            } else if (yas>=65) {
                yasindirim= normalFiyat * 0.60;
                normalFiyat=normalFiyat - yasindirim;
            } else {
                yasindirim =0;
            }
            
            if (tip==2){
                tipindirimi=normalFiyat * 0.10;
                normalFiyat = (normalFiyat - tipindirimi) *2;
            }

            System.out.println("Bilet tutari : " + normalFiyat + "TL'dir.");
        }else {
            System.out.println("Girdiginiz bilgiler eksik veya yanlıs. Tekrar deneyiniz :");
        }



    }
}
