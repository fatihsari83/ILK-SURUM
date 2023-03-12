package ders04_dataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {

        int a=134;
        double b=23.4;
        short c=34;
        byte d= 14;

        double e= a;
        int f=c; //degerin data turu shortvariablenin data turunden daha kucuk

        short g=d; //auto widening

        short h= (short)b;
        System.out.println("double 23,4'un short karsılıgı : " + h);

        byte l=(byte)a;

        int m=(int)b;


    }

}
