package pratik_dersleri;

import java.util.Scanner;

public class P02_else {
    public static void main(String[] args) {

        /*
        kullanicidan bir ucgenin 3 kenar uzunlugunu alın,
        ucgen eskenar ise "Eskenar ucgen" yazdirin,
        degilse "Eskener degil" yazdırın
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen ucgenin 3 kenar uzunlugunu giriniz");

        int a= scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();

        if (a==b && a==c && b==c){
            System.out.println("Eskenar ucgen");
        }
        else {
            System.out.println("Eskenar degil");
        }
    }
}
