package pratik_dersleri;

import java.util.Scanner;

public class P05_ifelse {
    public static void main(String[] args) {
        /*
        Kullanicidan bir karakter girmesini isteyin,
        girilen karakterin buyuk harf olup olmadigini yazdirin.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char harf= scan.next().charAt(0);

        if ('A' <= harf && harf  <= 'Z'){
            System.out.println("Girilen harf buyuktur");
        }
        else {
            System.out.println("Girilen harf kucuktur");
        }
    }
}
