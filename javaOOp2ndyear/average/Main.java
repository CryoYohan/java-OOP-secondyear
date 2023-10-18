package average;

import java.util.Scanner;

public class Main {
    
    //FIRST FUNCTION
    public static double computeAverageScore(double[] scores) {
        if (scores.length != 5) {
            return -1; // Return -1 indicates an error
        }
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / 5;
    }

   //SECOND FUNCTION
    public static double computeDiscountedPrice(double originalPrice, double discountPercentage) {
        if (discountPercentage < 0 || discountPercentage > 100) {
            return -1; // Return -1 indicates an error
        }
        double discountAmount = (originalPrice * discountPercentage) / 100;
        return originalPrice - discountAmount;
    }

    public static double getValidInput(Scanner scanner, String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                if (value >= 0) {
                    return value;
                }
            }
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.nextLine(); // Clear the input buffer
        }
    }

    
    //MAIN
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test computeAverageScore function
        double[] examScores = new double[5];
        for (int i = 0; i < 5; i++) {
            examScores[i] = getValidInput(scanner, "Enter score for Exam " + (i + 1) + ": ");
        }
        double averageScore = computeAverageScore(examScores);
        if (averageScore != -1) {
            System.out.printf("Average Score: %.2f",averageScore);
        } else {
            System.out.println("Invalid input for average score calculation.");
        }

        // Test computeDiscountedPrice function
        double originalPrice = getValidInput(scanner, "\nEnter the original price: ");
        double discountPercentage = getValidInput(scanner, "Enter the discount percentage: ");
        double discountedPrice = computeDiscountedPrice(originalPrice, discountPercentage);
        if (discountedPrice != -1) {
            System.out.printf("Discounted Price: %.2f", discountedPrice);
        } else {
            System.out.println("Invalid input for discounted price calculation.");
        }


    }

}