import java.util.Scanner;

public class C04_ders {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir tamSayi giriniz");

        int tamSayi=scan.nextInt();

        System.out.println("Lutfen bir virgulluSayi giriniz");

        double virgulluSayi=scan.nextDouble();

        double sonuc=tamSayi * virgulluSayi;

        System.out.println( sonuc);
    }
}
