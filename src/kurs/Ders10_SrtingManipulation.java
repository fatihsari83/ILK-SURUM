package kurs;

public class Ders10_SrtingManipulation {
    public static void main(String[] args) {
        String str= "Java ne kadar guzel";
        // substiring 2 farklı şekilde kullanılabilir.
        // 1- tek parametre olursa , o indexten başlar sonuna kadar yazdırır.

        System.out.println(str.substring(8));
        System.out.println(str.substring(0));
        System.out.println(str.substring(str.length() - 3));
        System.out.println(str.substring(str.length()));

        // 2- iki parametre girilirse başlangıçIndex inden (dahil) başlar
        //    bitişIndex ine (hariç) kadar olan bölümü yazdırır.

        System.out.println(str.substring(5, 7)); // ne

        System.out.println(str.substring(3, 4)); // a

        System.out.println(str.substring(0, 1)); // J

        // str ın 5.karakterini yazdırın

        System.out.println(str.charAt(5)); //n
        System.out.println(str.substring(5, 6)); // n

        System.out.println(str.substring(2, 2)); // hiçlik yazdırır

        System.out.println(str.substring(5, 1));// run time error yani yazmaz
    }
}
