package com.test;

import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the cricketer name: ");
        String batsman = scanner.nextLine();

        System.out.print("Enter the stadium: ");
        String stadium = scanner.nextLine();

        System.out.print("Enter the total runs scored by " + batsman + " at " + stadium + ": ");
        int runs = scanner.nextInt();

        // Instantiate CricketRunsScored
        CricketRunsScored cricketRuns = new CricketRunsScored(batsman, stadium, runs);

        // Print report
        cricketRuns.printReport();
    }
}
