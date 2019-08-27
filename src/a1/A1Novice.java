package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int numberOfCustomers = scan.nextInt();
		for (int i = 0; i < numberOfCustomers; i++) { //go through every costumer.
			String firstName = scan.next();
			String lastName = scan.next();
			int numberOfGoods = scan.nextInt();
			double sum = 0;
			for (int j = 0; j < numberOfGoods; j++) { //go through every single good
				int number = scan.nextInt();
				scan.next();
				double price = scan.nextDouble();
				sum += number * price; // sum the total price
			}
			System.out.println(firstName.substring(0, 1) + ". " + lastName + ": " + String.format("%.2f", sum)); //output bills
		}
		scan.close();
	}
}
