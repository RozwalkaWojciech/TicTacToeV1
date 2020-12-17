package game.java.menu;

import game.java.game.Game;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Menu {

    private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");

    private Menu() {
    }

    public static void start(Game game) {
        STDOUT.info("\nWelcome to the game of Tic-Tac-Toe." +
                "\nUse the given numbers to select a specific field.\n");
        gameRules();
        STDOUT.info("\nAre you ready? Let's start!" +
                "\nFirst begin: {}\n", game.getPlayer());
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

    public static void warningSign() {
        STDOUT.info("\nThis is not a number!\n");
    }

    public static void warningNumber() {
        STDOUT.info("\nPlease enter a number from 1 to 9 by schema!" +
                "\nField should be empty!\n");
    }

    public static void winMenu(char win) {
        STDOUT.info("\nThe winner is player: {}", win);
    }

    public static void tieMenu() {
        STDOUT.info("\nTIE! Nobody won!");
    }
}
