package a1;

import java.util.Scanner;


public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int numberOfItems = scan.nextInt();
		String[] shoppingList = new String[numberOfItems];
		for (int i = 0; i < numberOfItems; i++) {
			shoppingList[i] = scan.next();
			scan.nextDouble();
		}
		int[] itemNumber = new int[numberOfItems];// the number of kinds of items they bought in the list
		int numberOfCostumers = scan.nextInt();
		int number = 0; // the number of kinds of items they bought
		int numberBought = 0; //the number of each item they bought
		int[] customersNumber = new int[numberOfItems]; //get the total number of customers who bought certain item in the list.
		String name = null;
		boolean ifAdd = false;
		for (int i = 0; i < numberOfCostumers; i ++) {
			scan.next();
			scan.next();
			number = scan.nextInt();
			
			for (int j = 0; j < number; j++) {
				numberBought = scan.nextInt();
				name = scan.next();
				for (int a = 0; a < numberOfItems; a++) { // find the index of the goods in the shopping list
					if (shoppingList[a].equals(name)) {
						itemNumber[a] += numberBought;
						ifAdd = true;
						break; //stop the loop once find the item in the shopping list
					}
				}
			}
		}
		scan.close();
		for (int i = 0; i < numberOfItems; i++) {
			if (customersNumber[i] == 0) {
				System.out.println("No customers bought " + shoppingList[i]);
			} else {
				System.out.println(customersNumber[i] + " customers bought " + itemNumber[i] + " " + shoppingList[i]);
			}
		}
		
	}
}
