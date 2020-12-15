package game.java.game;

import game.java.menu.Menu;
import lombok.Getter;

@Getter
public class Game {

    private char x;
    private char o;
    private final char[][] grid;
    private char win;

    public Game() {
        x = 'x';
        o = 'o';
        grid = new char[3][3];

        initEmptyGrid();
    }

    public void start(Game game) {
        Menu.start(game);
        Menu.gameRules();
        Menu.printGrid(game);
    }

    private void initEmptyGrid() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = ' ';
            }
        }
    }
}
