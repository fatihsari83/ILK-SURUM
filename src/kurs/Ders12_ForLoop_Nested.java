package kurs;

public class Ders12_ForLoop_Nested {
    public static void main(String[] args) {

        // verilen bir rakam için carpim
        // tablosu olusturun

        int sayi =4;

        for (int i= 1; i <=sayi ; i++){
            System.out.print(i + " ");
        }
        System.out.print(" ");


        System.out.println("==========");


        for (int i= 1; i <=sayi ; i++){
            for (int j= 1; j <=sayi ; i++){
                System.out.print(i*j + " ");
            }

            System.out.println("");
        }

    }







}
