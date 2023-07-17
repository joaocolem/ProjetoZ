package src.Controller.Generator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;

import javax.swing.JOptionPane;

/**
 * Cria um arquivo.txt, na raiz, de acordo com o JSON inserido no metodo convertJsonToTxtFile. Deve-se criar o mundo no site: https://classicwook.itch.io/ascii-map-maker.
 * <p>O mundo tem que conter:
 * <p> 50 colunas;
 * <p> 50 linhas;
 * <p>Antes de inserir deve-se alterar no JSON:
 * <p>Trocar "" por '';
 * <p>Apagar inicio do JSON ate o {0,0 ...}
 */
public class MapGenerator {
    public static int maxRow = 50;
    public static int maxColumn = 50;

    public static void main(String[] args) {
        String json = JOptionPane.showInputDialog("Insira o JSON");

        convertJsonToTxtFile(json);
    }

    /**
     * Converte os dados do JSON para uma matriz, e gera um arquivo.txt a partir dessa matriz.
     * @param json String
     */
    private static void convertJsonToTxtFile(String json) {
        String jsonString = (String)json;
        String jsonFormated = (jsonString.replaceAll("'color':'white','data':null", "")).replaceAll("'type':1,", "").replaceAll("'type':0,", "");

        String[] items = jsonFormated.split(",");

        String[][] matrix = new String[maxRow + 1][maxColumn + 1];
        Stack<Integer> coordinatesStack = new Stack<>();

        for (String item : items) {
            if(!item.contains("'color'") && !item.contains("'type'")) {
                String numberString = item.replaceAll("[^0-9,]", "");

                if (!numberString.isEmpty()) {
                    coordinatesStack.add(Integer.parseInt(numberString));
                }
            }

            if (coordinatesStack.size() == 2){
                if (item.contains("'character'")) {
                    String[] parts = item.split(":");
                    String character;

                    if (parts.length > 2) {
                        character = parts[2];
                    } else {
                        character = parts[1];
                    }

                    int row = coordinatesStack.pop();
                    int column = coordinatesStack.pop();

                    matrix[row][column] = character;
                }
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("MapaCriado.txt"))) {
            for (String[] row : matrix) {
                for (String cell : row) {
                    if (cell == null) {
                        writer.write(" ");
                    } 
                    else if (cell.equals("''")) {
                        writer.write(".");
                    }
                    else {
                        String cellFormatted = cell.replaceAll("'", "");
                        writer.write(cellFormatted);
                    }
                }
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
