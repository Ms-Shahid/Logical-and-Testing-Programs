package testing;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Principal Amount : ");
		int P = scan.nextInt();
		
		System.out.print("\nEnter year : ");
		int Y = scan.nextInt();
		
		System.out.print("\nEnter Rate of Interest: ");
		int R = scan.nextInt();
		scan.close();
		
		double payment = monthlyPayment(P,Y,R);
		System.out.println("The Compound Interest is: "+ payment);
	}
	public static double monthlyPayment(double P, double Y, double R) {
		int n = (int) (12 * Y);
		double r = R / (12*100);
		
		double payment = (P*r)/(1- Math.pow((1+r),-n));
		return payment;
	}
}
