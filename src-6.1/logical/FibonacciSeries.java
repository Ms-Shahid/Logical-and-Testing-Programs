package logical;
import java.util.Scanner;

public class FibonacciSeries {
		public static void main(String[] args) {
		
			display();
		}
		public static void display() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter number of terms to generate fibonnaci series : ");
			int n = scan.nextInt();
			int sum = 0;
			System.out.print("Fibonnci Series of " + n + " terms are ");
			
			for(int count=1;count<=n;count++)
			{
				System.out.print(" " + Fib(sum));
				sum++;
			}
			scan.close();
		}
		public static int Fib(int num) {
			
			if (num <= 1) 
			{
				return num;
			}
			else 
			{
				return Fib(num-1) + Fib(num-2);
			}	
		}
}


