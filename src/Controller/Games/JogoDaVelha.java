/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package src.Controller.Games;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JogoDaVelha {

    private char[][] tabuleiro;
    private char jogadorAtual;

    public JogoDaVelha() {
        tabuleiro = new char[3][3];
        jogadorAtual = 'X';
        inicializarTabuleiro();
    }

    public void jogar() {
        Scanner scanner = new Scanner(System.in);
        int linha, coluna;

        while (true) {
            exibirTabuleiro();

            System.out.print("Jogador " + jogadorAtual + ", digite a linha (0-2): ");
            try {
                linha = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha pendente

                System.out.print("Jogador " + jogadorAtual + ", digite a coluna (0-2): ");
                coluna = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha pendente

                // chama o método jogadaValida para verificar se a linha e coluna digitadas são válidas
                if (jogadaValida(linha, coluna)) {
                    realizarJogada(linha, coluna);

                    if (verificarVitoria(jogadorAtual)) {
                        exibirTabuleiro();
                        System.out.println("Jogador " + jogadorAtual + " venceu!");
                        break;
                    }

                    if (verificarEmpate()) {
                        exibirTabuleiro();
                        System.out.println("Empate!");
                        break;
                    }

                    jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
                } else {
                    System.out.println("Jogada inválida. Tente novamente.");
                }
                //verifica se o valor digitado são números
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Tente novamente.");
                scanner.nextLine(); // Limpar o buffer de entrada
            }
        }
    }

    private void inicializarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = '-';
            }
        }
    }

    private void exibirTabuleiro() {
        System.out.println("Tabuleiro:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    // confere se a linha e coluna do que o jogador digitou são válidas (3X3)
    private boolean jogadaValida(int linha, int coluna) {
        if (linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3) {
            return false;
        }

        return tabuleiro[linha][coluna] == '-';
    }

    private void realizarJogada(int linha, int coluna) {
        tabuleiro[linha][coluna] = jogadorAtual;
    }

    private boolean verificarVitoria(char jogador) {
        // Verificar linhas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
                return true;
            }
        }

        // Verificar colunas
        for (int j = 0; j < 3; j++) {
            if (tabuleiro[0][j] == jogador && tabuleiro[1][j] == jogador && tabuleiro[2][j] == jogador) {
                return true;
            }
        }

        // Verificar diagonais
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
            return true;
        }

        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
            return true;
        }

        return false;
    }

    private boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == '-') {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        JogoDaVelha jogo = new JogoDaVelha();
        jogo.jogar();
    }
}
