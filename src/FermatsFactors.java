
public class FermatsFactors {
    //Function to find the value of a and b which returns a+b and a-b
	public static void FermatFactors(int n)
	{	
		if(n <= 0){   //checking odd or no
			System.out.print(n);
			return;
		}	
		if((n & 1) == 0){		// checking if n is an even number
			System.out.print( n / 2.0 + "," + 2 );
			return;
		}
			
		int a = (int)Math.ceil(Math.sqrt(n)) ;
		// if n is a perfect root,
		// then both its square roots are its factors
		if(a * a == n)
		{
			System.out.print(a + "," + a );
			return;
		}
		int b;
		while(true)
		{
			int b1 = a * a - n ;
			b = (int)(Math.sqrt(b1)) ;
			
			if(b * b == b1)
				break;
			else
				a += 1;
		}
		System.out.print((a - b) +"," + (a + b));
		return;
	}
	public static void main (String[] args)
	{
		FermatFactors(127);
	}
}
