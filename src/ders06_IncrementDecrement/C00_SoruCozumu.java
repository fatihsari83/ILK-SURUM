package ders06_IncrementDecrement;

public class C00_SoruCozumu {
    public static void main(String[] args) {

        int a= 10;
        System.out.println("a'nin degeri :" + ++a);//11
        // once artır sonra yazdır a:11

        int b= a++; // b:11
        System.out.println("b'nin degeri :" + b); //43
        // artırma sonra b:11

        int c= b++ + a; // c:23
        System.out.println("c'nin degeri : " + c); //
        // islem once artırma sonra c= b+a  11+12=23

        System.out.println("Son toplam : " +(a+b+c));//47
    }
}
