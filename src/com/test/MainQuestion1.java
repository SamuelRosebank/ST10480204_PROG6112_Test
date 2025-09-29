package com.test;

import java.util.Scanner;

public class CricketApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Batsmen
        String[] batsmen = {"Jacques Kallis", "Hashim Amla", "AB de Villiers"};

        // Stadiums
        String[] stadiums = {"Kingsmead", "St George", "Wanderers"};

        // 2D Array [batsman][stadium]
        int[][] runs = new int[batsmen.length][stadiums.length];

        System.out.println("SA CRICKET APPLICATION");
        System.out.println("------------------------------------------------------------------------");

        // Input runs for each batsman at each stadium
        for (int j = 0; j < stadiums.length; j++) {
            for (int i = 0; i < batsmen.length; i++) {
                System.out.print("Enter the number of runs scored by " + batsmen[i] + " at " + stadiums[j] + ": ");
                runs[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        // ---- Report ----
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("RUNS SCORED REPORT");
        System.out.println("-----------------------------------------------------------------------------");

        // Display batsman totals at each stadium
        for (int i = 0; i < batsmen.length; i++) {
            int totalRuns = 0;
            for (int j = 0; j < stadiums.length; j++) {
                System.out.println(batsmen[i] + " runs scored at " + stadiums[j] + ": " + runs[i][j]);
                totalRuns += runs[i][j];
            }
            System.out.println("Total runs by " + batsmen[i] + ": " + totalRuns);
            System.out.println("----------------------------------");
        }

        // ---- Total runs per stadium ----
        System.out.println("\nTotal RUNS at STADIUMS");
        System.out.println("----------------------------------");
        int[] stadiumTotals = new int[stadiums.length];
        for (int j = 0; j < stadiums.length; j++) {
            for (int i = 0; i < batsmen.length; i++) {
                stadiumTotals[j] += runs[i][j];
            }
            System.out.println(stadiums[j].toUpperCase() + " : " + stadiumTotals[j]);
        }

        // ---- Highest runs per stadium ----
        System.out.println("\nHighest Runs per Stadium");
        System.out.println("----------------------------------");
        for (int j = 0; j < stadiums.length; j++) {
            int maxRuns = runs[0][j];
            String topBatsman = batsmen[0];
            for (int i = 1; i < batsmen.length; i++) {
                if (runs[i][j] > maxRuns) {
                    maxRuns = runs[i][j];
                    topBatsman = batsmen[i];
                }
            }
            System.out.println(stadiums[j] + " : " + topBatsman + " (" + maxRuns + " runs)");
        }

        // ---- Stadium with most runs ----
        int maxStadiumRuns = stadiumTotals[0];
        String topStadium = stadiums[0];
        for (int j = 1; j < stadiums.length; j++) {
            if (stadiumTotals[j] > maxStadiumRuns) {
                maxStadiumRuns = stadiumTotals[j];
                topStadium = stadiums[j];
            }
        }
        System.out.println("\nSTADIUM with the most runs: " + topStadium.toUpperCase());

        scanner.close();
    }
}
