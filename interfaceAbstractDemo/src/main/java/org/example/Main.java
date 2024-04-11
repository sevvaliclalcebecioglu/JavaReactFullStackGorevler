package org.example;

import org.example.abstractt.BaseCustomerManager;
import org.example.concrete.NeroCustomerManager;
import org.example.entities.Customer;

public class Main {
    public static void main(String[] args) {

        BaseCustomerManager customerManager = new NeroCustomerManager();
       // customerManager.save();
    }
}