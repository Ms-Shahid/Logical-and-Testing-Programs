package logical;

public class CouponCodes {

	public static void main(String[] args) {
		
		generateRandom();
	}
	
	public static void generateRandom() {
		
		char[] code="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		int max = 100000000;
		int randomNumber = (int) (Math.random()*max);
		StringBuffer sb = new StringBuffer();
		
		while(randomNumber > 0) {
			sb.append(code[randomNumber % code.length]);
			randomNumber /= code.length;
		}
		String couponCode=sb.toString();
		System.out.println("Generated Coupon Code: "+couponCode);
	}
}
