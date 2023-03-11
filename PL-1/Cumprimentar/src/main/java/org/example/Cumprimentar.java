package org.example;

import java.util.Scanner;

public class Cumprimentar {
    private static Pessoa p1;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");

        String name = input.nextLine();

        System.out.println("Welcome " + name);

        Pessoa p1 = new Pessoa("Maria", 14);
        System.out.println(p1.toString());


    }
}