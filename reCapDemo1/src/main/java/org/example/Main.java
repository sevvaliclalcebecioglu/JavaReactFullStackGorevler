package org.example;
public class Main {
    public static void main(String[] args) {

        int sayi1 = 30;
        int sayi2 = 25;
        int sayi3 = 2;

        // en büyük sayıyı "sayi1" olarak varsayarsak
        int enBuyuk = sayi1;

        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }

        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }

        System.out.println("En büyük : " + enBuyuk);


    }
}