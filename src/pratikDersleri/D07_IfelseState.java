package pratikDersleri;

import java.util.Scanner;

public class D07_IfelseState {
    public static void main(String[] args) {

        /*
        Soru ) Interview Question
        Kullanicidan artik yil olup olmadigini kontrol
        etmek icin yil girmesini isteyin.
        Kural 1: 4 ile bolunemeyen yillar artik yil  egildir
        Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
        Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400’un kati olan yillar artik yildir
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen Kontrol etmek ıstedıgınız yılı giriniz");
        int yil= scan.nextInt();

        if (yil%100==0 && yil%400==0 || yil%100!=0 && yil%4==0){
            System.out.println("Girdiginiz yil artik yildir");
        }else{
            System.out.println("Girdiginiz yil artik degildir");
        }
    }
}
