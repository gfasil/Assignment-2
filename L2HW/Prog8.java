package L2HW;




public class Prog8 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int input[]= {2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};
		System.out.printf("the minimum value from the given array is %d",min(input));
	}
	static int min(int a[]) 
	{
		int min=a[0];
		
		for(int i=1;i<a.length;i++) 
		{
			
			
			if(a[i]<min) min=a[i];
		}
		
		
		return min;
	}

}
