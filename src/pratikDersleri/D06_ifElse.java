package pratikDersleri;

import java.util.Scanner;

public class D06_ifElse {
    public static void main(String[] args) {

        /*
        2- Kullanicidan mesafeyi kilometre olarak alin
        ve cevirmek istedigi birimi
        sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
        "istediginiz birim sisteme kayitli degil" yazdirin.
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen mesafeyi kilometre olarak giriniz : ");
        double km= scan.nextDouble();

        System.out.println("Lutfen hangi birime cevrilecegini yazin (Ornek metre) : ");
        char birim= scan.next().charAt(0);

        if (birim == 'm' || birim== 'M'){
            System.out.println("Girdiginiz mesafenin metre degeri: "+km*1000+" 'dir.");
        } else if (birim=='s' || birim=='S') {
            System.out.println("Girdiginiz mesafenin metre degeri: "+km*1000*100+" 'dir.");

        }else {
            System.out.println("Istediginiz birim sisteme kayitli degil");
        }
    }
}
