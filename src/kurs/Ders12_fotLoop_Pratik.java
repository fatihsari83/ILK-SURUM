package kurs;

public class Ders12_fotLoop_Pratik {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri
        // olarak pozitif sayilar alin, sinirlar dahil
        // olarak aralarindaki tum sayilarin
        // toplamini yazdirin. Bitis degeri
        // baslangic degerinden kucukse,
        // uyari yazdirip islemi sonlandirin


        int bas=20;
        int bit=40;

        int sayiToplami=0;

        if (bit <bas){
            System.out.println("Baslangıc degeri bitis degerinden kucuk olmalidir");
        }else {
            for (int i = bas; i <=bit; i++){
                sayiToplami +=i;
            }
        }
    }
}
