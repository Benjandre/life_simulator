package userInterface;

import java.util.Scanner;
import Models.Character;

    /*
    MainMenu class represents the main menu of the game.
    It allows the player to start the game, open options, or exit the game.
    In the future, this will be a web application with a graphical user interface.
    */

public class mainMenu {

    public String mainMenuTitle = "Main Menu";
    public String startGame = "Start Game";
    public String options = "Options";
    public String exitGame = "Exit Game";

    public mainMenu(String mainMenuTitle, String startGame, String options, String exitGame) {
        this.mainMenuTitle = mainMenuTitle;
        this.startGame = startGame;
        this.options = options;
        this.exitGame = exitGame;
    }

    public String getMainMenuTitle() {
        return mainMenuTitle;
    }

    public String getStartGame() {
        return startGame;
    }

    public String getOptions() {
        return options;
    }

    public String getExitGame() {
        return exitGame;
    }

    public void selectItemInMenu() {
        Scanner menuItem = new Scanner(System.in);
        System.out.println("");
        String selectedMenuItem = menuItem.nextLine().trim();
        try {
            if (selectedMenuItem.equals("1")) {
                startGame();
            } else if (selectedMenuItem.equals("2")) {
                openOptions();
            } else if (selectedMenuItem.equals("3")) {
                exitGame();
            } else {
                System.out.println("Invalid option. Please try again.");
                return;
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public void startGame() {
        System.out.println("Game is starting...");
        // Logic to load the game goes here
    }

    public void openOptions() {
        System.out.println("Opening options menu...");
        // Logic to open options goes here
    }

    public void exitGame() {
        System.out.println("Exiting the game. Goodbye!");
        // Logic to exit the game goes here
    }

    public void loadMainMenu() {
        System.out.println(mainMenuTitle);
        System.out.println("");
        System.out.println("1. " + startGame);
        System.out.println("2. " + options);
        System.out.println("3. " + exitGame);
        selectItemInMenu();
    }
    
}
