package ders06_IncrementDecrement;

public class C02_PreIncremen_PostIncrement {
    public static void main(String[] args) {
        int sayi= 10;
        // sayi degerini oluşturacagımız b variable'ına atayalım
        // ve sonra sayi degerini 1 artıralım

        int b = sayi;
        sayi++;
        System.out.println(b); // 10
        System.out.println(sayi); // 11

        // bunu tek satırda yapabilir miyiz?
        // sayi degerini oluşturacagımız c variable'ına atayalım
        // ve sonra sayi degerini 1 artıralım

        sayi=11;
        int c = sayi++; //bu satırda 2 islem var
        // once artırma yapılsın ++ sayi
        // artırma sonra yapılsın istiyorsanız sayi++ yapink
        System.out.println(c); // 11
        System.out.println(sayi); // 12

        sayi=11;
        c= ++sayi;
        System.out.println(c); // 12
        System.out.println(sayi); // 12
    }
}
