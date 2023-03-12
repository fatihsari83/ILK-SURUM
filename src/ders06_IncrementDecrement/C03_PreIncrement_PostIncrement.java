package ders06_IncrementDecrement;

public class C03_PreIncrement_PostIncrement {
    public static void main(String[] args) {
        int sayi= 10;

        sayi++;
        System.out.println(sayi);//11

        sayi++;
        System.out.println(sayi);//11

        System.out.println(sayi++);// bu satırda Java once sayinin eski degerini
                                   // yazdıracak 12 sonra sayiyi 1 artiracak sayi=11
        System.out.println(sayi); // 13 post ıncrement

        System.out.println(++sayi); //bu satırsa Java once sayıyı
                                    // 1 artıracak sayi=14
                                    //
        System.out.println(sayi); // 14 pro ıncrement

    }
}
