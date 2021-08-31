package testing;

import java.util.Scanner;

public class VendingMachine {

	static int i = 0, total = 0;
	static int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };
	static int amount;

	public static int calNotes(int value) {
		if (value / notes[i] != 0) {
			total += (value / notes[i]);
			System.out.println(notes[i] + " Rs notes :" + value / notes[i]);
			value = value % notes[i];
		}
		i++;
		if (value == 0) {
			System.out.println("");
			System.out.println("Total Number of notes :" + total);
			return amount;
		}
		return calNotes(value);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Amount :");
		int amt = scan.nextInt();
		calNotes(amt);
		scan.close();
	}
}
