package P01_pratikDers01;

import java.util.Scanner;

public class P5_hesapMakinesi {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int sayi1, sayi2, secim;
        System.out.println("Lutfen ilk sayiyi giriniz");
        sayi1= scan.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        sayi2= scan.nextInt();

        System.out.println("Lutfen yapmak istediğiniz islemi seciniz");
        System.out.println("1-Toplama \n2-Cıkarma \n3-Carpma \n4-Bolme");
        System.out.println("Seciminiz : ");
        secim= scan.nextInt();

        if (secim == 1){
            System.out.println("Toplama : "+ (sayi1 + sayi2));
        }else if (secim==2){
            System.out.println("Cıkarma :" + (sayi1 - sayi2));
        } else if (secim==3) {
            System.out.println("Carpma : "+ (sayi1 * sayi2));

        } else if (secim==4) {
            if (sayi2==0){
                System.out.println("İkinci sayi 0'a esittir ve sonuc belirsizdir");
            }else {
                System.out.println("Bolme : "+ (sayi1 / sayi2));
            }
        } else {
            System.out.println("Gecersiz bir sayi girdiniz, tekrar deneyiniz");
        }


    }
}
