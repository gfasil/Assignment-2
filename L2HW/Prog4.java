package L2HW;

import java.util.Scanner;

public class Prog4 
{
	static void reverseString(String inp) {
		
		for(int i=inp.length()-1;i>=0;i--) 
		{
		
			System.out.print(inp.charAt(i)); // reverse the order of the characters starting from the last one
		
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Please type in the input");// to accept the input
		String input=s.nextLine();
		reverseString(input);
		s.close();
	}

}
