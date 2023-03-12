package kurs;

import java.util.Scanner;

public class Ders10_3endsWith {
    public static void main(String[] args) {

        // soru: kullanicidan bir mail alın
        //  - mail @ icermiyorsa “gecersiz mail”
        //  - mail @gmail.com icermiyorsa, “mail gmail olmali”
        //  - mail @gmail.com ile bitmiyorsa, “mailde yazim hatasi var”
        // yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen e-mail adreinizi giriniz");
        String email= scan.nextLine();

        if (!email.contains("@")){
            System.out.println("gecersiz mail");
        } else if (!email.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");

        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("mailde yazım hatası var");

        }
    }
}
