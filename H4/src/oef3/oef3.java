package oef3;

import java.util.Scanner;

public class oef3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);

		int totalePrijs;

		System.out.println("Hoeveel wilt u kopen?");
		int aantal = keyboard.nextInt();

		System.out.println("Hoeveel kost het per stuk?");
		int prijsPerEenheid = keyboard.nextInt();

		totalePrijs = aantal * prijsPerEenheid;

		if (totalePrijs >= 1000) {
			System.out.println("U krijgt 22 euro koting.");
			totalePrijs -= 22;
		} else if (totalePrijs >= 500) {
			System.out.println("U krijgt 10 euro koting.");
			totalePrijs -= 10;
		}

		System.out.println("U moet " + totalePrijs + " euro betalen.");

		keyboard.close();
	}

}
