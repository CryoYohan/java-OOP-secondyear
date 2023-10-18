package scannerPractice;
import java.util.Scanner;

public class ScannerPracDemo extends ScannerPrac {
	ScannerPrac getCredentials = new ScannerPrac();
	
	public static void main(String[]args) {
		ScannerPracDemo object = new ScannerPracDemo();
		object.logIn();
		
	}
	public void logIn() {
		int choice = 0;
		do {
		System.out.println("1.] REGISTER || 2.] LOG-IN || 3.] EXIT");
		try {
			choice = sc.nextInt();
			sc.nextLine();
		} catch(Exception e) {
			System.out.println("Error!");
			sc.nextLine();
		}
		
		switch(choice) {
		case 1:
			System.out.println("REGISTER:\nEnter username: ");
			String userName = sc.next();
			System.out.println("Enter password: ");
			String userPass = sc.next();
			getCredentials = new ScannerPrac(userName, userPass);
			System.out.println("User Registered!");
			break;
			
		case 2:
			System.out.println("LOG-IN:\nEnter username: ");
			String usernameInput = sc.next();
			System.out.println("Enter password: ");
			String userpassInput = sc.next();
			if(usernameInput.equals(getCredentials.getUsername()) && userpassInput.equals(getCredentials.getUserPass())) {
				System.out.println("Login Successful!");
				menu();							
			}
			else {
				System.out.println("User does not exist! New account? Register now by pressing 1.]");
			}
			break;
			
		case 3:
			System.out.println("Program closing...");
			System.exit(0);
			break;
			
		
		}
		}while(choice!=3);
	}
	
	public void menu() {
		ScannerPrac user = new ScannerPrac();
		int choose = 0;
		do {
			System.out.println("----------JOLLIBEE APP----------\n\nWelcome " + getCredentials.getUsername() + "\n");
			try {
				System.out.println("WHICH WOULD YOU LIKE TO CHOOSE:\n1.] MEALS || 2.] DRINKS || 3.] DESSERT 4.] ADD-ONS 5.] CHECKOUT 6.] BACK TO MENU 7.] EXIT");
				choose = sc.nextInt();
				
					switch(choose) {
					
					case 1:
						displayMeals(choose);
						break;
					case 2:
						displayMeals(choose);
						break;
						
					case 3:
						displayMeals(choose);
						break;
						
					case 4:
						displayMeals(choose);
						break;
						
					case 5:
						checkOut();
						break;
					case 6:
						logIn();
						break;
						
					case 7:
						System.out.println("Exiting Program...");
						System.exit(0);
						break;
						
					default:
						System.out.println("Invalid input");
						break;
					}
			}catch(Exception e) {
				System.out.println("Invalid input! Please try again!\n");
				sc.nextLine();
			}
		}while(choose!=7);
	}
	
	public void displayMeals(int choose) {
		int order;
		String choice = "";
		do {		
		System.out.println("ITEM NUMBER:\tMEALS:\t\tPRICE: ");
		for(int i = 0; i < meals.length; i ++) {
			System.out.println("#" +(i+1) + "\t\t" + arrayOfFood[choose-1][i] + "\t" + arrayOfPrices[choose-1][i]);
		}
		
		System.out.println("Enter order number: ");
		order = sc.nextInt();	
		System.out.println("Quantity: ");
		foodQuantity.add(qty = sc.nextInt());
		foodCart.add(arrayOfFood[choose-1][order-1]);
		priceCart.add(arrayOfPrices[choose-1][order-1]);
		
		sc.nextLine();
		System.out.println("Is that all?(YES/NO)");
		choice = sc.nextLine();
		}while(!choice.equalsIgnoreCase("yes"));
		System.out.println("You have ordered:");
		for(int i = 0; i < foodCart.size(); i++) {
			System.out.println("MEAL: " + foodCart.get(i) + "\tPRICE: " + priceCart.get(i) + "\tQUANTITY: " + foodQuantity.get(i));
		}
		System.out.println();
	}
	
	public void checkOut() {
		System.out.println("----------JOLLIBEE CHECKOUT----------\nHere are you orders:\nMeals:\t\tPrice:\tQuantity:\n");
		for(int i = 0; i < foodCart.size(); i++) {
			System.out.println(foodCart.get(i) + "\tx" + foodQuantity.get(i) + "\tPHP " + priceCart.get(i));
		}
		computeTotalPrice();
		sc.nextLine();
		System.out.println("Proceed to Checkout? (YES/NO)");
		String choice = sc.nextLine();
		if(choice.equalsIgnoreCase("yes")) {
			System.out.println("THANK YOU FOR PURCHASING!");
			System.exit(0);
		}
		else if(choice.equalsIgnoreCase("no")) {
			System.out.println("Returning to Menu...");
		}
		else {
			System.out.println("Invalid input! Please enter (YES/NO)");
		}
		
	}
	
	public void computeTotalPrice() {
		double result =0;
		for(int i = 0; i < priceCart.size(); i++) {
			result+= priceCart.get(i) * foodQuantity.get(i);
		}
		System.out.printf("\n-----------------------------------\nTOTAL PRICE:\t\tPHP %.2f", result);
		System.out.println();
	}
}
