package game.java.game;

import game.java.menu.Menu;
import lombok.Getter;

import java.util.Scanner;

@Getter
public class Game {

    private final char[][] grid;
    private char win;
    private char player;
    private int choice;

    public Game() {

        grid = new char[3][3];
        player = 'o';
        win = 'n';

        initEmptyGrid();
    }

    public void start(Game game) {
        Menu.start(game);
        while (!gameEnd()) {
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

    private boolean gameEnd() {
        return win == 'x' || win == 'o' || win == 't';
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

    private void checkGameWinner(char[][] grid) {
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] == 'x' && grid[i][1] == 'x' && grid[i][2] == 'x') {
                win = 'x';
            } else if (grid[0][i] == 'x' && grid[1][i] == 'x' && grid[2][i] == 'x') {
                win = 'x';
            } else if (grid[i][0] == 'o' && grid[i][1] == 'o' && grid[i][2] == 'o') {
                win = 'o';
            } else if (grid[0][i] == 'o' && grid[1][i] == 'o' && grid[2][i] == 'o') {
                win = 'o';
            } else if (grid[1][1] == 'x' && ((grid[0][0] == 'x' && grid[2][2] == 'x') || (grid[0][2] == 'x' && grid[2][0] == 'x'))) {
                win = 'x';
            } else if (grid[1][1] == 'o' && ((grid[0][0] == 'o' && grid[2][2] == 'o') || (grid[0][2] == 'o' && grid[2][0] == 'o'))) {
                win = 'o';
            } else if (motionCounter == 9) {
                win = 't';
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
