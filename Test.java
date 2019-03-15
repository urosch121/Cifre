package kurs;

import java.util.Scanner;

public class Test 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("n: ");
		int n = in.nextInt();
		int s = 0; // suma brojeva cija maksimalna cifra je manja od 5
		
		for(int i = 0; i < n; i++)
		{
			System.out.print("x: ");
			int x = in.nextInt();
			
			// da nadjemo maksimalnu cifru broja x
			int tx = x;
			int maxc = -1;
			
			while(x != 0)
			{
				int c = x % 10;
				x = x / 10;
				if(c > maxc)
					maxc = c;
				
				System.out.println("maxc = " + maxc);
				System.out.println("x = " + x);
			}
			
			x = tx;
			if(maxc < 5)
				s += x;		
		}
		
		System.out.println("s = " + s);
	}

}
