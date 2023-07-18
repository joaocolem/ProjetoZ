package src.Controller.Helpers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Helper {
    public static char[][] getLayout (String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            List<char[]> chars = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                    chars.add(line.toCharArray());
            }
            char[][] layout = new char[chars.size()][];
            chars.toArray(layout);

            return layout;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
