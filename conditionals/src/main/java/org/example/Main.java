package org.example;

public class Main {
    public static void main(String[] args) {

        int sayi = 14;

        // Eğer if bloğu doğru ise kodun içi çalışır . Eğer doğru değilse o zaman çalışmaz.

        if (sayi < 20) {
            System.out.println("Sayı 20 den küçüktür");
        } else {
            System.out.println("Sayı 20 den küçük değildir");
        }

        /*  if (sayi<15){
            System.out.println("Sayı 15 den küçüktür");
        } */

        System.out.println("----------------------------------");

        int sayi1 = 24;

        if (sayi1 < 20) {
            System.out.println("Sayı 20 den küçüktür");
        } else if (sayi1 <= 20) {
            System.out.println("Sayı 20 den küçük değildir");
        } else {
            System.out.println("Sayı 20 den büyüktür");
        }

    }
}