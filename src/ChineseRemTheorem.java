public class ChineseRemTheorem {
	// Returns modulo inverse of A
	// with respect to M using extended
	public static int inv(int a, int m)
	{
		int m0 = m, t, q;
		int x0 = 0, x1 = 1;
		if (m == 1)
			return 0;
		// Applying extended Euclid Algorithm
		while (a > 1) {
			q = a / m;// q is quotient
			t = m;    // m is remainder
			m = a % m;
			a = t;
			t = x0;
			x0 = x1 - q * x0;
			x1 = t;
		}
		// Make x1 positive
		if (x1 < 0)x1 += m0;
		return x1;
	}
    //Numbers in num[] are pairwise
	// coprime (gcd for every pair is 1)
	static int findMinX(int num[], int rem[], int k)
	{
		// Compute product of all numbers
		int prod = 1;
		for (int i = 0; i < k; i++)
			prod *= num[i];
		System.out.println("Product of m1, m2, m3 = " + prod);
		int result = 0;
		for (int i = 0; i < k; i++) {
			int pp = prod / num[i];
			System.out.println("Value of M"+(i+1)+" "+pp);
			result += rem[i] * inv(pp, num[i]) * pp;
		}
		return result % prod;
	}
	public static void main(String args[])
	{
		int num[] = { 5, 7, 9, 11 };
		int rem[] = { 1, 2, 3, 4 };
		int k = num.length;
		System.out.println("X is " + findMinX(num, rem, k));
	}
}