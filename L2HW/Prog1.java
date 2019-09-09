package L2HW;

public class Prog1 {
	public static void main(String args[]) {
		
		final double  pi=Math.PI;
		int x= RandomNumbers.getRandomInt(1, 9);
		int y= RandomNumbers.getRandomInt(3, 14);
		System.out.println("pi power of x ="+ Math.pow(pi, x));
		System.out.println("y power of pi = "+ Math.pow(y,pi));
		
	}
}
