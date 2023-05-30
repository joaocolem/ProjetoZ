package Games;


import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class JogoDaMemoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo as cartas do jogo
        List<String> cartas = new ArrayList<>();
        cartas.add("A");
        cartas.add("A");
        cartas.add("B");
        cartas.add("B");
        cartas.add("C");
        cartas.add("C");
        cartas.add("D");
        cartas.add("D");
        Collections.shuffle(cartas);

        // Tabuleiro
        String[] tabuleiro = new String[8];
        boolean[] cartasEncontradas = new boolean[8];

        boolean jogoTerminado = false;
        int paresEncontrados = 0;
        int tentativas = 0;

        while (!jogoTerminado) {
            System.out.println("Escolha duas cartas (0-7):");

            // Exibir o tabuleiro
            for (int i = 0; i < tabuleiro.length; i++) {
                if (cartasEncontradas[i]) {
                    System.out.print("[" + tabuleiro[i] + "]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();

            // Entrada do jogador
            int carta1 = -1;
            int carta2 = -1;
            try {
                carta1 = scanner.nextInt();
                carta2 = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Insira um número.");
                scanner.nextLine(); // Limpar o buffer do scanner
                continue;
            }

            if (carta1 < 0 || carta1 >= 8 || carta2 < 0 || carta2 >= 8) {
                System.out.println("Cartas inválidas! Escolha um número entre 0 e 7.");
                continue;
            }

            if (cartasEncontradas[carta1] || cartasEncontradas[carta2]) {
                System.out.println("Uma ou ambas as cartas já foram encontradas. Escolha novamente.");
                continue;
            }

            if (carta1 == carta2) {
                System.out.println("Você deve escolher duas cartas diferentes. Tente novamente.");
                continue;
            }

            // Verificar se as cartas são iguais
            if (cartas.get(carta1).equals(cartas.get(carta2))) {
                System.out.println("Par encontrado!");
                cartasEncontradas[carta1] = true;
                cartasEncontradas[carta2] = true;
                paresEncontrados++;

                if (paresEncontrados == 4) {
                    System.out.println("Parabéns, você venceu o jogo!");
                    jogoTerminado = true;
                }
            } else {
                System.out.println("As cartas não são iguais. Tente novamente.");
            }

            tentativas++;
        }

        System.out.println("Número de tentativas: " + tentativas);
        scanner.close();
    }
}
