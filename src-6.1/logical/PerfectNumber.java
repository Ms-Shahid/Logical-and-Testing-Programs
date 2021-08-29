package logical;

import java.util.Scanner;

public class PerfectNumber {

	//main function
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
			System.out.println("Enter a number to check for perfect number : ");
			boolean perfect = isPerfect(num);
			String classname = perfect ? num +" is a Perfect Number" : num +" is not a Perfect Number";
			System.out.println(classname);
			scan.close();
	}
	//logic function
	public static boolean isPerfect(int num){
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0)
				sum =+i;
		}
		if (num==sum)
			return true;
		
		return false;
	}
}
