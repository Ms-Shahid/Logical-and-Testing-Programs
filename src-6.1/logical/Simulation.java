package logical;

import java.util.Scanner;

public class Simulation {

	static double start =0,stop = 0;

	//main function
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1 to start = ");
		scan.next();
		startTime();
		System.out.print("\nEnter 0 to stop = ");
		scan.next();
		stopTime();
		elapsedTime();
		scan.close();
	}

	//logic functions
	static void startTime() {
		start = System.currentTimeMillis();
		System.out.println("started at : " + start);
	}

	static void stopTime() {
		stop = System.currentTimeMillis();
		System.out.println("stopped at : " + stop);
	}

	static void elapsedTime() {
		System.out.println("\nElapsed time is " + (stop - start) / 1000);
	}
}
