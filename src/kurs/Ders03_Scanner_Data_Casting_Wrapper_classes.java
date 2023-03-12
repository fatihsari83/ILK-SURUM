package kurs;

import java.util.Scanner;
import java.util.StringJoiner;

public class Ders03_Scanner_Data_Casting_Wrapper_classes {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen adınızı giriniz");

        String isim= scan.nextLine();

        System.out.println("Lütfen soyadınızı yazın");

        String soyisim= scan.nextLine();

        System.out.println("Lütfen yasınızı giriniz");

        double yas= scan.nextDouble();

        System.out.println("Isminiz : " + isim);
        System.out.println("Soyisim : " + soyisim);
        System.out.println("Yasınız :" + yas);
        System.out.println("Kaydiniz basariyle alinmistir");

    }
}
