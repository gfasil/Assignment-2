package L2HW;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] random = new int[4][4];
		String blank = "_____";
		for(int i=0; i<4;i++)
		{
			for(int j=0; j<4;j++)
			{
				random[i][j]= RandomNumbers.getRandomInt(1, 99);
				if(i%2==0) 
				{
					System.out.printf("%10d",random[i][j]);
				}
				else 
				{
				
					System.out.printf("%+10d",random[i][j]);
				}
			}
			if(i%2!=0)
			{ 
				System.out.println();
				for(int k=0; k<4;k++)
				{
					
					System.out.printf("%10s",blank);
				}
				System.out.printf("%n%n%n");
			}
			System.out.println();
		}
	}

}
