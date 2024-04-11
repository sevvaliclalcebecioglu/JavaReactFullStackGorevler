package org.example;
public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("------------------------------");

        // eleman sayısı
        System.out.println("Eleman sayısı : " + mesaj.length());

        System.out.println("------------------------------");

        // 5. eleman
        System.out.println("5. eleman : " + mesaj.charAt(4));

        System.out.println("------------------------------");

        // iki metni birleştirmek için
        System.out.println(mesaj.concat(" Yaşasın!!"));

        System.out.println("------------------------------");

        // B ile başlıyor mu ?
        // true or false
        System.out.println(mesaj.startsWith("B"));

        System.out.println("------------------------------");

        // E harfi ile bitiyor mu ?
        // true or false
        System.out.println(mesaj.endsWith("E"));

        System.out.println("------------------------------");

        // karakterleri ver
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);

        System.out.println("------------------------------");

        // belirttiğim ifadenin indexini sorabilirim
        // sonraki a'ları önemsemez ilk bulduğu a'ya bakar.
        // tek harf değilde kelime olarak aratacağım zaman " " içinde yazarım.
        System.out.println(mesaj.indexOf('a'));

        System.out.println("------------------------------");

        // sondan başlatarak da aratabilirim
        System.out.println(mesaj.lastIndexOf("a"));


    }
}