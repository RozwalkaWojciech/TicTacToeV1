package game.java.game;

import game.java.menu.Menu;
import lombok.Getter;

import java.util.Scanner;

@Getter
public class Game {

    private final char[][] grid;
    private char win;
    private boolean gameEnd;
    private char player;
    private int choice;

    public Game() {

        grid = new char[3][3];
        gameEnd = false;
        player = 'o';

        initEmptyGrid();
    }

    public void start(Game game) {
        Menu.start(game);
        while (!gameEnd) {
            Menu.printGrid(game);
            playerMove();
        }
        Menu.winMenu(win);
    }

    private void initEmptyGrid() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = ' ';
            }
        }
    }

    private void playerMove() {
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        playerCheck();
        if (choice > 0 && choice < 10) {
            switch (choice) {
                case 1:
                    grid[2][0] = player;
                    break;
                case 2:
                    grid[2][1] = player;
                    break;
                case 3:
                    grid[2][2] = player;
                    break;
                case 4:
                    grid[1][0] = player;
                    break;
                case 5:
                    grid[1][1] = player;
                    break;
                case 6:
                    grid[1][2] = player;
                    break;
                case 7:
                    grid[0][0] = player;
                    break;
                case 8:
                    grid[0][1] = player;
                    break;
                case 9:
                    grid[0][2] = player;
                    break;
                default:
                    break;
            }
        }
    }

    private void playerCheck() {
        if (player == 'x') {
            player = 'o';
        } else {
            player = 'x';
        }
    }
}
