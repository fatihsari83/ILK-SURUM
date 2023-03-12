package ders11_Wisequarter;

public class C04_Replaceall {
    public static void main(String[] args) {

        String str = "J1a23va34 5C54and65ir87";

        // str daki sayilari metodla temizleyin
        // eger degistirmek istedigimiz metin tek bir metin degil
        // ortak ozelligi olan farklı metinlerse
        //  - tum sayilar
        //  - sayi olmayanlarin tumu
        //  - tum spaceler
        //  -

        str= str.replaceAll("\\d", "");
        System.out.println("str in yeni hali :" + str);
    }
}
