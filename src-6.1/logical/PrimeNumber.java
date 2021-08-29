package logical;

import java.util.Scanner;

public class PrimeNumber {

	//main function
	public static void main(String[] args) {
		System.out.println("Enter number ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		isPrime(n);
		scan.close();
	}
	
	//logic function
	public static void isPrime(int num) {
		boolean flag = false;
		
		for(int i=2;i<num;i++) 
		{
			if(num%i==0) {
				flag=true;
				break;
			}
		}
		String s = (!flag) ?  num + " is a prime number" : num + " is not a prime number";
		System.out.println(s);
		}	
	}

