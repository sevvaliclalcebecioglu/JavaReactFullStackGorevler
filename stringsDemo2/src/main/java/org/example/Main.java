package org.example;
public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("*****************************");

        // Bir şeyleri değiştirmek için
        // yeni bir metin verir
        String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);

        System.out.println("*****************************");

        // Bir metnin içerisinden parça almak için
        System.out.println(mesaj.substring(2));

        System.out.println("*****************************");

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }

        System.out.println("*****************************");

        // küçük harfe çevirmek için
        System.out.println(mesaj.toLowerCase());

        System.out.println("*****************************");

        // büyük harfe çevirmek için
        System.out.println(mesaj.toUpperCase());

        System.out.println("*****************************");

        // boşlukları kaldırmak için
        System.out.println(mesaj.trim());


    }
}