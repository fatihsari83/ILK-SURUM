package ders11_Wisequarter;

public class C03_Replace {
    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.replace('J', 'H')); // Hava candir
        System.out.println(str.replace("a", "")); // Jv Cndir

        System.out.println(str.replace("Java", "X")); //X Candir
        System.out.println(str.replace("v", "yayaya"));

        // str daki spaceleri yok edin
        str= str.replace(" ", "");
        System.out.println(str); // JavaCandir
    }
}
