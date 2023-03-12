package kurs;

public class Ders12ForLoops_5 {
    public static void main(String[] args) {



        String input= "Java Candir";

        // output : ridnaC avaJ

        String output= "";

        for (int i= input.length()-1; i>=0 ; i--){

            output += input.charAt(i);
        }
        System.out.println(output);
    }
}
