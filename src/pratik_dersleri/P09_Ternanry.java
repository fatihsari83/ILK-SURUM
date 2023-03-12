package pratik_dersleri;

import java.util.Scanner;

public class P09_Ternanry {
    public static void main(String[] args) {

        // kullanicidan bir tam sayi alın
        // mutlak degerine cevirin ve yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi>=0){
            System.out.println(sayi);
        }else {
            sayi= sayi * (-1);
            System.out.println(sayi);
        }

        sayi= sayi>=0 ? sayi: sayi* (-1);
        System.out.println(sayi);

        // kullanicidan 2 sayi alin
        // buyuk olmayan sayıyı yazdırın

        System.out.println("Lutfen 2 tam sayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        if (sayi1 <sayi2){
            System.out.println(sayi1);
        }else{
            System.out.println(sayi2);
        }

        System.out.println(sayi1 <sayi2 ? sayi1 : sayi2);

    }
}
