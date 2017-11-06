package oef1;

import java.util.Scanner;

public class oef1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);

		int prijsKind = 28;
		int prijsVolwassen = 15;
		int totalePrijs;

		System.out.println("How many adults?");
		int aantalKinderen = keyboard.nextInt();

		System.out.println("How many children");
		int aantalVolwassene = keyboard.nextInt();

		totalePrijs = (aantalKinderen * prijsKind) + (aantalVolwassene * prijsVolwassen);

		System.out.println("You have to pay " + totalePrijs + " euros.");

		keyboard.close();
	}

}
