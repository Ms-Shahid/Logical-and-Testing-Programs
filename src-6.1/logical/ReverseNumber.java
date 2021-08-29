package logical;

import java.util.Scanner;

public class ReverseNumber {

	//main function
	public static void main(String[] args) {
		
		System.out.println("Enter Number to get a reverse of it : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		isReverse(n);
		scan.close();
	}

	//logic function 
	public static void isReverse(int num) {
		int reversed=0;
		int temp=num;
		while(num!=0) 
		{
			int rem = num % 10;
			reversed = reversed * 10 + rem;
			num = num/10;
		}
		System.out.println("Reverse of " + temp + " is "+reversed);
	}
}