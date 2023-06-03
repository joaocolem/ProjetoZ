package src.Controller.Games;

import java.util.Random;
import java.util.Scanner;

public class Forca {

    static Scanner tec = new Scanner(System.in);
    static Random rd = new Random();

    // frutas
    public static String[] nivelFacil() {
        String[] frutas = {"banana", "maca", "uva", "melancia", "abacaxi",
            "laranja", "morango", "kiwi", "mamao", "pessego",
            "manga", "pera", "cereja", "limao", "abacate",
            "ameixa", "goiaba", "caqui", "figo", "tangerina"
        };
        return frutas;
    }

    // animais
    public static void nivelMedio() {
        String[] animais = {
            "gato", "cachorro", "leao", "elefante", "tigre",
            "girafa", "zebra", "coelho", "leopardo", "lobo",
            "pinguim", "macaco", "panda", "golfinho", "urso"
        };
    }

    // a definir
    public static void nivelDificil() {

    }

    public static void forca(String vetorDePalavras[]) {

        String palavraCorreta;
        char caractereTentativa;
        int numTentativas = 5;

        //sorteia uma palavra do array
        int sorteio = rd.nextInt(vetorDePalavras.length);

        // define o tamanho do array com base 
        // na quantidade de caracteres que tem a palavra sorteada
        char espacosForca[] = new char[vetorDePalavras[sorteio].length()];

        // atribuímos para a variável palavraCorreta o valor da fruta escolhida
        palavraCorreta = vetorDePalavras[sorteio];
        
        // seta "_" para cada índice do array espacosForca
        for (int i = 0; i < espacosForca.length; i++) {
            espacosForca[i] = '_';
        }

        // implementar as tentativas - nº de tentivas = frutas[sorteio].length + 1
        while (numTentativas > 0) {
            System.out.println("\nDICA: FRUTA");
            boolean possuiCaractere = false;
            // imprime a quantidade de caracteres que tem a palavra para ser adivinhada
            for (int i = 0; i < espacosForca.length; i++) {
                System.out.print(espacosForca[i] + " ");
            }
            System.out.println("");
            // recebe o caractere
            caractereTentativa = tec.nextLine().charAt(0);

            // verifica se o caractere está na palavra
            for (int i = 0; i < espacosForca.length; i++) {
                // caso o caractere esteja na palavra, setamos para o campo "_" o valor do caractere
                if (vetorDePalavras[sorteio].charAt(i) == caractereTentativa) {
                    espacosForca[i] = caractereTentativa;
                    possuiCaractere = true;
                }
            }

            // caso saia do loop e a variável possuiCaractere receba false, vai diminuir o número de tentativas disponíveis
            if (!possuiCaractere) {
                numTentativas--;
                System.err.println("\nLetra incorreta! Tente outra...");
            }

            // verifica se o usuário acertou
            if (palavraCorreta.equals(String.valueOf(espacosForca))) {
                System.out.println("PARABENS!! VOCE ACERTOU, A RESPOSTA E " + palavraCorreta.toUpperCase());
                break;
            }

            System.out.println("Tentativas restantes: " + numTentativas);
            if (numTentativas == 0) {
                System.out.println("\nQue pena, suas tentativas acabaram! A resposta correta era: " + palavraCorreta);
                break;
            }
        }
    }

    public static void main(String[] args) {
        forca(nivelFacil());

    }
}
//\n
