import java.util.*;
public class DeterministicPrimalityTest {
	public static double MillsConst= 1.30637788386308069;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of n: ");
		int n=sc.nextInt();
		double val= Math.pow(3, n);
		System.out.println("Value of 3^n : " +val);
		double val2= Math.pow(MillsConst,val);
		System.out.println("Theta power 3^n:  " + val2);
		System.out.println("Floor Value of: " +  Math.floor(val2) + "  is:  "+ "\n"+ (int)Math.floor(val2)+" and definately a prime");
        sc.close();

	}
}
