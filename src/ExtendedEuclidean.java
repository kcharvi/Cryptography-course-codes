import java.util.*;
public class ExtendedEuclidean {
//GCD
	public static int gcd(int a, int b)
    {
        if (a == 0)return b;
        return gcd(b%a, a);
    }
 // Multiplicative Inverse   
    public static int multiplicativeInverse(int a, int m)
    {
        for (int x = 1; x < m; x++)if(((a%m) * (x%m)) % m == 1)return x;
        return 1;
    }
    
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Two Numbers");
    	int Charvi=sc.nextInt();
    	System.out.println("First Number: "+Charvi);
    	
    	int K=sc.nextInt();
    	System.out.println("Second Number: "+K);
    	
    	System.out.println("GCD of First and Second Number is "+ gcd(Charvi,K));
    	System.out.println("MultiplicativeInverse of First and Second Number is "+multiplicativeInverse(Charvi,K));
        sc.close();

	}
}
