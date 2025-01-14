package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
        Scanner scr = new Scanner(System.in);
        int people = scr.nextInt(), pieces_per_pizza = scr.nextInt();
        int counter = 1;
        while ((counter * pieces_per_pizza) % people != 0) {
            counter++;
        }
        System.out.println(counter);
    }
}
