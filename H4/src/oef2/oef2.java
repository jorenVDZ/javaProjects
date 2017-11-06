package oef2;

import java.util.Scanner;

public class oef2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);

		int kleinsteGetal;
		int grootsteGetal;
		int verschil;
		int vijfvoud;

		System.out.println("Vul getal1 in");
		int getal1 = keyboard.nextInt();

		System.out.println("Vul getal2 in");
		int getal2 = keyboard.nextInt();

		if (getal1 < getal2) {
			kleinsteGetal = getal1;
			grootsteGetal = getal2;
		} else {
			kleinsteGetal = getal2;
			grootsteGetal = getal1;
		}

		verschil = grootsteGetal - kleinsteGetal;
		vijfvoud = verschil * 5;

		System.out.println(grootsteGetal + " - " + kleinsteGetal + " = " + verschil);
		System.out.println(verschil + " x " + "5 = " + vijfvoud);

		keyboard.close();
	}

}
