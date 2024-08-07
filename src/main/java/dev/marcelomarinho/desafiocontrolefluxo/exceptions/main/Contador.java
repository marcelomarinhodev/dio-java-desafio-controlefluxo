package dev.marcelomarinho.desafiocontrolefluxo.exceptions.main;

import dev.marcelomarinho.desafiocontrolefluxo.exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 0; i <= contagem; i++) {
            int numero = parametroUm + i;
            System.out.println("Imprimindo o número "
                    .concat(String.valueOf(i + 1))
                    .concat(": ")
                    .concat(String.valueOf(numero)));
        }
    }

}
