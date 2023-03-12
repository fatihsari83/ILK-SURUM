package pratik_dersleri;

import java.util.Scanner;

public class P06_Ifelse_pratik {
    public static void main(String[] args) {

        // kullanicidan artik yıl olup olmadigini
        // kontrol etmek icin yil girmesini isteyin
        // 1- 4 ile bolunemeyen yıllar artik yil degildir
        // 2- 4 ile bolunup, 100 ile bolunemeyen yillar artık yıldır
        // 3- 4 un kati olmasına ragmen 100 ile bolunebilen yillardan
        //    sadece 400 un kati olan yillar artik yildir.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir yil giriniz");
        int yil= scan.nextInt();
        
        if (yil%4!=0){
            System.out.println("Artik yil degildir");
        } else if (yil%100!=0) {
            System.out.println("Artik yildir");
            
        } else if (yil%400==0) {
            System.out.println("Arik yildir");
            
        }else {
            System.out.println("Artik yil degildir");

        }
    }
}
