import java.util.*;

public class MenuBasedMultiplicativeInverse {
	
	
	public static int multiplicativeInverse(int a, int m)
    {
        for (int x = 1; x < m; x++)if (((a%m) * (x%m)) % m == 1)return x;
        return 1;
    }
    
     // Additive Inverse   
    public static int AdditiveInverse(int a, int m)
    {
        return m-a;
         
    }
    
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	int t;
    	int i=1;
    	System.out.println("Enter number of test cases: ");
   	 	t= sc.nextInt();
         
         do{
        	 System.out.println("Test Case Number: "+i++);
        	 System.out.println("Enter First Number");
        	 int num1 = sc.nextInt();
             System.out.print("Enter second number:");
             int num2 = sc.nextInt();

             System.out.print("Enter symbol ");
             char operator = sc.next().charAt(0);
             
             System.out.println("Enter Mod Value");
             int mod=sc.nextInt();
             t--;
             double output;
         
         switch(operator)
         {
             case '+':
             	output = (num1 + num2)%mod;
                 break;

             case '-':
             	output = (num1 - num2)%mod;
                 break;

             case '*':
             	output = (num1%mod * num2%mod)%mod;
                 break;

             case '/':
             	output = num1%mod / num2%mod;
                 break;

             /* If user enters any other operator or char apart from
              * +, -, * and /, then display an error message to user
              * 
              */
             default:
                 System.out.printf("You have entered wrong operator");
                 return;
         }
         System.out.println("Value is "+output);
         }while(t>0);
         sc.close();

	}

}
