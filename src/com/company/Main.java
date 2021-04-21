package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Entre com o primeiro número: ");

        numero1 = input.nextInt();

        System.out.println("Entre com um novo número: ");

        numero2 = input.nextInt();


        System.out.println("A soma dos números digitados é: ");
        System.out.println("A subtração dos números digitados é: ");
        System.out.println("A multiplicação dos números digitados é: ");
        System.out.println("A divisão dos números digitados é: ");
        System.out.println("O resto da divisão entre os números digitados é: ");
    }
}
