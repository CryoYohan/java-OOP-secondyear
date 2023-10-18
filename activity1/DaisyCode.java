package activity1;

import java.util.Scanner;

public class DaisyCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test countCharacters method
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        countCharacters(inputString);

        // Test validPassword method
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        boolean isValid = validPassword(password);

        if (isValid) {
            System.out.println("VALID PASSWORD");
        } else {
            System.out.println("INVALID PASSWORD");
        }

        scanner.close();
    }

    public static void countCharacters(String str) {
        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int numberCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                lowercaseCount++;
            } else if (ch >= 'A' && ch <= 'Z') {
                uppercaseCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            }
        }

        System.out.println("No. of lowercase: " + lowercaseCount);
        System.out.println("No. of uppercase: " + uppercaseCount);
        System.out.println("No. of numbers: " + numberCount);
    }

    public static boolean validPassword(String password) {
        if (password.length() < 10) {
            return false;
        }

        boolean hasSpecialChar = false;
        boolean hasNumber = false;
        boolean hasUppercase = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                hasUppercase = true;
            } else if (ch >= '0' && ch <= '9') {
                hasNumber = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecialChar = true;
            }
        }

        return hasSpecialChar && hasNumber && hasUppercase;
    }
}
