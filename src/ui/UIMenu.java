package ui;

import java.util.Scanner;

public class UIMenu {

    public static void showMenu() {
        System.out.println("Welcome to My Appointments");
        System.out.println("Select an option");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 1:
                    response = 0;
                    System.out.println("Doctor");
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Thank you for your visit");
                    break;
                default:
                    System.out.println("Please select a correct option");
            }
        } while (response != 0);
    }

    static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("::Book an appointment");
                    response = 0;
                    break;
                case 2:
                    System.out.println("::My appointments");
                    response = 0;
                    break;
                case 0:
                    showMenu();
                    break;
                default:
                    System.out.println("Please select a correct option");
            }
        } while (response != 0);
    }
}
