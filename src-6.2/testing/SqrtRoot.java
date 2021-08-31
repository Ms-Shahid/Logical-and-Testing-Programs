package testing;
import java.util.Scanner;

public class SqrtRoot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number to compute Square root: ");
		double sqrt = scan.nextDouble();
		System.out.println("Square root is " + calculateSqrt(sqrt));
		scan.close();
	}
	public static double calculateSqrt(double c) {
		
		double t=c;
		double epsilon = 1e-15;
		while ((Math.abs(t-c/t)) > epsilon * t) {
			t = (c / t + t)/2;
		}
		
		return t;
	}
}
