package kurs;

public class Ders10_4index0f {
    public static void main(String[] args) {

        String str = "Java cok ama cok guzel";
        System.out.println(str.indexOf("c")); // 5
        System.out.println(str.indexOf("a"));// birden fazla ise ilk bulduğunu verir
        System.out.println(str.indexOf("cok"));// 5
        System.out.println(str.indexOf("cok", 6)); //13
        // Verilen bir cumlede, istenen bir String icin
// asagidaki cumlelerden uygun olani yazdirin
// 1- aradiginiz kelime cumlede 1 kere kullanilmis
// 2- aradiginiz kelime cumlede 2 kere kullanilmis
// 3- aradiginiz kelime cumlede 2'den fazla kullanilmis

        String cumle = "Yasasin java, iyi ki java ogreniyorum";
        String kelime = "java;";

        if (cumle.indexOf(kelime) == (-1)) {
            System.out.println("aradıgınız kelime cumlede hıc kullanılmamıs");

        } else {
            int kelimeIlkIndex= cumle.indexOf(kelime); // 8
            if (cumle.indexOf(kelime, (kelimeIlkIndex+1))==(-1));

        }

    }
}