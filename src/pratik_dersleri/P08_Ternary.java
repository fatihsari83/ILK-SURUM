package pratik_dersleri;

import java.util.Scanner;

public class P08_Ternary {
    public static void main(String[] args) {

        // kullanicidan pozitif bir tam bir sayi alın
        // sayi cift ise "sayi cift"
        /// degilse "tek sayi" yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi= scan.nextInt();

        //if (sayi%2==0){
        //    System.out.println("Sayi cift");
        //}else {
        //    System.out.println("Tek sayi");
        System.out.println(sayi%2==0 ? "Cift sayi" : "Tek sayi");
    }
}
