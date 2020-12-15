package game.java.game;

import game.java.menu.Menu;

public class Game {

    private char x;
    private char o;
    private char[][] grid;
    private char win;

    public Game() {
        x = 'x';
        o = 'o';
        grid = new char[3][3];
    }

    public void start(Game game) {
        Menu.start(game);
        initEmptyGrid();
        printGrid();
    }

    private void initEmptyGrid() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = ' ';
            }
        }
    }

    private void printGrid() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j]);
                if (j != 2) {
                    System.out.print("|");
                }
            }
        }
    }
}
