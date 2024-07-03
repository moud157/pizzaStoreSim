package com.pizzastore;

//Chef class that extends Employee class
public class Chef extends Employee {
    //Constructor that initializes the name of the Chef
    public Chef(String name) {
        super(name);
    }
    //Method to simulate preparing a pizza
    public void preparePizza() {
        //Print message indicating that the chef is preparing pizza
        System.out.println(name + " is preparing pizza.");
    }
}
