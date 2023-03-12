package pratikDersleri;

import java.util.Scanner;

public class D04_IfElse {
    public static void main(String[] args) {

        /*
            1- Kullanicidan gun ismini alin ve
            haftaici veya hafta sonu oldugunu yazdirin
            Ornek:  gun=Pazar output = "Hafta sonu"
            gun=Sali output = "Hafta ici"
            *** String icin equals method'unusalı kullanin
           */

        Scanner scan=new Scanner(System.in);
        /*
        System.out.println("Bugun gunlerden hangi gun :");
        String gun= scan.next().toUpperCase();

        if (gun.equals("Cumartesi")|| gun.equals("Pazar")){
            System.out.println("Bugun haftasonu");
        }
        if (gun.equals("Pazartesi")||gun.equals("Sali")||gun.equals("Carsamba")||gun.equals("Persembe")||gun.equals("Cuma")){
            System.out.println("Bugun haftaıcı");
        }
        //if (!(gun.equals("Pazartesi")||gun.equals("Sali")||gun.equals("Carsamba")||
           //     gun.equals("Persembe")||gun.equals("Cuma")||gun.equals("Cumartesi")|| gun.equals("Pazar"))){
           // System.out.println("Hıcbırı");
        //}
        */
        /*2- Kullanıcıdan İki adet vize notu ve bir adet
        final notu girmesini isteyin
        Yıl sonu notunu vizeler %40 finaller % 60 olacak
        şekilde hesaplayıp
        Ders durumuna bu not 50'den büyük ise Geçtiniz Tebrikler!
         olduğunu 50'den küçükse Maalesef Kaldınız
         olarak aşağıdaki formatta yazdırınız

            Ad:
            Soyad:
         1.Vize:
            2. Vize:
        Final :
        Yıl Sonu Notu:
        Ders Durumu :

        */
        System.out.println("Lutfen Adinizi giriniz :");
        String name= scan.nextLine();
        System.out.println("Lutfen soyadinizi giriniz");
        String surname= scan.nextLine();
        System.out.println("Lutfen Vize ve Final notlarınızı giriniz :");
        System.out.println("1.Vize notu :");
        int vize1= scan.nextInt();
        System.out.println("2.Vize notu :");
        int vize2= scan.nextInt();
        System.out.println("Final notu :");
        int finalnotu= scan.nextInt();
        int yilsonuNotu= (((vize1+vize2)/2)*40/100)+(finalnotu*60/100);
        System.out.println("Adiniz :" + name);
        System.out.println("Soyadiniz :" + surname);
        System.out.println("1.Vize :" + vize1);
        System.out.println("2.Vize :" + vize2);
        System.out.println("Final :" + finalnotu);
        System.out.println("Yılsonu notu :" + yilsonuNotu);
        if (yilsonuNotu>50){
            System.out.println("Sinifi gectiniz");
        }
        if (yilsonuNotu<50){
            System.out.println("Uzgunum.Sinifta Kaldiniz");
        }

    }
}
