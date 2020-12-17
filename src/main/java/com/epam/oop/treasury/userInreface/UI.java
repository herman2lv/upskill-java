package com.epam.oop.treasury.userInreface;

import com.epam.oop.treasury.beans.Treasure;
import com.epam.oop.treasury.dao.TreasureFromFileReader;
import com.epam.oop.treasury.dao.TreasuresGenerator;
import com.epam.oop.treasury.service.TreasureService;

import java.util.List;
import java.util.Scanner;


public class UI {
    private final Scanner scanner = new Scanner(System.in);
    private static final String HELP = """
            Available commands:
            help - get list of commands;
            exit - stop application;
            """;
    private static final String COMMANDS = """
            Available actions:
            1 -> To sort treasures by name and print list;
            2 -> To sort treasures by ID and print list;
            3 -> To sort treasures by price and print list;
            4 -> Print list of treasures with total cost is greater then or equal to the given number;
            5 -> Get the most expensive treasure;
            """;


    public void greet() {
        System.out.println("Hello, this application allows to proceed information about dragon's treasures");
    }

    public void getData(TreasureFromFileReader treasureFromFileReader) {
        System.out.printf("Have you already had info about treasures at file '%s' and would like to use it? \n(Y/N) ",
                TreasureFromFileReader.FILE_PATH + TreasureFromFileReader.FILE_NAME);
        String data = scanner.nextLine().strip();
        if (data.equalsIgnoreCase("exit")) {
            System.exit(0);
        }
        if (data.equalsIgnoreCase("y")) {
            if (treasureFromFileReader.getTreasuresFromFile()) {
                System.out.println("Your data was loaded successfully");
                return;
            } else {
                System.out.println("We have to generate new info about treasures");
            }
        }
        TreasuresGenerator.generate();
        treasureFromFileReader.getTreasuresFromFile();
        System.out.printf("We generated new info about treasures at file '%s' and load it to the app\n",
                TreasureFromFileReader.FILE_PATH + TreasureFromFileReader.FILE_NAME);
    }

    public void mainMenu(TreasureService treasureService) {
        System.out.println("You are in the main menu");
        System.out.println(COMMANDS);
        while (true) {
            System.out.println("Please, chose available action "
                    + "(enter the digit from 1 to 5 that stands for the option number)");
            String data = scanner.nextLine().strip();
            switch (data) {
                case "1" -> {
                    System.out.println("The treasure list is sorted by name: ");
                    System.out.println(treasureService.sortByName());
                }
                case "2" -> {
                    System.out.println("The treasure list is sorted by treasure ID: ");
                    System.out.println(treasureService.sortById());
                }
                case "3" -> {
                    System.out.println("The treasure list is sorted by price: ");
                    System.out.println(treasureService.sortByPrice());
                    System.out.printf("Total cost of treasures is: %s USD\n",
                            treasureService.getTotalCost());
                }
                case "4" -> {
                    System.out.println("Please, enter the value");
                    data = scanner.nextLine();
                    double sum;
                    try {
                        sum = Double.parseDouble(data);
                    } catch (NumberFormatException e) {
                        System.out.println("Entered number couldn't be recognized. "
                                + "Please, use numbers in standard US format (dd.dd)");
                        break;
                    }
                    List<Treasure> selectedTreasures = treasureService.getOnCertainSum(sum);
                    System.out.println(selectedTreasures);
                    System.out.printf("Total cost of selected treasures is: %s USD\n",
                            treasureService.getTotalCost(selectedTreasures));
                }
                case "5" -> treasureService.getMostExpensive()
                        .ifPresentOrElse(treasure -> System.out.printf("The most expensive treasure is: %s\n",
                                treasure), () -> System.out.println("The treasury is empty"));
                case "help" -> {
                    System.out.print(HELP);
                    System.out.println(COMMANDS);
                }
                case "exit" -> System.exit(0);
                default -> {
                    System.out.println("The entered command wasn't recognized");
                    System.out.println(HELP);
                }
            }
        }
    }
}
