package it.zbaldi.view;

import it.zbaldi.controller.ClassAnalyzerController;

import java.util.Scanner;

public class ConsoleView implements GenericView {

    /** Controller for analyzing classes. */
    private final ClassAnalyzerController classAnalyzerController = new ClassAnalyzerController();

    /**
     * Starts the console view application loop.
     * Continues showing menu and processing user input until exit is selected.
     */
    @Override
    public void start() {

        boolean exit = false;

        while(!exit) {
            showMenu();
            exit = checkOption();
        }

    }

    /**
     * Displays the main menu options to the user.
     */
    private void showMenu(){
        System.out.println("--------STORM PROJECT ANALYZER--------");
        System.out.println("Select one option:");
        System.out.println("1) Start Project Analysis");
        System.out.println("2) Exit");
    }

    /**
     * Handles user input menu selection.
     * @return true if the user selected to exit, false otherwise
     */
    private boolean checkOption(){

        try {
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    classAnalyzerController.getCodeSnapshots(0.25F);
                    classAnalyzerController.executeExtractionProcess();
                    return false;
                case 2:
                    return true;
                default:
                    System.out.println("Invalid option");
                    return false;
            }
        }catch (Exception e){
            System.out.println("Invalid option");
            return false;
        }
    }
}
