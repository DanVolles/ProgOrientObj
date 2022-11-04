package Exemplos.Aleatórios;

import java.util.Random;

public class Aleatorio {
    public static void main(String[] args) {

// Gerar um número aleatório entre 0 e 1
        System.out.println(Math.random());

        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random() * 2); // Aqui vai gerar números entre 0 e 2: 0,000...001 até 1,9999...
            System.out.println(Math.random() * 100); // entre 0,0000...001 e 99.99999...
        }


// Exercício dos dados
        Dado dado6 = new Dado(6);
        Dado dado12 = new Dado(12);

        for (int i = 0; i < 10; i++) {

            System.out.println("Dado de 6 lados" + dado6.rolar());
            System.out.println("Dado de 12 lados" + dado12.rolar());

        }
    }
}
