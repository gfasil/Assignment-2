package L2HW;

import java.util.Arrays;

public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		removeDup(new String[] {"horse", "dog", "cat", "hors","dog"});
	}
	static void removeDup(String input[]) {
		int x=input.length;
		String temp[]=new String[x];
		int dup=0;
		for(int i=0;i<x;i++) 
		{
			boolean isdup=false;
			for(int j=0;j<x;j++)
			{
				if(input[i]==temp[j]) 
				{
					dup++;
					isdup=true;
					break;
				}
			}
			
			if(isdup==false) 
			{
			temp[i]=input[i];
			}
			
		}
		
		int count=x-dup;
		String distinct[]=new String[count];
		
		for(int i=0,j=0;i<count;i++,j++) 
		{
			if(temp[i]==null) j++;
			distinct[i]=temp[j];
			
		}
		System.out.println(Arrays.toString(distinct));
	}

}
