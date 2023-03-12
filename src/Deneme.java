import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        // isim soyisim ve yaş yazdır sonra isim soyisim baş harfi ve yas yazdır//

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.nextLine();

        System.out.println("Lutfen soyismini giriniz");
        String soyisim= scan.nextLine();

        System.out.println("Lutfen yasınızı giriniz");
        int yas= scan.nextInt();

        System.out.println("Girilen bilgiler:" + isim + " "
                            +soyisim.charAt(0) +"," +  yas);
    }
}
