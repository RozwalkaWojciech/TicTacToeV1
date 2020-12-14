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
        grid = new char[5][5];
    }

    public void start(Game game){
        Menu.start(game);
    }
}
