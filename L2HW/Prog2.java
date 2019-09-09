package L2HW;

public class Prog2 {
	public static void main(String args[]) {
		
		float x=1.27f;
		float y= 3.881f;
		float z= 9.6f;
		int sum1 =(int)(x+y+z);
		int sum2=Math.round((x+y+z));
		System.out.println("Sum of number using casting = "+sum1);
		System.out.println("Sum of number using rounding = "+sum2);
		
	}
}
