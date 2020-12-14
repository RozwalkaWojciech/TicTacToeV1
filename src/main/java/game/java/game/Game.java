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
        grid = new char[3][6];
    }

    public void start(Game game){
        Menu.start(game);
        printGrid();
    }

    private void printGrid(){
        for (int i = 0; i < 2; i++) {
            if (i==0){
                System.out.print(" | | ");
            }
            System.out.println();
            for (int j = 0; j < 6; j++) {
                grid[i][j] = '-';
                System.out.print(grid[i][j]);
            }
        }
    }
}
