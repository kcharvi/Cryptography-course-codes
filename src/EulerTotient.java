import java.util.*;
public class EulerTotient {
	// Function to return GCD of a and b
	public static int gcd(int a, int b)
	{
		if (a == 0)return b;
		return gcd(b % a, a);
	}
	// A simple method to evaluate
	// Euler Totient Function
	public static int phi(int n)
	{
		int result = 1;
		for (int i = 2; i < n; i++)
			if (gcd(i, n) == 1)result++;
		return result;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter test cases: ");
		int t=sc.nextInt();
		for (int i = 0; i<t; i++) {
			System.out.println("Enter n : ");
			int n=sc.nextInt();
			System.out.println("phi(" + n + ") = " + phi(n));
		}
        sc.close();

	}
}