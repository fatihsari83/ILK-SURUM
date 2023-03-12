package ders11_Wisequarter;

public class C02_nullPointer {
    public static void main(String[] args) {

        // null bir değer değildir.
        // null bir pointerdır. Yanina yazildiği non-primitive variable a
        // değer atanmadigi isaret eder.

        String str;  // str oluşturuldu ama deger atanmadi.

        // java metod icerisinde deger atamadan variable olusturulmasına izin verir.
        // ama deger atanmadan kullanilmasina izin vermez.

        // bazen programlarda variable lar olusturulur ama
        // daha sonra deger atanacagi icin deger atamasi yapilmaz.
        // deger atamasi yapilmadan listeleme bile olmadigi icin
        // CTE verdigi icin
        // deger verilmedigini isaretleyecek, ama CTE olusmasini engelleyecek
        // bir cozum olarak null pointer olusturmustur.

        str=null; // str= "null" degil. Sadece null olarak ısaretlenmistir.
                  // ama degeri null olarak atanmıs değil..

        System.out.println(str); // null
        //System.out.println(str.concat("Java")); // NullPointerException
                                                   // Run Time Error
        //System.out.println(str.length()); // NullPointerException
                                          // Run Time Error
        System.out.println(str + "Java"); //null Java

        // biz genelde String bir ifade olusturup,sonra deger atayacaksak
        // hiclik degeri atariz

        String str3= ""; // str3 e deger atanmistir.
                         // atanan deger hicliktir.
        System.out.println(str3.concat("Java")); // Java

        System.out.println(str3.isEmpty()); // true

        // null olarak isartelenen bir String hicbir metodla kullanilamaz.
        // Sadece yazdirilabilir. Veya + ile kullanilabilir.

    }
}
