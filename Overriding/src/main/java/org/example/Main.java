package org.example;
public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] krediManagers = new BaseKrediManager[]
                {new ÖğretmenKrediManager(), new TarımKrediManager(), new ÖğrenciKrediManager()};

        for (BaseKrediManager krediManager : krediManagers){
            System.out.println(krediManager.hesapla(1000));
        }
    }
}