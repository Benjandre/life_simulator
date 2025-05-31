package gameInterface.mainMenu;

import java.util.Scanner;

public class mainMenu {

    public String mainMenuTitle = "Main Menu";
    public String startGame = "Start Game";
    public String options = "Options";
    public String exitGame = "Exit Game";

    public mainMenu(String mainMenuTitle, String startGame, String options, String exitGame) {
        this. mainMenuTitle = mainMenuTitle;
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

    public void selectItemInMenu(String selectedMenuItem) {
        Scanner menuItem = new Scanner(System.in);
        selectedMenuItem = menuItem.nextLine().trim();
        if (selectedMenuItem == "1") {
                System.out.println("Starting the game...");
                startGame();
        } else if (selectedMenuItem == "2") {
                System.out.println("Opening options...");
                openOptions();
        } else if (selectedMenuItem == "3") {
                System.out.println("Exiting the game...");
                exitGame();
        } else {
                System.out.println("Invalid option. Please try again.");
                return;
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
