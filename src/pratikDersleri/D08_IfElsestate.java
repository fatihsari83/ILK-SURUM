package pratikDersleri;

import java.util.Scanner;

public class D08_IfElsestate {
    public static void main(String[] args) {

        /*
        3-Kullanicidan cinsiyetini ve yasini alin,
         Kadin, 60 yas ve uzeri , Erkek 65
        yas ve uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak
        "Emekli olabilirsin" veya
        "Emekli olmak icin .. Yil daha
        calisman gerekir" yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen önce yaşınızı sonra cinsiyetinizi E ya da K şeklinde giriniz: ");
        int yas=scan.nextInt();
        char cinsiyet=scan.next().charAt(0);
        if ((cinsiyet=='K'|| cinsiyet=='k')&& yas>=60){
            System.out.println("Emekli olabilirsiniz.");
        }
        if ((cinsiyet=='K'|| cinsiyet=='k') && yas<60){
            System.out.println("Emekli olmak için "+(60-yas)+" yıl daha çalışmalısınız.");
        }
        if ((cinsiyet=='E'|| cinsiyet=='e')&& yas>=65){
            System.out.println("Emekli olabilirsiniz");
        }
        if ((cinsiyet=='E'||cinsiyet=='e')&& yas<65){
            System.out.println("Emekli olmak için "+ (65-yas)+" yıl daha çalışmanız gerekiyor");
        }
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen önce yaşınızı sonra cinsiyetinizi E ya da K şeklinde giriniz: ");
        int yas= scan.nextInt();
        char cinsiyet= scan.nextLine().charAt(0);
        if ((cinsiyet=='K' || cinsiyet=='k')&& yas>=60){
            System.out.println("Emekli Olabilirsiniz.");
        }
        if ((cinsiyet=='K' || cinsiyet=='k') && yas<60){
            System.out.println("Emekli olmak icin "+ (60-yas)+" yil daha calismalisiniz.");
        }
        if ((cinsiyet=='E' || cinsiyet=='e')&& yas>=65){
            System.out.println("Emekli Olabilirsiniz");
        }
        if ((cinsiyet=='E' || cinsiyet=='e')&& yas <65){
            System.out.println("Emekli olmak icin "+ (65-yas)+" yil daha calismalisiniz");
        }
    }
}
