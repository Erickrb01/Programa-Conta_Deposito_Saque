package application;

import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int number;
		String holder;
		String letter;
		double value;

		System.out.print("Enter acount number: ");
		number = sc.nextInt();
		System.out.print("Enter accountn holder: ");
		holder = sc2.nextLine();
		Account account = new Account(number, holder);

		System.out.print("Is there na initial deposit (y/n)? ");
		letter = sc.next();
		if (letter.equalsIgnoreCase("n")) {
			System.out.print("Enter deposit value: ");
			value = sc.nextDouble();
			account.depositValue(value);
		} else {

			System.out.print("Enter initial deposit value:");
			value = sc.nextDouble();
			account.depositValue(value);
		}

		System.out.println("\nAccount data:\n" + account);

		System.out.print("\nEnter a deposit value: ");
		value = sc.nextDouble();
		account.depositValue(value);
		System.out.println("\nUpdate data:\n"+account);
		
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		account.whithdrawValue(value);
		System.out.println("\nUpdate data:\n"+account);
		sc.close();
	}

}
