package ders05_WrapperMatematiksel;

public class C01_Wrapper {
    public static void main(String[] args) {

        String str= "Java";

        System.out.println(str.toUpperCase());

        int sayiP=20;

        //primitive data turlerinin hazir metodlari yoktur, sadece deger icerirler
        // wrapper calsslar primitive data turleri ile aynı degerleri barındırırken
        // degerlerin yanında hazir methotlar da kullanmiza imkan veren classlardir.

        Integer sayiW=30;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        char karekP='a';
        Character karekW='b';
        System.out.println(Character.isDigit(karekP));

        String str2="1234";
        String str3="1000";

        System.out.println(str2+str3);


    }
}
