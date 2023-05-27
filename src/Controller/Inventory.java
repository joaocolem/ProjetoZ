package src.Controller;

import java.util.Stack;

public class Inventory {
    private static Stack<Character> collectedItems = new Stack<>();

    public Inventory(){

    }

    //metodo criado para verificar de pode ou nao coletar a letra presente em cada mapa.
    //a letra so podera ser coletada caso de acordo com a tabela ASCII o valor decimal seja 1 a mais que o ultimo 
    //valor adicionado ao meu arryList.
    public boolean canCollect(int x, int y, char[][] currentWorld) {
        int expectedASCIIChar = 65;

        // verifica se meu arrayList nao esta vazio, se nao estiver pega o
        // caracter da ultima possição do vetor e converte para inteiro e soma mais 1
        // para atualizar o valor do proximo caracter a ser coletado
        if (!collectedItems.isEmpty()) {
            expectedASCIIChar = ((int) collectedItems.get(collectedItems.size() - 1)) + 1;
        }

        if (currentWorld[y][x] == '.') {
            return true;
        }

        if (currentWorld[y][x] == ' ') {
            return true;
        }
        
        else if ((int) currentWorld[y][x] == expectedASCIIChar)
        {
            addLetterToInventory(currentWorld[y][x]);
            return true;
        }

        else {
            return false;
        }

    }

    private void addLetterToInventory (Character letter) {
        collectedItems.push(letter);
    }

    public static Character getCollectedItems(){
        return collectedItems.pop();
    }

}
