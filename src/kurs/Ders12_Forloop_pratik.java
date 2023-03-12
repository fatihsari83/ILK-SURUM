package kurs;

public class Ders12_Forloop_pratik {
    public static void main(String[] args) {


        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.

        int sayi =5;

        int faktoryel=1;

        for (int i=sayi; i >=1; i--){
            faktoryel *=i;

        }
        System.out.println(sayi + "! = " + faktoryel);
    }

}
