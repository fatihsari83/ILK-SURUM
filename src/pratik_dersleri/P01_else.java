package pratik_dersleri;

import java.util.Scanner;

public class P01_else {
    public static void main(String[] args) {

        /*
        kullanicidan sigorta giriş yılını isteyin,
        1999 ve asagısı ise "EYT lisin" yazdırın,
        yoksa "EYT li degilsin" yazdırın.
          */
            Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen sigorta giris tarihini giriniz");
            int yil= scan.nextInt();

            if (yil<=1999) {
                System.out.println("EYT lisin");
            }
            else {
                System.out.println("EYT li degilsin");
            }
        }

    }

