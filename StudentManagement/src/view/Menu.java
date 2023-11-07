package view;

import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);

    public int displayMenu(String[] options, String prompt) {
        System.out.println("--------- Menu ---------");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        System.out.println("-----------------------");

        int choice;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                System.out.print("Vui lòng nhập một số: ");
                scanner.next();
            }
            choice = scanner.nextInt();
        } while (choice < 1 || choice > options.length);

        return choice;
    }
}
