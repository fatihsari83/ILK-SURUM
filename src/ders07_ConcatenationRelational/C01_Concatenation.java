package ders07_ConcatenationRelational;

public class C01_Concatenation {
    public static void main(String[] args) {
        /*String a= "Merhaba";
        String b= "Java";

        System.out.println(a+b);
        System.out.println(a+" "+b);*/

        // Bugun gunes saat 8 de dogar aksam 6 da batar
        /*int a=8;
        int b=6;

        System.out.println("Bugun gunes saat " + a + " "+ "de dogar aksam " + b + " "+ "da batar");*/
        // soru a-Merhaba JavaÖğreniyorum 24  b-MerhabaJava Öğreniyorum24 c-MerhabaJavaÖğreniyorum 24
        // d- MerhabaJavaÖğreniyorum 8 e- Merhaba 6 Java Öğreniyorum 8

        /*String a= "Merhaba";
        String b= "Java";
        String c= "Öğreniyorum";
        int d=2;
        int e=4;

        System.out.println(a+" "+ b + c + " " +d+e);
        System.out.println(a + b + " " + c + d + e);
        System.out.println(a + b + c + " " + d + e);
        System.out.println(a+b+c+ " " + (d*e));
        System.out.println(a + " " + (d+e) + " " + b + " " + c + " " + (d*e));*/

        /* a- Mevsim Sonbahar 67
           b- Mevsim 67 Sonbahar 13
           c- 42 MevsimSonbahar 67
           d- Sonbahar 67Mevsim 42 */

        String a= "Mevsim";
        String b= "Sonbahar";
        String c= " ";
        int d=6;
        int e=7;

        System.out.println(a + c + b + c + d + e);
        System.out.println(a + c + d + e + c + b + c + (d+e));
        System.out.println((d*e) + c + a + b + c + d+e);
        System.out.println(b + c + d+e + a + c + (d*e));


    }
}
