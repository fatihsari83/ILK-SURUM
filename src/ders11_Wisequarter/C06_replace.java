package ders11_Wisequarter;

public class C06_replace {
    public static void main(String[] args) {

        // kullanicidan belirli bir formata verdigi
        //String fiyatlari toplayıp yazdirin.
        //    input1: "15.30 euro, input2: "11.40 euro
        //    output: 36.70 euro

        String input1= "15.30$";
        String input2= "11.40$";

        // inputlarda digit olmayan herseyi yok edelim

        input1= input1.replaceAll("\\D", "");
        input2= input2.replaceAll("\\D", "");

        // inputlar



    }
}
