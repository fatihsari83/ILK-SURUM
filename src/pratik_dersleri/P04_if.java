package pratik_dersleri;

import java.util.Scanner;

public class P04_if {
    public static void main(String[] args) {
        /*
        kullanicidan notunu alin,
        50 veya daha buyukse "Sinifi Gectin",
        50'Den kucukse "Maalesef kaldin" yazdirin.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        int not= scan.nextInt();

        if (not>=50){
            System.out.println("Sinifi Gectiniz");
        }

        if (not<50){
            System.out.println("Maalesef kaldiniz");
        }
    }
}
