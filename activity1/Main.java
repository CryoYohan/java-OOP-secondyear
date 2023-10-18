package activity1;
import java.util.Scanner;

public class Main {

    static int solvedNumber = 0;
    static String equation;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter equation: ");
        equation = sc.nextLine().replaceAll("\\s", ""); // Remove spaces
        int result = evaluateExpression(equation);
        System.out.println("Result: " + result);
    }

    public static int evaluateExpression(String expression) {
        int solvedNumber = 0;
        String operators = "+-/*";
        String operatorToUse = "";
        String foundNumber = "";

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(') {
                System.out.println("Open parenthesis detected");
            }

            // Parse complete numbers
            if (Character.isDigit(ch)) {
                foundNumber += ch;
            } else {
                if (!foundNumber.isEmpty()) {
                    int number = Integer.parseInt(foundNumber);
                    if (solvedNumber == 0) {
                        solvedNumber = number;
                    } else {
                        solvedNumber = pMDAS(solvedNumber, operatorToUse, number);
                    }
                    foundNumber = "";
                }

                // Detect Operators
                for (int j = 0; j < operators.length(); j++) {
                    if (ch == operators.charAt(j)) {
                        operatorToUse = String.valueOf(ch);
                        System.out.println("Operator Found -> " + operatorToUse);
                    }
                }
            }

            // If closing parenthesis is detected or i == equation.length() - 1, start solving
            if (ch == ')' || i == expression.length() - 1) {
                System.out.println("Closing parenthesis detected or end of the line! Start solving!");
                System.out.println("Solved number: " + solvedNumber);

                if (!foundNumber.isEmpty()) {
                    int number = Integer.parseInt(foundNumber);
                    solvedNumber = pMDAS(solvedNumber, operatorToUse, number);
                }
            }
        }
        return solvedNumber;
    }

    public static int pMDAS(int num1, String operator, int num2) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid Operator: " + operator);
        }
    }
}