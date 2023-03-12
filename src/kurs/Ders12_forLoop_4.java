package kurs;

public class Ders12_forLoop_4 {
    public static void main(String[] args) {

        // Soru 6- Kullanicidan 20’den kucuk bir
        // sayi alip, bu sayinin faktoryel
        // degerini hesaplayin. Konsolda
        // faktoryel hesabinin yapilisini da
        // yazdirin.
        // Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        int sayi=6;
        int faktoryel=1;

        System.out.print(sayi+ "! = ");
        for (int i= sayi; i>=1 ; i--){
            faktoryel *=i;
        }
    }
}
