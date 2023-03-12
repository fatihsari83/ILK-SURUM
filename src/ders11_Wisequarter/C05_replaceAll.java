package ders11_Wisequarter;

public class C05_replaceAll {
    public static void main(String[] args) {

        String str = "J&ava54 c+an01dir,,,";

        // str i Java Candir haline getirin.

        str= str.replaceAll("\\d","");
        str= str.replaceAll(" ", "5");
        str= str.replaceAll("\\W","");
        str= str.replaceAll("5"," ");

        System.out.println(str);
    }
}
