package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int numberOfGoods = scan.nextInt(); //length of the shopping list
		String[] shoppingList = new String[numberOfGoods]; //list
		double[] prices = new double[numberOfGoods]; //prices of each item in order
		String firstName = null;
		String lastName = null;
		int number = 0; // number of each good they bought
		
		double max = 0;
		double min = 9999999;
		double sum = 0;
		double temp = 0;
		int numberBought = 0; // number of each item they bought
		String name = null; // name of each item
		
		String recentMaxFirstName = null;
		String recentMaxLastName = null;
		
		String recentMinFirstName = null;
		String recentMinLastName = null;
		
		double average = 0;
		
		for (int i = 0; i < numberOfGoods; i++) { //put names and prices into the shopping list
			shoppingList[i] = scan.next();
			prices[i] = scan.nextDouble();
			
		}
		
		String[] costumers = new String[scan.nextInt()]; 
		for (int i = 0; i < costumers.length; i++) { // put costumers into an array.
			firstName = scan.next();
			lastName = scan.next();
			number = scan.nextInt(); // number of total kinds of goods he/she bought
			
			temp = 0; // clean the temp data every time
			for (int j = 0; j < number; j++) { //go through every item 
				numberBought = scan.nextInt();
				name = scan.next();
				for (int a = 0; a < numberOfGoods; a++) { // find the index of the goods in the shopping list
					if (shoppingList[a].equals(name)) {
						temp += prices[a] * numberBought;
						break; //stop the loop once find the item in the shopping list
					}
				}
			}
			sum += temp;
			if (temp > max) {
				max = temp;
				recentMaxFirstName = firstName;
				recentMaxLastName = lastName;
			}
			if (temp <= min) {
				min = temp;
				recentMinFirstName = firstName;
				recentMinLastName = lastName;
			}
			
		}
		scan.close();
		average = sum / costumers.length;
		System.out.println("Biggest: " + recentMaxFirstName + " " + recentMaxLastName + " (" + String.format("%.2f", max) + ")");
		System.out.println("Smallest: " + recentMinFirstName + " " + recentMinLastName + " (" + String.format("%.2f", min) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
	}
}
