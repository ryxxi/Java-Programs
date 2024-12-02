import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;
import java.security.SecureRandom;

public class Checkout {

	private String customerName;
	private Scanner input = new Scanner(System.in);
	private Date date = new Date();
	private ArrayList<String> items = new ArrayList<>();
	private ArrayList<Double> priceOfItems = new ArrayList<>();
	private ArrayList<Integer> quantityOfItems = new ArrayList<>();
	private SecureRandom random = new SecureRandom();
	private double VAT = 0.175;

	public Checkout(String customerName) {

		this.customerName = customerName;

	}

	public String getCustomerName() {

		return customerName;

	}

	public void processItems() {

		items.add(getItem());

		priceOfItems.add(getItemCost());

		itemCount++;

		checkForMoreItems();	

	}

	public double checkout() {

		getPurchaseInfo();

		System.out.println("How much did the customer pay?");
		double payment = input.nextDouble();
		isEnough(payment);
		getReceipt(isEnough(payment));

		return payment;

	}
	

	public String getItem() {

		System.out.println("What did you purchase?");
		String item = input.nextLine();

		return item;

	}

	public double getItemCost() {

		System.out.println("How many units did you purchase?");
		int quantity = input.nextInt();
		input.nextLine();

		quantityOfItems.add(quantity);

		System.out.println("Enter the price of 1 unit");
		double singlePrice = input.nextDouble();
		input.nextLine();

		double totalItemPrice = quantity * singlePrice;

		return totalItemPrice;

	}

	public void checkForMoreItems() {

		System.out.println("Do you have more items to checkout?(Y/N)");
		String userResponse = input.nextLine();

		switch (userResponse.toLowerCase()) {

			case "y":
				processItems();
				break;

			case "n":
				checkout();
				break;

			default:
				System.out.print("Invalid input\n");
				checkForMoreItems();

		}

	}

	public void getStoreInfo() {

		System.out.print(
			"SEMICOLON STORES\n" +
			"MAIN BRANCH\n" +
			"Loc: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS\n" +
			"Tel: 07458236943\n" +
			"Date: " + date + "\n" +
			"Customer: " + getCustomerName()
		);

	}

	public void printDoubleBars() {

		for (int i = 0; i < 50; i++) System.out.print("=");
		System.out.println("\n");

	}

	public void printSingleBars() {

		for (int i = 0; i < 50; i++) System.out.print("-");
		System.out.println("\n");

	}

	public void printHeader() {

		System.out.println("\tItem\tQty\tPrice\tTotal\n");

	}

	public String getItemPurchased(int i) {

		return items.get(i);

	}

	public int getItemQuantity(int i) {

		return quantityOfItems.get(i);

	}

	public double getItemTotal(int i) {

		return priceOfItems.get(i);

	}

	public double getSubtotal() {

		double subtotal = 0;

		for (int i = 0; i < priceOfItems.size(); i++) {
			subtotal += priceOfItems.get(i);
		}

		return subtotal;

	}

	public int getDiscount(double subtotal) {

		double discount = 0;

		discount = random.nextDouble() * (0.35 * subtotal);

		return (int) discount;

	}
	
	public double getVAT(double subtotal) {

		double vat = 0;

		vat = subtotal * VAT;

		return vat;

	}

	public double getTotal() {

		double total = 0;

		double subtotal = getSubtotal();
		double discount = getDiscount(subtotal);
		double vat = getVAT(subtotal);

		total = (subtotal - discount) + vat;

		return total;

	}

	public boolean isEnough(double payment) {

		boolean isEnough = false;

		if (payment > getTotal()) isEnough = true;

		return isEnough;

	}

	public void getPurchaseInfo() {

		getStoreInfo();
		System.out.println();
		printDoubleBars();
		printHeader();
		printSingleBars();

		for (int i = 0; i < items.size(); i++) {

			System.out.print("\t" + getItemPurchased(i) + "\t" + getItemQuantity(i) + "\t" + (int) getItemTotal(i)/getItemQuantity(i) + "\t" + getItemTotal(i));
			System.out.println("\n");

		}

		printSingleBars();
		
		System.out.println("\t\tSubtotal:" + getSubtotal() + "\n");
		System.out.println("\t\tDiscount:" + getDiscount(getSubtotal()) + "\n");
		System.out.println("\t\tVAT:" + getVAT(getSubtotal()) + "\n");

		printDoubleBars();

		System.out.println("\t\tTotal: " + getTotal() + " \n");
	
		printDoubleBars();

		System.out.println("\t\tKindly pay: " + getTotal() + "\n");

		printDoubleBars();
		printDoubleBars();

	}

	public void getPurchaseInfoMinusPayment() {

		getStoreInfo();
		System.out.println();
		printDoubleBars();
		printHeader();
		printSingleBars();

		for (int i = 0; i < items.size(); i++) {

			System.out.print("\t" + getItemPurchased(i) + "\t" + getItemQuantity(i) + "\t" + (int) getItemTotal(i)/getItemQuantity(i) + "\t" + getItemTotal(i));
			System.out.println("\n");

		}

		printSingleBars();
		
		System.out.println("\t\tSubtotal:" + getSubtotal() + "\n");
		System.out.println("\t\tDiscount:" + getDiscount(getSubtotal()) + "\n");
		System.out.println("\t\tVAT:" + getVAT(getSubtotal()) + "\n");

		printDoubleBars();

		System.out.println("\t\tTotal: " + getTotal() + " \n");
	
		printDoubleBars();
		printDoubleBars();

	}

	public void getReceipt(boolean isEnough) {

		if (isEnough) {

			getPurchaseInfoMinusPayment();
			System.out.println("Thank you for your patronage");
			printDoubleBars();

		}

		else {

			System.out.println("Insufficient Payment");
			checkout();

		}

	}

}




























































			

			
			