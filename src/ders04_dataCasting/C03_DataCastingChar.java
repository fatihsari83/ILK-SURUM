package ders04_dataCasting;

import java.util.Scanner;

public class C03_DataCastingChar {
    public static void main(String[] args) {

        int a= 'a'+ 'b';
        System.out.println(a);

        System.out.println('a'+ 'b');

        System.out.println(""+'a'+'b');

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenKarakter=scan.next().charAt(0);

        System.out.println("Girilen karakter : " + girilenKarakter);

        System.out.println("girilen karakterin bir sonrasi : " + (girilenKarakter+1));
        System.out.println("girilen karakterin iki sonrasi : " + (girilenKarakter+2));
        System.out.println("girilen karakterin uc sonrasi : " + (girilenKarakter+3));
    }
}
