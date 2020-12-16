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
        if (win == 't') {
            Menu.tieMenu();
        } else {
            Menu.winMenu(win);
        }
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

        if (choice > 0 && choice < 10) {
            switch (choice) {
                case 1:
                    if (grid[2][0] == ' ') {
                        grid[2][0] = player;
                        switchPlayer();
                    }
                    break;
                case 2:
                    if (grid[2][1] == ' ') {
                        grid[2][1] = player;
                        switchPlayer();
                    }
                    break;
                case 3:
                    if (grid[2][2] == ' ') {
                        grid[2][2] = player;
                        switchPlayer();
                    }
                    break;
                case 4:
                    if (grid[1][0] == ' ') {
                        grid[1][0] = player;
                        switchPlayer();
                    }
                    break;
                case 5:
                    if (grid[1][1] == ' ') {
                        grid[1][1] = player;
                        switchPlayer();
                    }
                    break;
                case 6:
                    if (grid[1][2] == ' ') {
                        grid[1][2] = player;
                        switchPlayer();
                    }
                    break;
                case 7:
                    if (grid[0][0] == ' ') {
                        grid[0][0] = player;
                        switchPlayer();
                    }
                    break;
                case 8:
                    if (grid[0][1] == ' ') {
                        grid[0][1] = player;
                        switchPlayer();
                    }
                    break;
                case 9:
                    if (grid[0][2] == ' ') {
                        grid[0][2] = player;
                        switchPlayer();
                    }
                    break;
                default:
                    break;
            }
        }
    }

    private void switchPlayer() {
        if (player == 'x') {
            player = 'o';
        } else {
            player = 'x';
        }
    }
}
