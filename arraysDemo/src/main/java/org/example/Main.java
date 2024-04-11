package org.example;
public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "İclal";
        String ogrenci2 = "Tuana";
        String ogrenci3 = "Kaan";
        String ogrenci4 = "Kübra";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("------------------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "İclal";
        ogrenciler[1] = "Tuana";
        ogrenciler[2] = "Kaan";
        ogrenciler[3] = "Kübra";

        for (int i = 0; i < ogrenciler.length; i++) {   // öğrencilerin eleman sayısından
            System.out.println(ogrenciler[i]);   // öğrencilerin i elemanını yaz
        }

        System.out.println("------------------------------");

        // Yukarıdaki kodu aşağıdaki gibi de yazabiliriz . Genelde aşağıdaki gibi kullanırız.

        for (String ogrenci : ogrenciler){ // ogrenciler içerisindeki her bir elemanı gez
            System.out.println(ogrenci);
        }

    }
}