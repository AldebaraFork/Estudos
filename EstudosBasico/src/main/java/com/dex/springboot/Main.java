package com.dex.springboot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        Integer idade = ler.nextInt();
        String mensagem = (idade >= 18)? "Voce é maior de idade" : "Voce é de menor";
        System.out.println(mensagem);
    }
}