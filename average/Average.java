package average;
import java.util.Scanner;
public class Average {
	static Scanner sc = new Scanner(System.in);
	static int originalPrice, discountedPrice, discount;
	static int numbers = 0;
	public static void main(String[] args) {
		System.out.printf("Average: %.2f",getAverage());
		System.out.printf("Discounted Price: %.2f", getDiscountedPrice());
	}
	
	// First Method
	public static float getAverage() {
		String input;		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			try {
				boolean validInput = false;
				
				while(!validInput) {
					System.out.println("Enter exam score #" + (i+1) + ": ");
					input = sc.nextLine();
					try {
						int scores = Integer.parseInt(input);
						numbers+= scores;
						validInput = true; // breaks loop
					}catch(NumberFormatException e) {
						System.out.println("Enter exam score #" + (i+1) + ": ");
						input = sc.nextLine();
					}
				}
				
			}catch(Exception e) {
				System.out.println("Invalid input");
				sc.nextLine();
			}
			
		}
		float average = numbers / 5;
		return average;
	       
	}
	// Second Method
	public static float getDiscountedPrice() {
		 try {
             boolean validInput = false;
             
             while (!validInput) {
            	 System.out.println("\nEnter the original price: ");
         		 String input = sc.nextLine();

                 try {
                     originalPrice = Integer.parseInt(input);
                     validInput = true; // Exit the loop if input is a valid integer
                 } catch (NumberFormatException e) {
                     System.out.println("Invalid input. Please enter an integer.");
                 }
             }
         } catch (Exception e) {
             System.out.println("Invalid input");
             sc.nextLine();
         }
		
		 try {
             boolean validInput = false;
             
             while (!validInput) {
            	 System.out.println("Enter discount: ");
         		 String inputDiscount = sc.nextLine();	

                 try {
                     discount = Integer.parseInt(inputDiscount);
                     validInput = true; // Exit the loop if input is a valid integer
                 } catch (NumberFormatException e) {
                     System.out.println("Invalid input. Please enter an integer.");
                 }
             }
         } catch (Exception e) {
             System.out.println("Invalid input");
             sc.nextLine();
         }
		
		
		float percentageDiscount = (float)((float)discount * 0.01);
		float result = originalPrice - (originalPrice*percentageDiscount);
		return result;
	}

}
