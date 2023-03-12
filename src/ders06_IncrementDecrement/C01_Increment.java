package ders06_IncrementDecrement;

public class C01_Increment {
    public static void main(String[] args) {
        int sayi = 10;

        System.out.println(sayi = sayi+3);
        System.out.println(sayi); // 13

        System.out.println(sayi-=5); // 8

        System.out.println(sayi++); //8

        System.out.println(sayi); //9

        // once level'i atla sonra level degerini artır
        // once level degerini artır, sonra level atla
    }
}
