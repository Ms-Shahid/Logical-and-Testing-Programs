package testing;
import java.util.Scanner;

public class DecimaltoBinary {

	public static int[] toBinary(int num) {
		
		String concat = "";
		while (num != 0) {
			concat = (num%2) + concat;
			num /= 2;
		}
		
		while (concat.length() % 4 != 0) {
			concat = 0 + concat;
		}
		return stringToIntArray(concat);
	}
	
	public static int[] stringToIntArray(String bin) {
		int[] binary = new int[bin.length()];
		for (int i = 0; i < binary.length; i++) {
			binary[i] = bin.charAt(i) - 48;
		}
		return binary;
	}
	
	static void showArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		int[] binary =toBinary(s.nextInt());
		System.out.println("binary representation is: ");
		showArr(binary);
		s.close();
	}

	
}
