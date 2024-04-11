package org.example;


public class Main {
    public static void main(String[] args) {
        //reference type

        CustomerClasses customerClasses = new CustomerClasses();
        CustomerClasses customerClasses1 = new CustomerClasses();
        customerClasses = customerClasses1;

        customerClasses.Add();
        customerClasses.Remove();
        customerClasses.Update();

        // value
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);
    }
}