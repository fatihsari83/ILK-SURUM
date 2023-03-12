package pratik_dersleri;

import java.util.Scanner;

public class P03_if {
    public static void main(String[] args) {

        /*
        kullanicidan bir sayi alin,
        sayi 4 ile bolunebiliyorsa "Dort ile bolunebılen sayi"
        6 ile bolunebılıyorsa "Altı ile bolunebılen sayi" yazdirin
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");

        int sayi= scan.nextInt();

        if (sayi%4==0 ){
            System.out.println("Dort ile bolunebılen sayi");


        }
        if (sayi%6==0){
            System.out.println("Alti ile bolunebilen sayi");
        }

    }
}
