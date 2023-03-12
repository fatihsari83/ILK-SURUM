package pratikDersleri;

import java.util.Scanner;

public class D09_While {
    public static void main(String[] args) {

        // 1 den 100 e kadar çift sayilari yazdirin

     //  int i=1;
     //  while (i <=100){
     //      if (i%2==0){
     //          System.out.println(i);
     //      }
     //      i++;
     //  }

        // soru-2   : Negatif bir deger girilene kadar
        //             kullanicidan girisleri kabul eden
        //            ve girilen degerlerden tek sayilari
        //            toplayan programi yazdir
//Scanner scan= new Scanner(System.in);
      //  int toplam=0;
      //  int input;
      //  while (true){
      //      System.out.println("Lutfen sayi giriniz : ");
      //      input= scan.nextInt();
//
      //      if (input <0){
      //          System.out.println("Program bitti ! Negatif sayi girdiniz");
      //          System.out.println("girilen tek sayilar toplami: " + toplam);
      //          break;
//
      //      }
      //      if (input%2==1){
      //          toplam+=input;
      //      }
//
//
      //  }

        // soru:3   Girilen sayiya kadar olan 2 nin kuvvetleri

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz :");
        int i= scan.nextInt();
        int a=1;
        while (a <=i){
            System.out.println(a);
            a=a*2;
        }




    }

}
