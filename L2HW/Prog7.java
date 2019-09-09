package L2HW;

public class Prog7 {
	public static void main(String[] args) 
	{
		
		
		int count=0;
		for(int i = 0; i < args.length; ++i) 
		{  
			System.out.printf("length for position %d : %-3s \n",i,args[i].length());
			if(args[i].startsWith("A")) count++;
			
		}
		System.out.printf("number of arguments that start with A is %d \n",count);
	}
      
}
