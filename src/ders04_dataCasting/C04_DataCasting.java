package ders04_dataCasting;

import java.util.Scanner;

public class C04_DataCasting {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bolunecek tamsayiyi girin");
        int a= scan.nextInt();

        System.out.println("Lutfen bolecek tamsayiyi girin");
        int b= scan.nextInt();

        System.out.println("a/b nin degeri : "+a/b);

        double sonuc= a/b;
        System.out.println("bolumu double'a atama yaparsak : " + sonuc);

        double dogruSonuc= (double)a/b ;
        System.out.println("dogru sonuc ıcı bır sayıyı double' acatr yapinca : " + dogruSonuc);
    }
}
