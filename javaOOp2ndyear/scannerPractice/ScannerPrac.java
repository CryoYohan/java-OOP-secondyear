package scannerPractice;
import java.util.ArrayList;
import java.util.Scanner;
public class ScannerPrac {
	private String userName, userPass;
	Scanner sc = new Scanner(System.in);
	// FoodCart Array
	protected ArrayList<String> foodCart = new ArrayList<String>();	
	protected ArrayList<Double> priceCart = new ArrayList<Double>();
	protected ArrayList<Integer> foodQuantity = new ArrayList<Integer>();
	// Jollibee Meals
	protected String meals[] = {"Chicken Joy ", "Burger Steak", "Spaghetti  "};
	protected final double mealsPrice[] = {109.00,89.00,98.00};
	// Jollibee Drinks
	String drinks[] = {"Coke        ", "Iced Tea    ", "Pineapple  "};
	protected final double drinksPrice[] = {45.00,45.00,45.00};
	// Desserts
	protected String desserts[] = {"Coke Float  ", "Sundae      ", "Mango Pie   "};
	protected final double dessertsPrice[] = {55.00,45.00, 35.00};
	// Add-ons
	protected String addOns[] = {"Fries       ", "Rice        ", "Tuna Pie    "};
	protected double addOnsPrice[] = {35.00, 30.00, 35.00};
	//
	//Array of Products; Array of Arrays
	protected String arrayOfFood[][] = {meals,drinks, desserts, addOns};
	protected double arrayOfPrices[][] = {mealsPrice,drinksPrice,dessertsPrice,addOnsPrice};
	//
	// Dollar Value
	final double US_DOLLAR = 56.89;
	// Initialize variables for storing orders
	String meal;
	double price;
	int qty;
	
	// Empty constructor to call methods
	ScannerPrac(){
		
	}
	// Constructor for user name and password initialization
	ScannerPrac(String userName, String userPass){
		this.userName = userName;
		this.userPass = userPass;
	}
	// Constructor for shopping cart
	ScannerPrac(String meal, double price, int qty){
		this.meal = meal;
		this.price = price;
		this.qty = qty;
	}
	public String getMeal() {
		return meal;
	}
	public double getPrice() {
		return price;
	}
	public int getQty() {
		return qty;
	}
	public String getUsername() {
		return userName;
	}
	public String getUserPass() {
		return userPass;
	}	

}
