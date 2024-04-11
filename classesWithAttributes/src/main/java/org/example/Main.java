package org.example;
public class Main {
    public static void main(String[] args) {
         Product product = new Product();
         product.set_name("Laptop");
         product.set_id(1);

         ProductManeger productManeger = new ProductManeger();
         productManeger.Add(product);

         System.out.println(product.get_kod());



        }
    }
