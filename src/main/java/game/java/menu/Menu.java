package game.java.menu;

import game.java.game.Game;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Menu {

    private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");

    private Menu() {
    }

    public static void start(Game game) {
        STDOUT.info("\nWelcome to the game of Tic-Tac-Toe" +
                "\nUse the given numbers to select a specific field");
        gameRules();
        STDOUT.info("Are you ready? Let's start!" +
                "\n First start: {}\n", game.getPlayer());
    }

    public static void printGrid(Game game) {
        for (int i = 0; i < 3; i++) {
            STDOUT.info("\n");
            if (i != 0) {
                STDOUT.info("-----\n");
            }
            for (int j = 0; j < 3; j++) {
                STDOUT.info(String.valueOf(game.getGrid()[i][j]));
                if (j != 2) {
                    STDOUT.info("|");
                }
            }
        }
        STDOUT.info("\n");
    }

    public static void gameRules() {
        STDOUT.info("\n7|8|9\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "1|2|3\n");
    }

    public static void winMenu(char win) {
        STDOUT.info("The winner is player: {}", win);
    }

    public static void tieMenu() {
        STDOUT.info("TIE! Nobody won!");
    }
}
