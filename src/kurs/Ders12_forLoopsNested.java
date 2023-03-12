package kurs;

public class Ders12_forLoopsNested {
    public static void main(String[] args) {

        // dinamik olarak verilen satir ve
        // sutun sayisina göre yıldızlardan bir
        // dikdortgen olusturun

        /*
          * * * * *
          * * * * *
          * * * * *
          * * * * *
         */

        int satirSayisi=3;
        int sutunSayisi=5;

        for (int k=1 ; k <=satirSayisi ; k++) { //satir sayisi

            for (int i= 1; i <=sutunSayisi ; i++){ // sutun sayisi
                System.out.print("* ");
            }
            System.out.println(""); // bir satirdaki tum sutunlar bitince alt satira geciyor
        }

        System.out.println("==========");

        for (int i= 1; i <=satirSayisi ; i++){

        }
    }
}
