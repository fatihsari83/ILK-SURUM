package pratikDersleri;

import java.util.Scanner;

public class D05_IfElse {
    public static void main(String[] args) {

        /*
        1- Öğrenci notunu harf notuna dönüştüren bir kod yazınız
             85-100 -----> AA
            80-85 ------> BA
            75-80 ------> BB
            65-75 ------> CB
            50-65 ------> CC
            50 Altı ise  ------> FF
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        int not= scan.nextInt();

        if (not>=85 && not<100){
            System.out.println("Sınav notunuz: "+not + " Harf notunuz: AA");
        } else if (not>=80 && not <85) {
            System.out.println("Sinav notunuz: "+not + " Harf notunuz BA");

        } else if (not>=75 && not <80) {
            System.out.println("Sinav notunuz: "+not + " Harf notunuz BB");
        } else if (not>=65 && not <75) {
            System.out.println("Sinav notunuz: "+not + " Harf notunuz CB");
        } else if (not>=50 && not <65) {
            System.out.println("Sinav notunuz: "+not + " Harf notunuz CC");

        }else {
            System.out.println("Sinav notunuz: " + not+ " Harf Notunuz FF");
        }
    }
}
