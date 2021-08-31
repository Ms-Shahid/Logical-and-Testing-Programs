package testing;

import java.util.Scanner;

public class TemparatureConversion {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the temperature in Fahrenheit: ");
		float fah = scan.nextFloat();

		System.out.print("\nEnter the temperature in Celsius: ");
		float celsius = scan.nextFloat();

		System.out.println("\nTemperature in celsius is: " + fahrenheitConvert(fah));
		System.out.println("Temperature in fahrenheit is: " + celsiusConvert(celsius));

		scan.close();
	}

	public static float fahrenheitConvert(float fah) {
		float celsius = (fah - 32) * 5 / 9;
		return celsius;
	}

	public static float celsiusConvert(float c) {
		float fah = (c * 9 / 5) + 32;
		return fah;
	}
}
