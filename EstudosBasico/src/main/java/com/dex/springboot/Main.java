package com.dex.springboot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] clientes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do cliente: ");
            clientes[i] = sc.nextLine();

        }
        for (String cliente : clientes) {
            System.out.println(cliente);
        }

    }
}