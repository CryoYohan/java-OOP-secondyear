package scannerPractice;

import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int scores, originalPrice, discountedPrice, discount;
	static int numbers = 0;
	public static void main(String[] args) {
		System.out.printf("Average: %.2f",computeAverageScore());
		System.out.printf("Discounted Price: %.2f", computeDiscountedPrice());
	}
	
	// First Method
	public static float computeAverageScore() {
		String input;		
		 Scanner sc = new Scanner(System.in);
	        int numbers = 0;
	        
	        for (int i = 0; i < 5; i++) {
	            try {
	                boolean validInput = false;
	                
	                while (!validInput) {
	                    System.out.print("Enter Exam score #" + (i + 1) + ": ");
	                    input = sc.nextLine();

	                    try {
	                        int scores = Integer.parseInt(input);
	                        numbers += scores;
	                        validInput = true; // Exit the loop if input is a valid integer
	                    } catch (NumberFormatException e) {
	                        System.out.println("Invalid input. Please enter an integer.");
	                    }
	                }
	            } catch (Exception e) {
	                System.out.println("Invalid input");
	                sc.nextLine();
	            }
	        }
	        float result = ((float) numbers / 5);
			return result;
	}
	// Second Method
	public static float computeDiscountedPrice() {
		String input;
		try {
		
			boolean validInput = false;
			while(!validInput) {
				System.out.println("\nEnter original price: ");
				input = sc.nextLine();
				try {
					originalPrice = Integer.parseInt(input);
					validInput = true;
				}catch(NumberFormatException e ) {
					System.out.println("Invalid input! Please enter a digit.");
				}
			}
			
		}catch(Exception e) {
			System.out.println("Invalid input!");
		}
		
		try {
			
			boolean validInput = false;
			
			while(!validInput) {
				System.out.println("Enter discount: ");
				input = sc.nextLine();
				try {
					discount = Integer.parseInt(input);
					validInput = true;
				}catch(NumberFormatException e) {
					System.out.println("Invalid input! Please enter a valid number.");
				}
			}
		}catch(Exception e) {
			System.out.println("Invalid input");
		}
		
		
		float percentageDiscount = (float)((float)discount * 0.01);
		float result = originalPrice - (originalPrice*percentageDiscount);
		return result;
	}

}
