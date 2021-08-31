package testing;

import java.util.Scanner;

public class dayOfWeek {

	public static void main(String[] args) {
		System.out.println("Enter 0 to 6 for days \t 1 to 12 for months");

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter day : ");
		int day = scan.nextInt();

		System.out.print("\nEnter month : ");
		int month = scan.nextInt();

		System.out.print("\nEnter year : ");
		int year = scan.nextInt();

		System.out.print("Day Number: " + Week(day, month, year));
		scan.close();
	}

	public static String Week(int m, int d, int y) {
		// calculations
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		Integer d0 = (d + x + (31 * m0) / 12) % 7;

		switch (d0) {
		case 0:
			System.out.println("\nDay is Sunday");
			break;
		case 1:
			System.out.println("\nDay is Monday");
			break;
		case 2:
			System.out.println("\nDay is Tuesday");
			break;
		case 3:
			System.out.println("\nDay is Wednesday");
			break;
		case 4:
			System.out.println("\nDay is Thursday");
			break;
		case 5:
			System.out.println("\nDay is Friday");
			break;
		default:
			System.out.println("\nDay is Saturday");
			break;
		}
		return d0.toString();
	}
}
