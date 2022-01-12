//public class Fermats {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value of a: ");
//		int a=sc.nextInt();
//		System.out.println("Enter the value of m: ");
//		int m=sc.nextInt();
//		modInverse(a, m);
//	}
//	// Fermat’s test for checking primality, the more iterations the more is accuracy /
//	public static int gcd(int a, int b){			
//		if(b == 0)return a;
//		else return gcd(b, a % b);
//	}
//	// To compute x^y under modulo m
//	public static int power(int x,int y,int m){
//		if (y == 0)return 1;
//		int p = power(x, y / 2, m) % m;
//		p = (p * p) % m;	
//		return (y % 2 == 0) ? p : (x * p) % m;
//	}
//	// Function to find modular
//	// inverse of a under modulo m
//	// Assumption: m is prime
//	public static void modInverse(int a, int m)
//	{
//		if (gcd(a, m) != 1)System.out.print("Inverse doesn't exist");
//		else System.out.print("Modular multiplicative inverse is "+power(a, m - 2, m));
//		// If a and m are relatively prime, then
//		// modulo inverse is a^(m-2) mode m
//	}
//}
import java.util.Scanner;
import java.util.Random;
public class Fermats{
    // Function to check if prime or not 
    public boolean isPrime(long n, int iteration)
    {
    	if (n == 0 || n == 1)
            return false;
        if (n == 2)
            return true;
        /** an even number other than 2 is composite **/
        if (n % 2 == 0)
            return false;
        Random rand = new Random();
        for (int i = 0; i < iteration; i++){
            long r = Math.abs(rand.nextLong());            
            long a = r % (n - 1) + 1;
            if (modPow(a, n - 1, n) != 1)
                return false;
        }
        return true;        
    }
    /** Function to calculate (a ^ b) % c **/
    public long modPow(long a, long b, long c){
        long res = 1;
        for (int i = 0; i < b; i++){
            res *= a;
            res %= c; 
        }
        return res % c;
    }    
    /** Main function **/
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Primality Algorithm Test\n");
        Fermats fp = new Fermats();
        System.out.println("Enter number:\n");
        long num = scan.nextLong();
        System.out.println("\nEnter number of iterations");
        int k = scan.nextInt();
        boolean prime = fp.isPrime(num, k);
        if (prime)
            System.out.println("\n"+ num +" is prime");
        else
            System.out.println("\n"+ num +" is composite"); 
        
        scan.close();
    }
}
