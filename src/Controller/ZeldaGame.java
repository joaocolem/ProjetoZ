package src.Controller;
import java.util .Scanner;

public class ZeldaGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Personagem personagem = new Personagem(2, 2);

        Worlds worlds = new Worlds();

        while (true) {
            if (worlds.getCurrentWorld() == 1) {
                worlds.displayWorld(worlds.getWorld1(), personagem);
            } else if (worlds.getCurrentWorld() == 2) {
                worlds.displayWorld(worlds.getWorld2(), personagem);
            }

            System.out.print("Enter your move (w/a/s/d): ");
            String input = scanner.nextLine();

            personagem.movePlayer(input, worlds);

            System.out.println("--------------------");
        }
    
}
}
