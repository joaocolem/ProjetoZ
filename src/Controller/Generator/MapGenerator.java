package src.Controller.Generator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;

/**
 * Cria um arquivo.txt de acordo com o JSON inserido no metodo convertJsonToTxtFile. Deve-se criar o mundo no site: https://classicwook.itch.io/ascii-map-maker.
 * <p>O mundo tem que conter:
 * <p> 36 colunas;
 * <p> 20 linhas;
 * <p>Antes de inserir deve-se alterar no JSON:
 * <p>Trocar "" por '';
 * <p>Apagar inicio do JSON ate o {0,0 ...}
 */
public class MapGenerator {
    public static void main(String[] args) {
        String json = "coloque o json aqui";

        convertJsonToTxtFile(json);
    }

    /**
     * Converte os dados do JSON para uma matriz, e gera um arquivo.txt a partir dessa matriz.
     * @param json String
     */
    public static void convertJsonToTxtFile(String json) {
        String jsonString = (String)json;
        String jsonFormated = (jsonString.replaceAll("'color':'white','data':null", "")).replaceAll("'type':1,", "").replaceAll("'type':0,", "");

        String[] items = jsonFormated.split(",");

        int maxRow = 20;
        int maxColumn = 36;

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

                    String character = parts[2];
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
